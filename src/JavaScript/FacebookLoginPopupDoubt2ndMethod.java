package JavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLoginPopupDoubt2ndMethod {

	public static void main(String[] args) {
		     //To Disable all Extra Options 
		     ChromeOptions options = new ChromeOptions();
			 //options.addArguments("--disable-notifications");-->Sir told
			 options.addArguments("disable-notifications");     //Own
		     
			 
		     options.addArguments("--remote-allow-origins=*");
				
		     WebDriver driver = new ChromeDriver(options);
		     driver.get("https://www.facebook.com/");
		     driver.manage().window().maximize();	
			 JavascriptExecutor jse=(JavascriptExecutor)driver;
			 jse.executeScript("document.getElementsByName('email')[0].value='8686184458';");
			 jse.executeScript("document.getElementsByName('pass')[0].value='vikram1412';");
			 jse.executeScript("document.getElementsByName('login')[0].click();");

	}

}
