package FramePopupHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FramePractice1 {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[.='Frames']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//span[.='Alert']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		String Header=driver.findElement(By.xpath("//h2[@title='Interface Alert']")).getTagName();
		System.out.println(Header);

	}

}
