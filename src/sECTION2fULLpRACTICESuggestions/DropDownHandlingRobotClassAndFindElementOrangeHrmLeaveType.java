package sECTION2fULLpRACTICESuggestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandlingRobotClassAndFindElementOrangeHrmLeaveType {

	public static void main(String[] args) throws AWTException, Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Leave']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='-- Select --']")).click();
		driver.findElement(By.xpath("//span[text()='CAN - Personal']")).click();   //findElement
		
		
		
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);                            //Robot class
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
