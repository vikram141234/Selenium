package XpathDiffMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class EpaperLogin {
	WebDriver driver=new ChromeDriver();
	Navigation nav=driver.navigate();
		public void epaper() throws InterruptedException {
			nav.to("https://epaper.eenadu.net/");
			Thread.sleep(2000);
		}
		public void login() throws InterruptedException {
			driver.findElement(By.xpath("//i[@class='fas fa-user']")).click();
			Thread.sleep(2000);
            driver.findElement(By.xpath("//a[text()='Login']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='txtNumber1']")).sendKeys("vikramnani1412@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("vikram1412");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(2000);
		}
		public void navi() throws InterruptedException { 
			driver.findElement(By.xpath("//span[@onclick='NextPage()']")).click();
		}
	public static void main(String[] args) throws InterruptedException {
		EpaperLogin e=new EpaperLogin();
		e.epaper();
		e.login();
		e.navi();
	}
	}
