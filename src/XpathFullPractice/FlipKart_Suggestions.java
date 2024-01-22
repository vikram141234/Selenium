package XpathFullPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart_Suggestions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("puma");
		List<WebElement> puma=driver.findElements(By.xpath("//li[@class='Y5N33s']"));
		for(WebElement pum:puma)
			System.out.println(pum.getText());
		

	}

}
