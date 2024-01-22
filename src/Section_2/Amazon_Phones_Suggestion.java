package Section_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Phones_Suggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement element=driver.findElement(By.xpath("//input[@dir='auto']"));
        element.click();
        element.sendKeys("phones");
        Thread.sleep(2000);
        List<WebElement> s=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
        for(WebElement elements : s)
       	System.out.println(elements.getText());


	}

}
