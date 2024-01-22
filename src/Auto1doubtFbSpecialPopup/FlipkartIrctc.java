package Auto1doubtFbSpecialPopup;

import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIrctc {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.get("https://www.irctc.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(4000);
		driver.close();
		
	}
	
}
