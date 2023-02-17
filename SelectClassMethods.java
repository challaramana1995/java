package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassMethods {

	public static void main(String[] args)throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		WebElement Lstcars = driver.findElement(By.id("cars"));
		Select select = new Select(Lstcars);
		System.out.println(select.isMultiple());
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByVisibleText("Opel");
		Thread.sleep(2000);
		select.selectByValue("audi");
		Thread.sleep(2000);
		System.out.println(select .getAllSelectedOptions().size());
		select .deselectAll();
		select.deselectByIndex(3);
		Thread.sleep(2000);
		select.deselectByValue("opel");
		System.out.println(select.getOptions().size());
		Thread.sleep(0);
		driver.quit();

		

	}

}
