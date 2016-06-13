package infopass.cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(

		features = { "src/test/resources/features/Reports" }, glue = { "infopass.cucumber.maps" }
// plugin = {"pretty", "html:reports/html/", "json:reports/json/results.json" },
// dryRun = false,
// strict = true,
// monochrome = true,

)

public class CucumberRunnerForReports {
}
