package automation;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CapturePageScreenchat {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File target = new File("C:\\screenshots\\Image2.PNG");
        org.openqa.selenium.io.FileHandler.copy(source, target);
        Thread.sleep(5000);
        driver.quit();
        
	}

}
