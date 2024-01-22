package Xpath;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookPopup {

	public static void main(String[] args) {
		//Create object of HashMap Class
				Map<String, Object> prefs = new HashMap<String, Object>();
		           
		             // Set the notification setting it will override the default setting
				prefs.put("profile.default_content_setting_values.notifications", 2);

		             // Create object of ChromeOption class
				ChromeOptions options = new ChromeOptions();

		             // Set the experimental option
				options.setExperimentalOption("prefs", prefs);

		             // pass the options object in Chrome driver

				WebDriver driver = new ChromeDriver(options);
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8686184458",Keys.TAB,"vikram1412",Keys.ENTER);
		driver.switchTo().alert().getText();
		
		

	}

}

		
		
		
		
		
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--disable-notifications-");
//		WebDriver driver=new ChromeDriver(options);
		