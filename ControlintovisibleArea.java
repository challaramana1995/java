package automation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ControlintovisibleArea {

	public static void main(String[] args)throws Exception {
       WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		//((JavascriptExecutor)driver).executeScript("document.getElementById('example').ScrollIntoview()");
		WebElement table = driver.findElement(By.id("example"));
		File source = table.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\screenshots\\Image3.PNG");
		FileHandler.copy(source, target);
		Thread.sleep(5000);
		driver.quit();
	}

}
