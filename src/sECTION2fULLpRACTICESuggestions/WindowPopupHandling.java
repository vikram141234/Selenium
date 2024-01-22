package sECTION2fULLpRACTICESuggestions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowPopupHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("i phone 11");
		element.submit();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 128 GB)']")).click();
        String parentid=driver.getWindowHandle();
        Set<String>childid=driver.getWindowHandles();
        for(String id:childid)
        {
        	if(!id.equals(parentid))
        	{
        		driver.switchTo().window(id);
        		System.out.println(id);
        	}
        }
        
}//Dwindow-5D07AEB0FD804B4E086C8F7BB1A9D683     !  output
}//CDwindow-77B5FEE0A1BA1A3A71E74D875DE968C9     No ! output

	


