package sECTION2fULLpRACTICESuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestionsGoogle {

	public static void main(String[] args) throws Exception {
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//div[@class='mkHrUc']"));
	    WebElement element=driver.findElement(By.xpath("//input[@class='gLFyf']"));
	    element.click();
	    List<WebElement>sugs=driver.findElements(By.xpath("//div[@class='mkHrUc']"));
	    for(WebElement sug:sugs)
	    {
	    	System.out.println(sug.getText());
	    }

	}

}
