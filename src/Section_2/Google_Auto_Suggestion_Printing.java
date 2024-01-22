package Section_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Auto_Suggestion_Printing {
	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		  WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		  element.sendKeys("Virat kohli");
		  Thread.sleep(3000);
		  List<WebElement> suggestions=driver.findElements(By.xpath("//div[@class='mkHrUc']"));
		    Thread.sleep(3000);
			for(WebElement store : suggestions)
			{
  //          	String s=store.getText();
  //				System.out.println(s);
				System.out.println(store.getText());
			}
			Thread.sleep(3000);
				
		
	}

}
