package automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript {

	public static void main(String[] args) {
		
   WebDriverManager.chromedriver().setup();
   
   WebDriver driver = new ChromeDriver();
   
   driver.manage().window().maximize();
   
   driver.get("https://emicalculator.net/");
   
   ((JavascriptExecutor)driver).executeScript("document.getElementById('loaninterest').value='12.5'");
   
			
	}

}
