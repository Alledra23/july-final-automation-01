package api.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@CucumberOptions(
        features = "src/test/resources/features/api",
        glue = {"api.stepdefinitions"},
        plugin = {
                "pretty",
                "html:reports/api-report.html",
                "json:reports/api-report.json"
        }
)
public class ApiRunner extends AbstractTestNGCucumberTests {

        @Override
        @DataProvider(parallel = false)
        public Object[][] scenarios() {
                return super.scenarios();
        }
}