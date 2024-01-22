package XpathBackwardHovermsgDiffMethodsMsgAnirudhaSir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaMsgAnirudhaSir {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webelement.chrome.element","V:\\Selenium WorkSpace\\chromedriver.ex e");
		ChromeDriver driver=new ChromeDriver();
 		driver.get("https://www.instagram.com/");
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("8686184458");
 		WebElement element=driver.findElement(By.xpath("//input[@name='password']"));
 		Thread.sleep(1000);
 		element.sendKeys("vikram1412");
 		Thread.sleep(2000);
 		element.submit();
 		Thread.sleep(4000);
 		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
 		driver.findElement(By.xpath("(//div[@class='x9f619 xxk0z11 xvy4d1p x11xpdln xii2z7h x19c4wfv'])[6]")).click();
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//div[text()='Aniruddha Das']")).click();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//div[@class='_acrb']")).click();
 		
 		for(int sendKeys=1;sendKeys<=1;sendKeys++)
 		{
 		driver.findElement(By.xpath("//textarea[@placeholder='Message...']")).sendKeys("Advance Happy NEW YEAR 'ANIRUDH' Sir");
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//button[text()='Send']")).click();
 		}
 		
 		

	}

}
