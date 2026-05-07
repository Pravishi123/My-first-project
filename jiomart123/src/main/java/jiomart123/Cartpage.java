package jiomart123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Cartpage {

    WebDriver driver;
    WebDriverWait wait;

    // Locators
    By viewCartBtn = By.xpath("//button[text()='View Cart']");
    By crtProductName = By.xpath("//td[@class='cart_description']/h4/a");
    By cartProductPrice = By.xpath("//td[@class='cart_price']/p");

    public Cartpage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // View Cart Button Click (Stable)
    public void clickViewCartButton() {
        wait.until(ExpectedConditions.elementToBeClickable(viewCartBtn)).click();
    }

    // Get Product Name
    public String getCartProductName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(crtProductName));
        return driver.findElement(crtProductName).getText().trim();
    }

    // Get Price
    public String getCartProductPrice() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartProductPrice));
        return driver.findElement(cartProductPrice).getText().trim();
    }
}
