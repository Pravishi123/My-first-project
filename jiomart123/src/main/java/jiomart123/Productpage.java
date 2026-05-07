package jiomart123;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Productpage {

    WebDriver driver;
    WebDriverWait wait;

    By searchBox = By.id("search_product");
    By searchBtn = By.id("submit_search");
    By productName = By.xpath("//div[@class='productinfo text-center']/p");
    By addToCartBtn = By.xpath("(//a[text()='Add to cart'])[1]");
    By viewCartBtn = By.xpath("//u[text()='View Cart']");

    public Productpage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void searchProduct(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
        driver.findElement(searchBox).sendKeys(name);
        driver.findElement(searchBtn).click();
    }

    public String getSearchProductName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(productName));
        return driver.findElement(productName).getText();
    }

    // MAIN FIX: handle ads iframe + scroll + javascript click
    public void addToCart() {

        // Scroll to button
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -100);");

        try {
            // Try normal click
            btn.click();
        } catch (Exception e) {
            // If blocked by iframe ads → perform JS click
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btn);
        }
    }

    public void clickViewCart() {
        wait.until(ExpectedConditions.elementToBeClickable(viewCartBtn)).click();
    }
}
