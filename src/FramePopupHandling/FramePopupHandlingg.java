package FramePopupHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePopupHandlingg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		driver.findElement(By.xpath("(//a[text()='Frames'])[1]")).click();
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='org.openqa.selenium.bidi'])[1]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("(//span[text()='HasBiDi'])[1]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		String s=driver.findElement(By.xpath("//h2[text()='Interface HasBiDi']")).getText();
		System.out.println(s);

	}

}
