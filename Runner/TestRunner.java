package Runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; // Sometime we need to add it manually

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Selenium Training\\Cucumber Framework\\BDD_Framework_FreeCRMAps\\src\\main\\java\\Features\\AppTag.feature",
		glue={"StepDefinitions"},
		plugin= {"pretty","html:test-outout", "json:json.output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		dryRun= false,
		monochrome = true,
		strict = true,
		tags= {"@SmokeTest"}
		
		//tags= {"US001"}
		)

public class TestRunner {

	
	
}
