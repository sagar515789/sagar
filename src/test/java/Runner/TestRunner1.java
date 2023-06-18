package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		         features="src/test/resources/feature/Search1.feature",
		         glue={"step_defination","hooks"},
		         dryRun = false,
		         publish = true,
		         tags="@all",
		        		 plugin = {"pretty",
				        		  "html:taget/HTML CUCUMBER REPORT.html",
				        		 "json:target/CucumberReports/Cucumber Reports.json",
				        		 "junit:target/CucumberReports/Cucumber Reports.xml"
		         }
		         )
public class TestRunner1 
{

}
