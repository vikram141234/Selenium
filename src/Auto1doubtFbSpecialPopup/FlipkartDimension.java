package Auto1doubtFbSpecialPopup;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDimension {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","V:\\\\Selenium WorkSpace\\\\chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 Thread.sleep(2000);
	 Dimension d=new Dimension(300,400);
	 driver.manage().window().setSize(d);
	 Thread.sleep(3000);
	 driver.close();
		

	}

}
