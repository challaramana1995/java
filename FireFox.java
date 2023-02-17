package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFox {

	public static void main(String[] args) {
     WebDriverManager.firefoxdriver().setup();
     WebDriver driver = new FirefoxDriver();
     driver.manage().window().maximize();
     driver.get("https://www.selenium.dev/");
     driver.quit();
	}

}
