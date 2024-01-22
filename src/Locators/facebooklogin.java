package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/?stype=lo&jlou=AfcFFzTbtB8r5I5lzCCkfFOIUGx_eTdFvUR9oKu-K2AD1RfxMeKaYkXE7xbfyW3aLrfEcxEAR6gb0se7TRrWWmgbjoFE8puBccyw_HVAVt8NhQ&smuh=26171&lh=Ac_3X-pGGn2dD6toZn0");
     
     driver.findElement(By.id("email")).sendKeys("vikramnani1412@gmail.com");
     Thread.sleep(2000); 
     driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("vikram1412");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	 
	 
	}

}
