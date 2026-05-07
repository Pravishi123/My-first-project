package Hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class Intercambio {
    public static void main(String[] args) throws InterruptedException {
        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Maximize window
        driver.manage().window().maximize();

        // Open URL
        driver.get("https://intercambio-stg.techsaga.live/admin/login");

        // Explicit wait (Selenium 4 style)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Enter email
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        emailField.sendKeys("admin@gmail.com");

        // Enter password
        driver.findElement(By.name("password")).sendKeys("admin123"); // replace with actual password

        // Click login
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Optional: wait and close
        Thread.sleep(3000);
        driver.quit();
    }
}
