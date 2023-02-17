package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NumberOfTables {

	public static void main(String[] args)throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/extensions/select/examples/initialisations/chekbox.html");
		System.out.println(driver.findElements(By.xpath("//table")).size());
		System.out.println(driver.findElements(By.cssSelector("table")).size());
		System.out.println(driver.findElements(By.tagName("table")).size());
		Thread.sleep(5000);
		driver.quit();
		
	}

}
