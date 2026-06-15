package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {

    WebDriver driver;

    public MenuPage(WebDriver driver){

        this.driver = driver;
    }

    By menuButton =
            By.id("react-burger-menu-btn");

    By logoutButton =
            By.id("logout_sidebar_link");

    public void logout(){

        driver.findElement(menuButton)
                .click();

        driver.findElement(logoutButton)
                .click();
    }
}