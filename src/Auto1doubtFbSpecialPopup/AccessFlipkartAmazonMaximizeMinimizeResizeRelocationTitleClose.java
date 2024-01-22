package Auto1doubtFbSpecialPopup;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessFlipkartAmazonMaximizeMinimizeResizeRelocationTitleClose {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Dimension d=new Dimension(200,300);
		driver.manage().window().setSize(d);
		Thread.sleep(4000);
		Point p=new Point(200,300);
		driver.manage().window().setPosition(p);
		String title=driver.getTitle();
		Thread.sleep(4000);
		driver.close();
		

	}

}
