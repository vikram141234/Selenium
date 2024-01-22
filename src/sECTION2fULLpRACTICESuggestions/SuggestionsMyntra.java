package sECTION2fULLpRACTICESuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestionsMyntra {

	public static void main(String[] args) {
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.myntra.com/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Belts");
	     List<WebElement>sugs=driver.findElements(By.xpath("//div[@class=' desktop-autoSuggest desktop-showContent']"));
	     for(WebElement sug:sugs)
	     {
	    	 System.out.println(sug.getText());
	     }

	}

}
