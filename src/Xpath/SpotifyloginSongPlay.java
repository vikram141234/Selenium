package Xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpotifyloginSongPlay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "V:\\Selenium WorkSpace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://open.spotify.com/");

	}

}
