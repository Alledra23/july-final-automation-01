package web.stepdefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import web.pages.LoginPage;
import web.pages.ProductsPage;
import web.utils.DriverFactory;

public class LoginSteps {

    LoginPage loginPage =
            new LoginPage(
                    DriverFactory.getDriver());

    ProductsPage productsPage =
            new ProductsPage(
                    DriverFactory.getDriver());

    @Given("user is on login page")
    public void userIsOnLoginPage() {

        loginPage.openPage();
    }

    @When("user login with valid credential")
    public void userLoginWithValidCredential() {

        loginPage.login(
                "standard_user",
                "secret_sauce");
    }

    @Then("user should be redirected to products page")
    public void userShouldBeRedirectedToProductsPage() {

        Assert.assertTrue(
                productsPage.isProductsPageDisplayed());
    }
}