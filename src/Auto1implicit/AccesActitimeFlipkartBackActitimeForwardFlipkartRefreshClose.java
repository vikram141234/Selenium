package Auto1implicit;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccesActitimeFlipkartBackActitimeForwardFlipkartRefreshClose {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Navigation nav=driver.navigate();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		nav.to("https://demo.actitime.com/login.do");
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
