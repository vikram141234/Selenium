package LocatorsCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessFlipkartSearchIphhone11 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "V:\\Selenium WorkSpace\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("iphone11");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[class='L0Z3Pu']")).click();
        
	}

}
