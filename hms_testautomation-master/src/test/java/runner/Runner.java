package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)		
@CucumberOptions(features={"features"},tags= {"@opClinic,@opLite"},
//@login,@reception,@investigation,@registration,@revisit,@patient_registration,@observation_dashboard
//@opClinic,@opLite,@logout
glue={"stepdefinition"},
format= {"pretty","html:E:\\selenium_excel\\output\\test-report",
		"json:E:\\selenium_excel\\output\\cucumber.json",
		"junit:E:\\selenium_excel\\output\\cucumber.xml"})
public class Runner {
	
}
