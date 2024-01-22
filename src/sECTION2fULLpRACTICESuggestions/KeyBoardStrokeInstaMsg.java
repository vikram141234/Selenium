package sECTION2fULLpRACTICESuggestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardStrokeInstaMsg {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("8686184458",Keys.TAB,"vikram1412",Keys.ENTER);
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("8686184458",Keys.TAB,"vikram1412",Keys.ENTER);
		driver.findElement(By.xpath("//button[@class='_a9-- _a9_1']")).click();
		driver.findElement(By.xpath("(//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abcj _abcm'])[6]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Nani']")).click();
		for(int sendKeys=1;sendKeys<=1000;sendKeys++)
		driver.findElement(By.xpath("//textarea[@placeholder='Message...']")).sendKeys("Hi",Keys.ENTER);
		
		
	}

}
