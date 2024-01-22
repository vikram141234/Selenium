package XpathBackwardHovermsgDiffMethodsMsgAnirudhaSir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeDiffMethods {
	WebDriver driver;
	public void launchBrowser() {
	  driver=new ChromeDriver();
	  driver.get("https://demo.actitime.com/login.do");
	}
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
	}
	public void clickOnTask() throws Exception {
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		Thread.sleep(2000);
	}
	public void Execution() throws Exception {
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("nani");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("Customer created successfully");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(2000);
	}
	public void delete() throws Exception {
		driver.findElement(By.xpath("(//div[@class='editButton'])[10]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='actionButton'])[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='deleteButton'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
		Thread.sleep(2000);
	}
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		Thread.sleep(10000);
	}
	public void closeBrowser() {
		driver.quit();
	}
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","V:\\Selenium WorkSpace\\chromedriver.exe");
	ActiTimeDiffMethods act=new ActiTimeDiffMethods();
	act.launchBrowser();
	act.login();
	act.clickOnTask();
	act.Execution();
	act.delete();
	act.logout();
	act.closeBrowser();
	}

}
