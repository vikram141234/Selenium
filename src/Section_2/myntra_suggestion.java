package Section_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra_suggestion {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.myntra.com/");
       driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Headphones");
       Thread.sleep(3000);
       List<WebElement> headphones=driver.findElements(By.xpath("//div[@style='left: -40px; top: 40px;']")
    		   );
       Thread.sleep(3000);
       for(WebElement earphones:headphones)
    	   System.out.println(earphones.getText());

	}

}
