package TooltipMsgOrHoverMsg;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipMsgPrinting {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement tooltip = driver.findElement(By.xpath("//input[@title='Do not select if this computer is shared']"));
        String msg=tooltip.getAttribute("title");
        System.out.println(msg);
        
        if(tooltip.isSelected())
        	System.out.println("tooltip Msg is Selected");
        else
        	System.out.println("tooltip Msg is Not Selected");
        
        if(tooltip.isDisplayed())
        	System.out.println("tooltip Msg is Displayed");
        else
        	System.out.println("tooltip Msg is Not Displayed");
      
        if(tooltip.isEnabled())
        	System.out.println("tooltip Msg is Enabled");
        else
        	System.out.println("tooltip Msg is Not Enabled");
	}

}
