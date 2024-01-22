package FlipKart;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("Iphone 12");
		element.submit();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Blue, 128 GB)']")).click();
		String parentid=driver.getWindowHandle();
		Set<String>childid=driver.getWindowHandles();
		for(String childids:childid)
		{
			if(!parentid.equals(childids))
			{
				driver.switchTo().window(childids);
			}
		}
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
	//	driver.findElement(By.xpath("//div[text()='Remove']")).click();
		driver.findElement(By.xpath("//a[@class='_2Kn22P gBNbID']")).getText();
		
		
		

	}

}
