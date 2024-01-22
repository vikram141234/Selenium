package Auto1doubtFbSpecialPopup;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessActitimeFlipkartBackActitimeForwardFlipkartRefreshClose {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Navigation nav=driver.navigate();
		nav.to("https://www.actitime.com/");
		Thread.sleep(3000);
		nav.to("https://www.flipkart.com/");
		Thread.sleep(3000);
		nav.back();
		Thread.sleep(3000);
		nav.forward();
		Thread.sleep(3000);
		nav.refresh();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
