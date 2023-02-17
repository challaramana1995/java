package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IfElseTest {

	public static void main(String[] args) {
    WebDriver driver = null;
    String input = "chrome";
    if(input.equals("chrome")) {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    }else {
    	WebDriverManager.firefoxdriver().setup();
    	driver = new FirefoxDriver();
    }
    driver.manage().window().maximize();
    driver.get("https://mvnrepository.com");
    driver.quit();
    
	}

}
