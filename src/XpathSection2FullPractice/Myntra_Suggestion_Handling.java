package XpathSection2FullPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_Suggestion_Handling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shoes");
        List<WebElement>element=driver.findElements(By.xpath("//ul[@class='desktop-group']"));
        for(WebElement names:element)
        	System.out.println(names.getText());
        
	}

}
