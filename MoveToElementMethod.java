package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementMethod {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dtdc.in/");
		WebElement linkTracking = driver.findElement(By.linkText("Tracking"));
		Actions actions = new Actions(driver);
		actions.moveToElement(linkTracking).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("E-Tracker")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
