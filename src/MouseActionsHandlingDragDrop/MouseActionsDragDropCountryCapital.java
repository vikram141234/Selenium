package MouseActionsHandlingDragDrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDragDropCountryCapital {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions act=new Actions(driver);
       
        Thread.sleep(2000);
        WebElement dragElement=driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
        WebElement dropElement=driver.findElement(By.xpath("//div[text()='United States']"));
        act.dragAndDrop(dragElement,dropElement);
  
        
        WebElement dragOslo=driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
        WebElement dropNorway=driver.findElement(By.xpath("//div[text()='Norway']"));
        act.dragAndDrop(dragOslo,dropNorway);
 
        
        WebElement dragStockholm=driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
        WebElement dropSweden=driver.findElement(By.xpath("//div[text()='Sweden']"));
        act.dragAndDrop(dragStockholm,dropSweden);

        
        WebElement dragRome=driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
        WebElement dropItaly=driver.findElement(By.xpath("//div[text()='Italy']"));
        act.dragAndDrop(dragRome,dropItaly);
     
        
        WebElement dragSeoul=driver.findElement(By.xpath("(//div[text()='Seoul'])[2]"));
        WebElement dropSouthKorea=driver.findElement(By.xpath("//div[text()='South Korea']"));
        act.dragAndDrop(dragSeoul,dropSouthKorea);
    
        
        WebElement dragMadrid=driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
        WebElement dropSpain=driver.findElement(By.xpath("//div[text()='Spain']"));
        act.dragAndDrop(dragMadrid,dropSpain);
 
        
        WebElement dragCopenhagen=driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]"));
        WebElement dropDenmark=driver.findElement(By.xpath("//div[text()='Denmark']"));
        act.dragAndDrop(dragCopenhagen,dropDenmark);
        act.perform();
	}

}
