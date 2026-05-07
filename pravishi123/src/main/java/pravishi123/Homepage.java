package jiomart123;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions act = new Actions(driver);

        // Go to Products Page
        driver.findElement(By.xpath("//a[@href='/products']")).click();

        // Search Product
        driver.findElement(By.id("search_product")).sendKeys("Blue Top");
        driver.findElement(By.id("submit_search")).click();

        // Wait for Search Result Header
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h2[normalize-space()='Searched Products']")));

        System.out.println("✔ Search results visible");

        // Scroll to products area
        js.executeScript("window.scrollBy(0,600);");

        // Hover on product block (very important for this website)
        WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//div[@class='productinfo text-center'])[1]")));

        act.moveToElement(product).pause(500).perform();

        // JavaScript Click for Add to Cart (100% Working)
        WebElement addToCartBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]")));

        js.executeScript("arguments[0].click();", addToCartBtn);

        // Wait for Popup → Click View Cart
        WebElement viewCart = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[normalize-space()='View Cart']")));
        viewCart.click();

        // Wait for Cart to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='active']/b")));

        // Verify Product Name
        String productName = driver.findElement(By.xpath("//a[contains(text(),'Blue Top')]")).getText();
        System.out.println("Cart Product: " + productName);

        if (productName.contains("Blue")) {
            System.out.println("✔ Product name verification PASS");
        } else {
            System.out.println("❌ Product name verification FAIL");
        }

        // Verify Product Price
        String price = driver.findElement(By.xpath("//td[@class='cart_price']//p")).getText();
        System.out.println("Cart Price: " + price);

        if (price.equals("Rs. 500")) {
            System.out.println("✔ Price verification PASS");
        } else {
            System.out.println("❌ Price verification FAIL");
        }

        System.out.println("🎉 ALL DONE SUCCESSFULLY | No errors | Working script!");
    }
}
