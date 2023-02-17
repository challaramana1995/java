package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NumberOfRows {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		System.out.println(driver.findElements(By.xpath("//table[@id = 'example']")).size());
		System.out.println(driver.findElements(By.xpath("//table[@id = 'example']//tbody//tr")).size());
		Thread.sleep(5000);
		driver.quit();
	}

}
