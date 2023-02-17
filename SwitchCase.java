package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchCase {

	public static void main(String[] args) {
		 WebDriver driver = null;
	     String input ="Chrome";
	     switch (input) {
		case "chrome":
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
		default:
			System.out.println("InvalidInput");
			System.exit(1);
			}
	     driver.manage().window().maximize();
	     driver.get("https://mvnrepository.com");
	     driver.quit();
	     
	}

}
