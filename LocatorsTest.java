package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsTest {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apsrtconline.in/oper-web/");
		//driver.findElement(By.id("searchBtn")).click();
		//driver.findElement(By.name("searchBtn")).click();
		//driver.findElement(By.className("chkavailabilityBtn")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
