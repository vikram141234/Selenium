package sECTION2fULLpRACTICESuggestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUpActiTime {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.cssSelector("div[id='container_tasks']")).click();
		driver.findElement(By.xpath("(//div[@class='checkbox inactive'])[1]")).click();
		driver.findElement(By.xpath("(//div[text()='Delete'])[1]")).click();
		String msg=driver.findElement(By.xpath("//div[text()='You are about to delete 61 tasks']")).getText();
        System.out.println(msg);
        driver.close();
		
		
	}

}
