package pravishi123;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOverText {

    public static void main(String[] args) {

        // ✅ Initialize Chrome browser
        WebDriver driver = new ChromeDriver();

        
        
        // ✅ Maximize window and apply implicit wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        // ✅ Open Flipkart
        driver.get("https://www.flipkart.com/");

        // ✅ Close popup if appears
        try {
            WebElement closePopup = driver.findElement(By.xpath("//*[@id=\"toast-ctn\"]"));
            closePopup.click();
        } catch (Exception e) {
            // no popup, continue
        }

        // ✅ Create explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));

        // ✅ Wait and find "Electronics" menu
        WebElement electronicsMenu = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[1]/div/div/span"))
        );

        // ✅ Perform mouse hover                                                                                                 //*[@id="trash"]          //*[@id="trash"]                                                 
        Actions action = new Actions(driver);
        action.moveToElement(electronicsMenu).perform();

        System.out.println("✅ Mouse hover on  menu successful!");
        //For clicking Women footwear
        
        try {
            WebElement closePopup = driver.findElement(By.xpath("/html/body/div[5]/div[1]/object/a[5]"));
            closePopup.click();
        } catch (Exception e) {
            // no popup, continue
        }

        // ✅ Create explicit wait
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(2));

        // ✅ Wait and find "Electronics" menu
        WebElement electronicsMenu1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[1]/object/a[5]")));

       
    }
}
