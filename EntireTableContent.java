package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EntireTableContent {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		WebElement row = driver.findElement(By.xpath("//table[@id = 'example']//tbody//tr)[3]"));
		System.out.println(row.getText());
		row = driver.findElement(By.xpath("//table[@id = 'example']//tbody//tr)[5]"));
		System.out.println(row.getText());
		Thread.sleep(5000);
		driver.quit();
	}

}
