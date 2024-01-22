package Auto1doubtFbSpecialPopup;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeMaximizeDimensionRelocation {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "V:\\\\Selenium WorkSpace\\\\chromedriver.exe");
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://www.actitime.com/");
     Thread.sleep(3000);
     driver.manage().window().maximize();
     Dimension d=new Dimension(300,500);
     driver.manage().window().setSize(d);
     driver.manage().window().setPosition(new Point(300,400));
     Thread.sleep(3000);
     driver.close();

	}

}
