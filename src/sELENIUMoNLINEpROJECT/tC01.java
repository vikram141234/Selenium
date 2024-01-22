package sELENIUMoNLINEpROJECT;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tC01 {

	public static void main(String[] args) throws Exception {
       WebDriver driver=new ChromeDriver();
       driver.get("http://localhost:8888/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
       driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
       driver.findElement(By.xpath("//input[@type='submit']")).click();
       driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();
       driver.findElement(By.xpath("(//select[@id='bas_searchfield'])[1]")).click();
       Robot r=new Robot();
       r.keyPress(KeyEvent.VK_DOWN);
       r.keyRelease(KeyEvent.VK_DOWN);
       r.keyPress(KeyEvent.VK_DOWN);
       r.keyRelease(KeyEvent.VK_DOWN);
       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);
	}

}
