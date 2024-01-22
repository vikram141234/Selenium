package Auto1implicitCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();

	}

}
