package XpathBackwardHovermsgDiffMethodsMsgAnirudhaSir;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeQuestion {

	public static void main(String[] args) {
		System.setProperty("webelement.chrome.element","V:\\Selenium WorkSpace\\chromedriver.ex e");
	    ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("repeated interview questions");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		driver.findElement(By.xpath("//h3[@id='video-title']")).click();

	}

}
