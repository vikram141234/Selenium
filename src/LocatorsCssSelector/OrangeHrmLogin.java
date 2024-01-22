package LocatorsCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
