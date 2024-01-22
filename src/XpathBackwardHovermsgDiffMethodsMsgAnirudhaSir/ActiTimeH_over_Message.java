package XpathBackwardHovermsgDiffMethodsMsgAnirudhaSir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeH_over_Message {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//input[@title='Do not select if this computer is shared']"));
		String s=element.getAttribute("title");
		System.out.println("H_over message is:"+s);
		if(element.isDisplayed())
			System.out.println("H_over msg is Displayed");
		else
			System.out.println("H_over msg is not Displayed");
		
		if(element.isEnabled())
			System.out.println("H_over msg is Enable");
		else
			System.out.println("H_over msg is Disable");
		
		if(element.isSelected())
			System.out.println("H_over msg is Selected");
		else
			System.out.println("H_over msg is Not Selected");

	}}

		


