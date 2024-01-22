package Keyboard_stroke_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessActiTimeByKeysClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "V:\\Selenium WorkSpace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.ENTER);
		
	}

}
