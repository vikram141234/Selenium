package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AccessActitimeLoginATTRIBUTEVALUEVISIBLETEXT {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
		
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		
		
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		Thread.sleep(2000);   //  Not needed
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		Thread.sleep(2000);   //  Not needed
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);   //  Not needed
		driver.close();       //  Not needed

	}

}
