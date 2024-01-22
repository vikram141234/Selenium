package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessFlipkartSearchIphone11Print1stPoductName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));//.sendKeys("i phone 11");
		element.sendKeys("i phone 11");
		element.submit();
		Thread.sleep(2000);
		String name=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 128 GB)']")).getText();
		System.out.println(name);
		

	}

}
