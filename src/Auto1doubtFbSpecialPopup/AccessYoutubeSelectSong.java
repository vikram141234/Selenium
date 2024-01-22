package Auto1doubtFbSpecialPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessYoutubeSelectSong {

	public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.youtube.com/");
	  driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("telugu video songs");
	  driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
	  driver.findElement(By.cssSelector("a[title='Oh Sita Hey Rama Video Song - Sita Ramam (Telugu) | Dulquer | Vishal | Hanu Raghavapudi']")).click();
	 
	  }

}
