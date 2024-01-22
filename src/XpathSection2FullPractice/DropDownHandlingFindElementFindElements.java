package XpathSection2FullPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandlingFindElementFindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[3]/a")).click();
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='CAN - Vacation']")).click();
				
				
	}

}
