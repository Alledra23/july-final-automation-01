package web.stepdefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import web.pages.LoginPage;
import web.pages.MenuPage;
import web.utils.DriverFactory;

public class LogoutSteps {

    LoginPage loginPage =
            new LoginPage(
                    DriverFactory.getDriver());

    MenuPage menuPage =
            new MenuPage(
                    DriverFactory.getDriver());

    @Given("user already login")
    public void userAlreadyLogin() {

        loginPage.openPage();

        loginPage.login(
                "standard_user",
                "secret_sauce");
    }

    @When("user clicks logout button")
    public void userClicksLogoutButton() {

        menuPage.logout();
    }

    @Then("user should be redirected to login page")
    public void userShouldBeRedirectedToLoginPage() {

        String currentUrl =
                DriverFactory.getDriver()
                        .getCurrentUrl();

        Assert.assertTrue(
                currentUrl.contains("saucedemo"));
    }
}