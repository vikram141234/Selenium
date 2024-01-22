package Section_2_JavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_ActiTime_using_java_Script {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('username').value='admin';");
		jse.executeScript("document.getElementsByName('pwd')[0].value='manager';");
		jse.executeScript("document.getElementById('loginButton').click();");

	}

}
