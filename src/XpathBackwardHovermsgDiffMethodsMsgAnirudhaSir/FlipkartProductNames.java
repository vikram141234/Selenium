package XpathBackwardHovermsgDiffMethodsMsgAnirudhaSir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartProductNames {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webelement.chrome.element","V:\\Selenium WorkSpace\\chromedriver.ex e");
	    ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
	    WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
	    element.sendKeys("i phone 11");
	    element.submit();
	    Thread.sleep(3000);
	    List<WebElement>pnames=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	    List<WebElement>price=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	    Thread.sleep(3000);
	    for(int i=0;i<=pnames.size()-1;i++)
	    	System.out.println(pnames.get(i).getText());
}
}