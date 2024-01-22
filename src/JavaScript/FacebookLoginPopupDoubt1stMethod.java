package JavaScript;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLoginPopupDoubt1stMethod {

	public static void main(String[] args) throws InterruptedException {
        //Create object of HashMap Class
		Map<String, Object> prefs = new HashMap<String, Object>();   
        //Set the notification setting it will override the default setting
		prefs.put("profile.default_content_setting_values.notifications", 2);
        //Create object of ChromeOption class*/
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		ChromeOptions options = new ChromeOptions();
        //Set the experimental option
		options.setExperimentalOption("prefs", prefs);    
        //passing the object reference in Chrome driver
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();	
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementsByName('email')[0].value='8686184458';");
		jse.executeScript("document.getElementsByName('pass')[0].value='vikram1412';");
		jse.executeScript("document.getElementsByName('login')[0].click();");
		
		
		


	}

}
