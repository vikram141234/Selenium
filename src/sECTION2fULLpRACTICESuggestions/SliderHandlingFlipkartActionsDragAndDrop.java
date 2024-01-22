package sECTION2fULLpRACTICESuggestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SliderHandlingFlipkartActionsDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//button[text()='✕']")))).click();
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("mobiles");
		element.submit();
		Thread.sleep(3000);
		WebElement slider2=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
		WebElement slider1=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider1,30,0).perform();
		Thread.sleep(2000);
		act.dragAndDropBy(slider2,-30,0).perform();

	}

}
