package jiomart123;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Finalcode {

    @Test
    public void addToCartTest() {

        Base base = new Base();
        WebDriver driver = base.initDriver();

        Homepage home = new Homepage(driver);
        Productpage prod = new Productpage(driver);
        Cartpage cart = new Cartpage(driver);

        home.clickProducts();

        prod.searchProduct("Blue Top");

        String result = prod.getSearchProductName();
        Assert.assertEquals(result, "Blue Top");

        prod.addToCart();
        prod.clickViewCart();

        String cartName = cart.getCartProductName();
        Assert.assertEquals(cartName, "Blue Top");

        String price = cart.getCartProductPrice();
        Assert.assertEquals(price, "Rs. 500");
    }
}
