package Section_2_ScrollDown_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollDownYoutubeJavaScript {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.youtube.com/");
	   
	    WebElement ele=driver.findElement(By.name("search_query"));
	    ele.sendKeys("gvc");
	    ele.submit();
	    Thread.sleep(2000);
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,2000);");
	    driver.findElement(By.xpath("(//img[@style='background-color: transparent;'])[7]")).click();
	}

}


