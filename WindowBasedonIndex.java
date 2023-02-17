package automation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowBasedonIndex {
	public static void main(String[] args)throws Exception {
		 WebDriverManager.chromedriver().setup();
	       WebDriver driver = new ChromeDriver();
	       driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
	       driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	       driver. manage().window().maximize();
	       driver.get("https://www.cypress.io/");
	       driver.findElement(By.linkText("Sign up")).click();
	       Set<String>set = driver.getWindowHandles();
	       List<String>list  = new ArrayList<String>(set);
	       driver.switchTo().window(list.get(1));
	       driver.findElement(By.xpath("//span[@class = 'pull left'])[3]")).click();
	       Thread.sleep(5000);
	       driver.quit();
	}
}
