package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementActions {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thepancard.com/");
		driver.findElement(By.linkText("Apply New PAN Card")).click();
		WebElement rbArmy = driver.findElement(By.id("rblCategory_1"));
		System.out.println(rbArmy.isSelected());
		rbArmy.click();
		System.out.println(rbArmy.isSelected());
		WebElement rbnavy = driver.findElement(By.id("rblCategory_2"));
		System.out.println(rbnavy.isSelected());
		rbnavy.click();
		System.out.println(rbnavy.isSelected());
		WebElement txtDob = driver.findElement(By.id("txtDOB"));
		System.out.println(txtDob.isEnabled());
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
