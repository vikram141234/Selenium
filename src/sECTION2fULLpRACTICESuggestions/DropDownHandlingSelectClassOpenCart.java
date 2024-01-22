package sECTION2fULLpRACTICESuggestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlingSelectClassOpenCart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[text()='Register'])[2]")).click();
		WebElement element=driver.findElement(By.xpath("//select[@name='country_id']"));
		element.click();
		Select s=new Select(element);
//		s.selectByVisibleText("Bermuda");                                           //selectByVisibleText
//		s.selectByIndex(10);                                                        //selectByIndex
		s.selectByValue("25");                                                      //selectByValue
		driver.findElement(By.xpath("//select[@name='country_id']")).click();
		

	}

}
