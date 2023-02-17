package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSysgentionReleadToMouse {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		WebElement txtsource = driver.findElement(By.id("fromPlaceName"));
		Actions actions = new Actions(driver);
       actions.sendKeys(txtsource,"Hyderabad ").perform();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
       Thread.sleep(5000);
       driver.quit();

	}

}
