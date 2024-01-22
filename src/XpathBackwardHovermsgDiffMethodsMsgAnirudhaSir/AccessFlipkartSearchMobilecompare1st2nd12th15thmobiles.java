package XpathBackwardHovermsgDiffMethodsMsgAnirudhaSir;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessFlipkartSearchMobilecompare1st2nd12th15thmobiles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobiles");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
 		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[22]")).click();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[23]")).click();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[33]")).click();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[36]")).click();
 		

	}

}
