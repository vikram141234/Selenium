package Section_2_ScrollDown_Handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollDownRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.youtube.com/");
	   
	    WebElement ele=driver.findElement(By.name("search_query"));
	    ele.sendKeys("Gundellona Gundellona song telugu");
	    ele.submit();
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    
	    driver.findElement(By.xpath("//a[contains(@title,'|Gundellona|')] ")).click();
	    Thread.sleep(6000);
	    WebElement skip=driver.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']"));
	    if(skip.isEnabled())
	    	skip.click();
	    

	   

	}

}
