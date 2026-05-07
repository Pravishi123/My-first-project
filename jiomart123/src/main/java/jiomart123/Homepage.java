package jiomart123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    WebDriver driver;
    By products = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickProducts() {
        driver.findElement(products).click();
    }
}
