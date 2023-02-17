package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	private WebDriver driver = null;
	@Test
	private void verifyTitle() {
		WebDriverManager.chromedriver().setup();
		Assert.assertNull(driver);
		driver = new ChromeDriver();
	    Assert.assertNotNull(driver);
	    driver.manage().window().maximize();
	    driver.get("https://www.google.co.in/");
	    String expectedvalue = "Google";
	    String actualvalue = driver.getTitle();
	    Assert.assertEquals(actualvalue, expectedvalue);
	    driver.navigate().to("https://www.thepancard.com/newpancard.php");
	    boolean expvalue = true;
	    boolean actvalue = driver.findElement(By.id("rblCategory_0")).isSelected();
	    Assert.assertEquals(actvalue, expvalue);
	    
	    Assert.assertTrue(actvalue);
	    
	    driver.quit();
	    
	}

}
