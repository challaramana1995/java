
package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameTest {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hamcrest.org/JavaHamcrest/javadoc/2.2");
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("org.hamcrest")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Matcher")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(2);
		driver.findElement(By.linkText("AllOf")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.quit();
	}

}
