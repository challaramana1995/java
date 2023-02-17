package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownSendAndSelectClassMethod {

	public static void main(String[] args)throws Exception {
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).perform();
		actions.click(driver.findElement(By.xpath("//option[text() = 'volvo']"))).perform();
		Thread.sleep(2000);
		actions.click(driver.findElement(By.xpath("//option[text() = 'opel']"))).perform();
		actions.keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
