package Drop_Down_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailDeliting {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S940131762%3A1672893883710432&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AeAAQh7us_5SRrksmpF4A2e0IrtKLFuHys5MQLfOvz_RzAFw1VL7DA5hf9UigXxhkFJIDcV6vNoEmw");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("vikramnani1412@gmail.com",Keys.ENTER);
	}

}
