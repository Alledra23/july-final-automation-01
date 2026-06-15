package web.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features =
                "src/test/resources/features/web",

        glue = {
                "web.stepdefinitions",
                "web.hooks"
        },

        plugin = {
                "pretty",
                "html:reports/web-report.html",
                "json:reports/web-report.json"
        }
)
public class WebRunner
        extends AbstractTestNGCucumberTests {
}