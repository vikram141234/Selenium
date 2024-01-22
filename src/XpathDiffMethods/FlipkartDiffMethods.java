package XpathDiffMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDiffMethods {
	WebDriver driver=new ChromeDriver();
    public void FlipkartOpen() throws Exception {
    	driver.get("https://www.flipkart.com/");
    	Thread.sleep(2000);
    }
    public void LoginCancel() throws Exception {
    	driver.findElement(By.xpath("//button[text()='✕']")).click();
    		Thread.sleep(2000);
    }
    public void SearchSamsungM11() throws Exception {
    	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Samsung m11");
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("//input[@name='q']/../following-sibling::button[1]")).click();
    	Thread.sleep(2000);
    }
    public void print() throws Exception {
    	String Text=driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy M11 (Metallic Blue, 64 GB)']")).getText();
    	System.out.println(Text);
    	Thread.sleep(2000);
    	String Url=driver.getCurrentUrl();
    	System.out.println(Url);
    	Thread.sleep(2000);
    	String title=driver.getTitle();
    	System.out.println(title);
    	Thread.sleep(2000);
    }
    public void Dimensions() throws Exception {
    	Dimension d=new Dimension(300,200);
        driver.manage().window().setSize(d);
        Thread.sleep(3000);
    }
    public void minmax() throws InterruptedException {
    	driver.manage().window().minimize();
    	Thread.sleep(3000);
    	driver.manage().window().maximize();
    	Thread.sleep(5000);
    }
    public void ActiTime() throws InterruptedException {
    	driver.get("https://demo.actitime.com/login.do");
    	Thread.sleep(3000);
    }
    public void Login() throws InterruptedException {
       driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
       Thread.sleep(3000);
 	   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
 	   Thread.sleep(3000);
 	   driver.findElement(By.xpath("//div[text()='Login ']")).click();
 	   Thread.sleep(3000);
 	   driver.findElement(By.xpath("//a[@class='logout']")).click();
 	   Thread.sleep(3000);
    }
    public void H_over() throws InterruptedException {
    	WebElement element=driver.findElement(By.xpath("//input[@title='Do not select if this computer is shared']"));
    	String hover=element.getAttribute("title");
    	System.out.println("H_over msg is:"+hover);
    	Thread.sleep(10000);
    }
//    public void close() throws Exception {
//    	Thread.sleep(3000);
//    	driver.quit();
//    }
	public static void main(String[] args) throws Exception {
		FlipkartDiffMethods flip=new FlipkartDiffMethods();
		flip.FlipkartOpen();
		flip.LoginCancel();
		flip.SearchSamsungM11();
		flip.print();
		flip.Dimensions();
		flip.minmax();
	//	flip.close();
		flip.ActiTime();
		flip.Login();
		flip.H_over();

}
}
