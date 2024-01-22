package XpathBackwardHovermsgDiffMethodsMsgAnirudhaSir;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Messenger {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webelement.chrome.element","V:\\Selenium WorkSpace\\chromedriver.ex e");
		ChromeDriver driver=new ChromeDriver(option);
 		driver.get("https://www.messenger.com/");
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8686184458");
 		WebElement element=driver.findElement(By.xpath("//input[@type='password']"));
 		element.sendKeys("vikram1412");
 		element.submit();
 	    driver.findElement(By.xpath("//span[text()='Smiley Anu']")).click();
 	   for(int i=1;i<=1;i++)
 	   {
 		driver.findElement(By.xpath("//p[@class='xat24cr xdj266r']")).sendKeys("Hello");
 		driver.findElement(By.xpath("//div[@aria-label='Press Enter to send']")).click();
		}

	}

}
