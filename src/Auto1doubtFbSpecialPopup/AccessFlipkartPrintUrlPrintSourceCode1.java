package Auto1doubtFbSpecialPopup;

import org.openqa.selenium.chrome.ChromeDriver;

public class AccessFlipkartPrintUrlPrintSourceCode1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String url=driver.getCurrentUrl();
		System.out.println("URL is:"+url);
		String sourcecode=driver.getPageSource();
		System.out.println(sourcecode);

	}

}
