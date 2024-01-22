package WindowPopupHandling;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupHandlingByCollection {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("samsung m11");
		element.submit();
		driver.findElement(By.xpath("//div[contains(text(),'SAMSUNG Galaxy M11 (Violet, 6')]")).click();
		String parentid=driver.getWindowHandle();
		Set<String>childid=driver.getWindowHandles();
		Iterator<String>itr=childid.iterator();
		while(itr.hasNext())
		{
			String allid=itr.next();
			String childids=driver.switchTo().window(allid).getTitle();
			if(childids.contains(parentid))
			{
				break;
			}
	
		}

	}

}
