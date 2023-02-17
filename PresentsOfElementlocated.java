package automation;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PresentsOfElementlocated {

	public static void main(String[] args)throws Exception {
		 WebDriverManager.chromedriver().setup();
	       WebDriver driver = new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	       driver. manage().window().maximize();
	       driver.get("https://my.microfocus.com/");
	       driver.findElement(By.partialLinkText("Login")).click();
	       WebDriverWait wait  = new WebDriverWait(driver, Duration.ofMinutes(5));
	      wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("username")));
	       WebElement txtuserName = driver.findElement(By.id("username"));
	       txtuserName.sendKeys("RAMANA");
	       Thread.sleep(5000);
	       driver.quit();
	   
	}

}
