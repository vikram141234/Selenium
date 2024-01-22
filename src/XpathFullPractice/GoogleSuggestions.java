package XpathFullPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("pen");
		Thread.sleep(3000);
		List<WebElement> pen=driver.findElements(By.xpath("//div[@class='mkHrUc']"));
		for(WebElement pens:pen)
		{
          System.out.println(pens.getText());
		}
	}

}
