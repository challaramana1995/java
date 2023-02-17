package automation;

import org.apache.commons.math3.analysis.function.Ceil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpespicCellContent {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/extensions/select/examples/initialisations/chekbox.html//");
	WebElement cell	= driver.findElement(By.xpath("//table[@id = 'example']//body//tr)[2]//td)[3]"));
		System.out.println(cell.getText());
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
