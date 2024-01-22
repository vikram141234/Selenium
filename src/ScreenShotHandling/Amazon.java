package ScreenShotHandling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Amazon {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions o= new ChromeOptions();
		o.addArguments("-remote-allow-origins=*");
		WebDriver d= new ChromeDriver(o);
		d.get("https://www.amazon.in/");
		TakesScreenshot ts=(TakesScreenshot)d;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("V:\\sai\\Amazon.png");
		Files.copy(src, dest);
		d.findElement(By.xpath("srisai")).click();
		
		

	}

}
