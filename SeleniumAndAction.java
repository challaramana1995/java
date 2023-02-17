package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAndAction {

	public static void main(String[] args)throws Exception {

	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://emicalculator.net/");
	
	WebElement txtloanintrest = driver.findElement(By.id("loaninterest"));
	
	((JavascriptExecutor)driver).executeScript("arguments[0].value='12.5'",txtloanintrest);
	Thread.sleep(5000);
	driver.quit();
	
	
	}

}
