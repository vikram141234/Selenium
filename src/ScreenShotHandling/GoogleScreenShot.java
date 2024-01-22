package ScreenShotHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class GoogleScreenShot {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "V:\\New Chrome Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.name("search_query")).sendKeys("Aadhipursh songs");
//		driver.findElement(By.id("search-icon-legacy")).click();
//		driver.findElement(By.xpath("//a[contains(@title,'Ram Siya Ram a')]")).click();
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_PAGE_DOWN);
//		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		//WebElement video=driver.findElement(By.xpath("//div[@class='video-ads ytp-ad-module']"));
//		WebElement skip=driver.findElement(By.xpath("//div[.='Skip Ad']"));
//		Thread.sleep(25000);
//		skip.click();
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File type = ts.getScreenshotAs(OutputType.FILE);
//		File savingfolder=new File("V:\\New Selenium ScreenShots\\Youtube1.png");
//		Files.copy(type,savingfolder);
//		driver.findElement(By.xpath("gvc")).click();

	
	}

}
