package XpathSection2FullPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlingSelectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.opencart.com/");
	    driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[text()='Register'])[2]")).click();
		WebElement element=driver.findElement(By.xpath("//select[@name='country_id']"));
		element.click();
		Select s=new Select(element);
		s.selectByIndex(1);
	//	s.selectByValue("2");
	//	s.selectByVisibleText("Argentina");
		

	}

}
