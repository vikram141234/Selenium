package Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessInstagramLoginPENDING {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("8686184458");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vikram1412");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();       
		
		

	}

}
