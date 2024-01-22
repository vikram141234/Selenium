package Drop_Down_Handling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandlingAccessOpenCartRegister {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Register'])[2]")).click();
		WebElement element=driver.findElement(By.xpath("//select[@name='country_id']"));
		element.click();
		Thread.sleep(2000);
		Select s=new Select(element);
		s.selectByIndex(26);                        //By Index   
		
//		s.selectByValue("1");                       //By Value
//		s.selectByVisibleText("Afghanistan");       //By VisibleText
		Thread.sleep(3000);
		List<WebElement> elementt=driver.findElements(By.xpath("//select[@name='country_id']"));

//FIRST WAY TO PRINT
	//	for(WebElement allcountries:elementt)
	//		System.out.println(allcountries.getText());
//SECOND WAY TO PRINT
    	Iterator<WebElement> itr=elementt.iterator();
		while(itr.hasNext())
		{
			WebElement allcountries=itr.next();
			System.out.println(allcountries.getText());
  	}

}}
