package Keyboard_stroke_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_Automation_ {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "V:\\Selenium WorkSpace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("8686184458",Keys.TAB,"vikram1412",Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
	    Thread.sleep(3000);

	}

}
