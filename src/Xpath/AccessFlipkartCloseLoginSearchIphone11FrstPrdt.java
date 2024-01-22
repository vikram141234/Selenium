package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessFlipkartCloseLoginSearchIphone11FrstPrdt {

	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
	   ChromeDriver driver= new ChromeDriver();
	   driver.get("https://www.flipkart.com/");
	   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	   driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iphone11");
	   driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 128 GB)']")).click();
	  // driver.quit();

	}

}
