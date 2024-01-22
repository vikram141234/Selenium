package XpathByStartsWith;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartsWithActitime {

	public static void main(String[] args) {
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.flipkart.com/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.findElement(By.xpath("//button[text()='✕']")).click();
	     driver.findElement(By.xpath("//input[@name='q']")).sendKeys("i phone 11");
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     List<WebElement>pname=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	     List<WebElement>pprice=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	     for(int i=0;i<pname.size();i++)
	     {
	    	 System.out.println(pname.get(i).getText()+"----------->"+pprice.get(i).getText());
	     }
	     
	     
	     

	}

}
