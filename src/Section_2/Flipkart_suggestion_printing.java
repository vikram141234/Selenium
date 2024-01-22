package Section_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_suggestion_printing {

	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("Shoe");
		Thread.sleep(2000);
		List<WebElement> lst=driver.findElements(By.xpath("//li[@class='Y5N33s']"));
        Thread.sleep(2000);
		for(WebElement elements : lst)
		{
			String s=elements.getText();
			System.out.println(s);
		//	System.out.println(elements.getText());
		}
	}

}
