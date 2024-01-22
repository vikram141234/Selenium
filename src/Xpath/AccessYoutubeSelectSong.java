package Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
public class AccessYoutubeSelectSong {

		public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  Navigation nav=driver.navigate();
		  nav.to("https://www.youtube.com/");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='search']")).sendKeys("telugu video songs");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@class='yt-simple-endpoint style-scope ytd-video-renderer']")).click();
		 
		  

	}

}
