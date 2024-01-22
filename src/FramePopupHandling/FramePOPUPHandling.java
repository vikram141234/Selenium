package FramePopupHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FramePOPUPHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[text()='Frames'])[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Alert']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//h2[text()='Interface Alert']")).getText();
		System.out.println(text);
//		driver.close();

	}

}
