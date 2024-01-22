package Late;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class FlipkartElectronicsGaming {

	public static void main(String[] args) throws InterruptedException {
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Electronics']")).click();
		
		driver.findElement(By.xpath("//a[text()='Gaming']")).click();

	}

}
