package Auto1implicit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessIrctcPrntTitle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		String title=driver.getTitle();
		System.out.println(title);

	}

}
