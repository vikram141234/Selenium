package Auto1doubtFbSpecialPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessFacebookLogin {

	public static void main(String[] args) throws Exception {
	   System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
	   ChromeDriver driver=new ChromeDriver();
	   Navigation nav=driver.navigate();
	   nav.to("https://www.facebook.com/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("8686184458");
	  
	   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("vikram1412");
	   
	   driver.findElement(By.xpath("//button[@name='login']")).click();
	
	   driver.findElement(By.xpath("(//span[text()='Not Now'])[2]")).click();
	   Alert alt=driver.switchTo().alert();
	  // alt.dismiss();                                          //Alert Popup doubt
	   String altmsg=alt.getText();
	   System.out.println(altmsg);
	  


	}

}
