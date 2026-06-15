package web.stepdefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import web.pages.LoginPage;
import web.pages.ProductsPage;
import web.utils.DriverFactory;

public class CartSteps {

    LoginPage loginPage =
            new LoginPage(
                    DriverFactory.getDriver());

    ProductsPage productsPage =
            new ProductsPage(
                    DriverFactory.getDriver());

    @Given("user login successfully")
    public void userLoginSuccessfully() {

        loginPage.openPage();

        loginPage.login(
                "standard_user",
                "secret_sauce");
    }

    @When("user adds product to cart")
    public void userAddsProductToCart() {

        productsPage.addProductToCart();
    }

    @Then("cart badge should show 1 item")
    public void cartBadgeShouldShow1Item() {

        Assert.assertEquals(
                productsPage.getCartBadgeCount(),
                "1");
    }

    @Given("user already added product to cart")
    public void userAlreadyAddedProductToCart() {

        loginPage.openPage();

        loginPage.login(
                "standard_user",
                "secret_sauce");

        productsPage.addProductToCart();
    }

    @When("user removes product from cart")
    public void userRemovesProductFromCart() {

        productsPage.removeProduct();
    }

    @Then("cart badge should disappear")
    public void cartBadgeShouldDisappear() {

        Assert.assertFalse(
                productsPage.isCartBadgeDisplayed());
    }
}