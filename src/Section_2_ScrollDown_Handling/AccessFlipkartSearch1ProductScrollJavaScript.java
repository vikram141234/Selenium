package Section_2_ScrollDown_Handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AccessFlipkartSearch1ProductScrollJavaScript {

	public static void main(String[] args) throws AWTException, InterruptedException {
		  ChromeOptions option=new ChromeOptions();
		  option.addArguments("--remote-allow-origins=*");
		  
		  System.setProperty("webdriver.chrome.driver", "V:\\New Chrome Drivers\\chromedriver.exe");
		  
          WebDriver driver=new ChromeDriver(option);
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          driver.get("https://www.flipkart.com/");
          driver.findElement(By.xpath("//button[text()='✕']")).click();
          WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
          element.sendKeys("iphone 11");
          element.submit();
          Thread.sleep(2000);
          JavascriptExecutor jse=(JavascriptExecutor) driver;
          jse.executeScript("window.scrollBy(0,2000);");
          
          

	}

}
