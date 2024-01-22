package PottiDoubts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrintProdNamesAndPrices {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung m11 mobiles",Keys.ENTER);
		List<WebElement>pname= driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement>pprice=driver.findElements(By.xpath("//div[@class='a-row a-size-base a-color-base']"));
		for(int i=1;i<pname.size()-1;i++)
		{
			System.out.println(pname.get(i).getText()+"----->"+pprice.get(i).getText());
		}

	}

}
