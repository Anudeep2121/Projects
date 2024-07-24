package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"html:target/cucumber-reports/T1estReport.html",
				"json:target/cucumber-reports/TestReport.json"
		}, 
        features = {

  
        	
        	
        		"src/main/resources/login.feature"
        
        	
		},
        dryRun = false,

// tags = "@TC06-05",
        glue = {"Step_Defination_file"}
)

public class runner_file extends AbstractTestNGCucumberTests {


}