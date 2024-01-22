package XpathYoutube;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class VideoQualityChangingInYouTube {

	public static void main(String[] args) throws Exception {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		ele.sendKeys("Telugu video songs");
		ele.submit();
		driver.findElement(By.xpath("(//div[@id='meta'])[1]")).click();
	
//		WebElement video=driver.findElement(By.xpath("//video[@class='video-stream html5-main-video']"));
//		WebElement skip=driver.findElement(By.xpath("//div[text()='Skip Ads']"));
//		WebElement dismiss=driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[28]"));
//		WebElement skip=driver.findElement(By.xpath("//div[text()='Skip Ads']"));
//		if(skip.isEnabled())
//		{
//			skip.click();
//		}
//		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='ytp-button ytp-settings-button']")).click();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		

		
		
		

	}
	

}
