package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AccessActitimeLoginTaskAddnewNewCustomerSoOnPENDING {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
//	   System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
	   ChromeDriver driver= new ChromeDriver(option);
	   driver.get("https://demo.actitime.com/login.do");
	   driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[text()='Login ']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[@class='content tasks']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[text()='Add New']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Vikram");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("Description");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[@class='dropdownButton']"));
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	   Thread.sleep(2000);
       String actualname=driver.findElement(By.xpath("//div[text()='Vikram']")).getText();
       String expectedname="Vikram";
       System.out.println(actualname);
       
       if(actualname.equals(expectedname))
    	   System.out.println("Created Successfully");
       else
    	   System.out.println("Not Created Successfully");
       
	   

	}

} 
