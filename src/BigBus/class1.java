package BigBus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbusticket.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		driver.findElement(By.xpath("//div[text()='Origin']")).click();
		
			
				

	}

}
