package Auto1implicit;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessFlipkart4secActitimeCloseBrowser {

	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(4000);
	    driver.get("https://demo.actitime.com/login.do");
	    driver.close();

	}

}
