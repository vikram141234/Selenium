package ScreenShotHandling;


import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class ScreenShotHandling {

	public static void main(String[] args) throws Exception {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "V:\\New Chrome Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.flipkart.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("V:\\New Selenium ScreenShots\\Flipkart2.png");
		Files.copy(src, dest);
		driver.findElement(By.xpath("javamavaselinium")).click();
 
	}

}
