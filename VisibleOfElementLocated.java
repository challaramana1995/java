package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisibleOfElementLocated {
	public static void main(String[] args)throws Exception {
		 WebDriverManager.chromedriver().setup();
	       WebDriver driver = new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	       driver. manage().window().maximize();
	       driver.get("https://github.com/");
	       driver.findElement(By.partialLinkText("Sign up")).click();
	       WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	       WebElement txtEmail = driver.findElement(By.id("email"));
	       txtEmail.sendKeys("Ramana@Ramana.com");
	       Thread.sleep(5000);
	       driver.quit();
	}       
}
