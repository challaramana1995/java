package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassContextclick {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement element = driver.findElement(By.xpath("//span[text()='rightclickme']"));
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
		Thread.sleep(5000);
		driver.quit(); 
	}

}
