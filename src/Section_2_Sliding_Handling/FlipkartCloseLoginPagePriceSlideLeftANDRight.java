package Section_2_Sliding_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FlipkartCloseLoginPagePriceSlideLeftANDRight {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("i phone 11");
		element.submit();
		Thread.sleep(2000);
		WebElement slide1=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
		WebElement slide2=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(slide1,-30,0).perform();
		Thread.sleep(3000);
		act.dragAndDropBy(slide2,30,0).perform();

	}

}