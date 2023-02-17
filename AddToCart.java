package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart {
	private WebDriver driver = null;
	//openBrowser
	
	@BeforeTest
	public void operBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		driver.manage().window().maximize();
	}
	//login
	
	@BeforeMethod
	public void login() {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	@Test
	public void AddToCart() throws Exception{
		//AddToCart
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(100);
	}
	//logout
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
	@AfterTest
	public void closeBrowser()throws Exception{
		//closeBrowser
		Thread.sleep(1000);
		driver.quit();
	}

}
