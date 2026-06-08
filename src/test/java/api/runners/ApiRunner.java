package api.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/api",
        glue = {"api.stepdefinitions"},
        plugin = {
                "pretty",
                "html:reports/api-report.html",
                "json:reports/api-report.json"
        }
)
public class ApiRunner
        extends AbstractTestNGCucumberTests {
}