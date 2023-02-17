package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertIsPresent {
	public static void main(String[]args)throws Exception{
	 WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
     driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
     driver. manage().window().maximize();
     driver.get("file:///C:/Users/Test/Downloads/WaitUntilAlertDisplayed%20(1).html");
     driver.findElement(By.xpath("//button[text()='Click']")).click();
     WebDriverWait wait = new  WebDriverWait(driver, Duration.ofMinutes(5));
     wait.until(ExpectedConditions.alertIsPresent());
     driver.switchTo().alert().accept();
     Thread.sleep(5000);
     driver.quit();
	}
}
