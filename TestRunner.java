package automation;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src\\test\\resources\\features\\HRM.feature",name = "Login",plugin = "html:Reports.html")

public class TestRunner extends AbstractTestNGCucumberTests{
	
	
		
		
	}


