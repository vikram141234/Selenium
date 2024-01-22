package FramePopupHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@class='_3704LK']"));
		element.sendKeys("i phone 11");
		element.submit();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 64 GB)']")).click();
		String parentid=driver.getWindowHandle();
		Set<String> childid=driver.getWindowHandles();
		for(String allid : childid)
		{
			if(!allid.equals(parentid))
            {
				driver.switchTo().window(allid);
				System.out.println(childid);
            }
		
		}	
		String v=driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
		System.out.println(v);
 }
}
		




