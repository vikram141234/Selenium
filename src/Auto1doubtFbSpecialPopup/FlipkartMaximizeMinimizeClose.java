package Auto1doubtFbSpecialPopup;

import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMaximizeMinimizeClose {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.flipkart.com/");
       Thread.sleep(4000);
       driver.manage().window().maximize();
       Thread.sleep(3000);
       driver.manage().window().minimize();
       Thread.sleep(3000);
       driver.manage().window().maximize();
       Thread.sleep(4000);
       driver.close();
       
	}

}
