package XpathFullPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestionsHandlingAndPrinting {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Kohli");
		List<WebElement> element=driver.findElements(By.xpath("//div[@class='mkHrUc']"));
		Thread.sleep(2000);
		for(WebElement suggestions:element)
			System.out.println(suggestions.getText());

	}

}
