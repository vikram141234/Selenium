package ExplicitWait_Popup_handling_Hidden_Division;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLoginTaskSelectAllTaskDeletePrntDeleteMsgClose {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
        driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='img'])[1]")).click();
		driver.manage().window().maximize();		
//explicit type
		driver.findElement(By.xpath("//div[@class='delete button']")).click();
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		String msg=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'You are about to delete')]"))).getText();
		System.out.println(msg);
//Normal type		
		driver.findElement(By.xpath("(//div[text()='Delete'])[1]")).click();
		Thread.sleep(3000);
		String msg2=driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]")).getText();
		System.out.println(msg2);
				 
		

	}

}
