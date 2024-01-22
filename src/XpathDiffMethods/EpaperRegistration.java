package XpathDiffMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EpaperRegistration {
	WebDriver driver=new ChromeDriver();
	public void paper() {
		driver.get("https://epaper.eenadu.net/");
	}
	public void register() throws InterruptedException {
		driver.findElement(By.xpath("//i[@class='fas fa-user']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("Vikram");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='emailid']")).sendKeys("vikramnani1412@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='regpass']")).sendKeys("vikram1412");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='confrmPassword']")).sendKeys("vikram1412");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='MobileNumber']")).sendKeys("8686184458");
	    driver.findElement(By.xpath("//input[@id='chkTermsConditions']")).click();
	    driver.findElement(By.xpath("//button[@id='btnRegister']")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		EpaperRegistration e=new EpaperRegistration();
		e.paper();
		e.register();

	}

}
