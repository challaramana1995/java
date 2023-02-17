package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsdblClick {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://api.jqery.com/dblclick/");
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.tagName("div"));
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.quit();
		


	}

}
