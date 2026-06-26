package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductsPage {

    WebDriver driver;
    WebDriverWait wait;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By productsTitle = By.className("title");
    By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    By removeButton = By.id("remove-sauce-labs-backpack");
    By cartBadge = By.className("shopping_cart_badge");

    public boolean isProductsPageDisplayed() {
        return wait.until(ExpectedConditions
                        .visibilityOfElementLocated(productsTitle))
                .isDisplayed();
    }

    public void addProductToCart() {
        wait.until(ExpectedConditions
                        .elementToBeClickable(addToCartButton))
                .click();

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(removeButton));
    }

    public void removeProduct() {
        wait.until(ExpectedConditions
                        .elementToBeClickable(removeButton))
                .click();
    }

    public String getCartBadgeCount() {
        return wait.until(ExpectedConditions
                        .visibilityOfElementLocated(cartBadge))
                .getText();
    }

    public boolean isCartBadgeDisplayed() {
        try {
            wait.until(ExpectedConditions
                    .invisibilityOfElementLocated(cartBadge));
            return false;
        } catch (Exception e) {
            return true;
        }
    }
}