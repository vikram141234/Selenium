package XpathSection2FullPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart_Auto_Suggestions_Handling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");//button[text()='✕']
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
		List<WebElement>element=driver.findElements(By.xpath("//li[@class='Y5N33s']"));
		Thread.sleep(3000);
		for(WebElement names:element)
			System.out.println(names.getText());

	}

}
