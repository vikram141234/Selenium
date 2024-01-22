package XpathBackwardHovermsgDiffMethodsMsgAnirudhaSir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessFlipkartCloseLoginPageSearchIphone11PrntFrstPrdtClose {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webelement.chrome.element","V:\\Selenium WorkSpace\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("i phone 11");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	    String name=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Red, 128 GB)']")).getText();		
		System.out.println(name);
		Thread.sleep(2000);
    	String price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Red, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
    	System.out.println(price);
    	Thread.sleep(2000);
    	System.out.println(name+"-------->"+price);
    	Thread.sleep(3000);
    	driver.quit();
		
	}

}
