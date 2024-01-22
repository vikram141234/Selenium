package XpathInstamsgs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InstaSrikanthBroMsg {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
	
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("8686184458",Keys.TAB,"vikram1412",Keys.TAB,Keys.TAB,Keys.ENTER);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		driver.findElement(By.xpath("(//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abcj _abcm'])[6]")).click();
		driver.findElement(By.xpath("//div[text()='🆂🆁🅸🅺🅰🅽🆃🅷']")).click();
		for(int sendKeys=1;sendKeys<=100;sendKeys++)
		{
		driver.findElement(By.xpath("//textarea[@placeholder='Message...']")).sendKeys("Boom");
		driver.findElement(By.xpath("//button[text()='Send']")).click();

		}
	

	}}
