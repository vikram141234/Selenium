package sECTION2fULLpRACTICESuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestionsFlipkart {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobiles");
	    Thread.sleep(3000);
	    List<WebElement>sugs=driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']"));
	    for(WebElement sug:sugs)
	    {
	    	System.out.println(sug.getText());
	    }

	}

}
