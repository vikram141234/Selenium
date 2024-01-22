package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessFlipkartCloseLoginSearchIphone11FrstPrdtPricelowtoHigh {

	public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 11");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 128 GB)']")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
