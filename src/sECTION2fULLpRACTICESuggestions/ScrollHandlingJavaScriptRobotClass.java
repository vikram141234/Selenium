package sECTION2fULLpRACTICESuggestions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollHandlingJavaScriptRobotClass {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='✕']"))).click();
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("mobiles");
		element.submit();
		driver.manage().window().maximize();
		
//		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,3000);");               //Java Script
		
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		

	}

}
