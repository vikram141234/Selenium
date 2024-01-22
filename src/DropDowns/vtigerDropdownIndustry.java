package DropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class vtigerDropdownIndustry {

	public static void main(String[] args) {
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://localhost:8888/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin",Keys.TAB,"admin",Keys.TAB,Keys.ENTER);
	    driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
	    driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	    WebElement element=driver.findElement(By.xpath("//select[@name='industry']"));
	    Select s=new Select(element);
	    s.selectByIndex(3);
	    
	    WebElement element1=driver.findElement(By.xpath("//select[@name='accounttype']"));
	    Select s1=new Select(element1);
	    s1.selectByIndex(4);
//	    WebElement element2=driver.findElement(By.xpath("//select[@name='assigned_user_id']"));
//	    Select s2=new Select(element2);
//	    s2.selectByIndex(1);
	    
	    WebElement element3=driver.findElement(By.name("rating"));
	    Select s3=new Select(element3);
	    s3.selectByVisibleText("Active");
	    
	}

}
