package OpenUrlInNewTab;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGooglePageInNewTab {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("GVC",Keys.ENTER);
		String tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.xpath("//body[@jsmodel='hspDDf']")).sendKeys(tab);
		
		
		

	}

}
