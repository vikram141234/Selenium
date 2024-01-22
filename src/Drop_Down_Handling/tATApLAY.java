package Drop_Down_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tATApLAY {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.tataplay.com/my-account/login");
        driver.findElement(By.xpath("//a[text()='Click here']")).click();
        WebElement element=driver.findElement(By.xpath("//main[@role='main']/div/div/div[2]/form/div/div/div/div/label"));
        Thread.sleep(2000);
        element.sendKeys("VikramNani",Keys.TAB,"Vikram@1412",Keys.TAB,"Vikram@1412",Keys.TAB,"vikramnani1412@gmail.com",Keys.TAB,"8686184458",Keys.ENTER);
        
	}

}
