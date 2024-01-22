package sECTION2fULLpRACTICESuggestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardStrokeKeysClass {

	public static void main(String[] args) throws Exception {
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.messenger.com");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8686184458",Keys.TAB,"vikram1412",Keys.TAB,Keys.ENTER);
	    driver.findElement(By.xpath("//span[text()='Suresh Tripuraneni Chowdary']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//p[@class='xat24cr xdj266r']")).sendKeys("Hello",Keys.ENTER);
	    
	    

	}

}
