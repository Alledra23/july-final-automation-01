package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MenuPage {

    WebDriver driver;

    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    By menuButton = By.id("react-burger-menu-btn");
    By logoutButton = By.id("logout_sidebar_link");

    public void logout() {
        driver.findElement(menuButton).click();

        // tunggu logout button visible sebelum diklik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement logout = wait.until(
                ExpectedConditions.elementToBeClickable(logoutButton)
        );
        logout.click();
    }
}