package Auto1doubtFbSpecialPopup;

import org.openqa.selenium.chrome.ChromeDriver;

public class AccessFlipkartAccessActitimeCloseBrowser2 {
 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.get("https://www.actitime.com/");
		driver.close();
	}
}
