package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AccessFlipkartCloseLoginSearchIphone11PrintSearchResult {

		public static void main(String[] args) throws InterruptedException {
			    System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
			    ChromeOptions option=new ChromeOptions();
			    option.addArguments("--remote-allow-origins=*");
				ChromeDriver driver=new ChromeDriver(option); 
				driver.get("https://www.flipkart.com/");
				driver.findElement(By.xpath("//button[text()='✕']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 11");
				
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(3000);
				String result=driver.findElement(By.xpath("//span[@class='_10Ermr']")).getText();
			     System.out.println(result);

	}

}
