package WindowPopupHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupHandlingFlipkartParentAndChild {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("toys");
		element.submit();
		driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]")).click();
		//every time element changing how we get frst product name
		String parentid=driver.getWindowHandle();
		Set<String> childids=driver.getWindowHandles();
		Thread.sleep(3000);
		for(String childid:childids)
		{
			if(childid.equals(parentid))
			{
				driver.switchTo().window(childid);
				System.out.println(childids);
			}
		}
	}

}
