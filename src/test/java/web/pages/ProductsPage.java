//package web.pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class ProductsPage {
//
//    WebDriver driver;
//
//    public ProductsPage(WebDriver driver){
//
//        this.driver = driver;
//    }
//
//    By title =
//            By.className("title");
//
//    By addToCartButton =
//            By.id("add-to-cart-sauce-labs-backpack");
//
//    By cartBadge =
//            By.className("shopping_cart_badge");
//
//    public boolean isProductsDisplayed(){
//
//        return driver.findElement(title).isDisplayed();
//    }
//
//    public void addProductToCart(){
//
//        driver.findElement(addToCartButton).click();
//    }
//
//    public String getCartCount(){
//
//        return driver.findElement(cartBadge).getText();
//    }
//}

package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    WebDriver driver;

    public ProductsPage(WebDriver driver){

        this.driver = driver;
    }

    By productsTitle =
            By.className("title");

    By addToCartButton =
            By.id("add-to-cart-sauce-labs-backpack");

    By removeButton =
            By.id("remove-sauce-labs-backpack");

    By cartBadge =
            By.className("shopping_cart_badge");

    public boolean isProductsPageDisplayed(){

        return driver.findElement(productsTitle)
                .isDisplayed();
    }

    public void addProductToCart(){

        driver.findElement(addToCartButton)
                .click();
    }

    public void removeProduct(){

        driver.findElement(removeButton)
                .click();
    }

    public String getCartBadgeCount(){

        return driver.findElement(cartBadge)
                .getText();
    }

    public boolean isCartBadgeDisplayed(){

        return driver.findElements(cartBadge)
                .size() > 0;
    }
}