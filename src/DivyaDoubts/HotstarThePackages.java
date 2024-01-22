package DivyaDoubts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HotstarThePackages {

	public static void main(String[] args) throws Exception {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.hotstar.com/in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("The Package",Keys.ENTER);
        driver.findElement(By.xpath("(//article[@class='ripple show-card normal'])[1]")).click();
        driver.findElement(By.xpath("//div[text()='Watch First Episode']")).click();
        driver.findElement(By.xpath("//span[text()='Next Episode']")).click();
        driver.findElement(By.xpath("//img[@alt='maximize-screen']")).click();
        		
        		
		
		
		
	}

}
