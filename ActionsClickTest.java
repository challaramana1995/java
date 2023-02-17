package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickTest {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		WebElement btnsearch = driver.findElement(By.id("searchBtn"));
		Actions actions = new Actions(driver);
		actions.click(btnsearch).perform();
		Thread.sleep(5000);
		driver.quit();
		
				
	}

}
