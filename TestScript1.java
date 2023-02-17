package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScript1{
	private WebDriver driver = null;
	
	@Parameters({"Browser"})
	
	@org.testng.annotations.Test
	private void Test(@Optional("chrome")String browser){
		switch(browser) {
		case"chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			case"firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			case"Edge":
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		break;
		
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.quit();
		
	}
	

	

}
