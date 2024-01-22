package XpathBackwardHovermsgDiffMethodsMsgAnirudhaSir;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessAmazonSearchShoesFrstPrdtNameAndPrice {

	public static void main(String[] args) throws Exception {
     System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://www.amazon.com/");
     driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Mens shoes");
     driver.findElement(By.xpath("//input[@type='submit']")).click();
     Thread.sleep(2000);
     String name=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).getText();
     System.out.println(name);
     Thread.sleep(2000);
     String price=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]/../../../following-sibling::div[2]/div[1]/a[1]/span[1]/span[2]/span[2]")).getText();
     System.out.println(price);
     

	}

}
