package Alert_Popup_handling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessActiTimeLoginSettingsTypeOfWorkProvideNameClose {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Raja");
		driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
		Alert alt=driver.switchTo().alert();
		String alertmsg=alt.getText();
		System.out.println(alertmsg);
//		alt.dismiss();

	}

}
