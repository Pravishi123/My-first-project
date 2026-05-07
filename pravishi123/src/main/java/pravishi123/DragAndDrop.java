package pravishi123;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

        // ✅ Wait for iframe and switch into it
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement frame = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//iframe[contains(@src, 'photo-manager.html')]")));
        driver.switchTo().frame(frame);

        // ✅ Locate all 4 images and Trash element
        List<WebElement> images = driver.findElements(By.cssSelector("#gallery li"));
        WebElement trash = driver.findElement(By.id("trash"));

        // ✅ Drag and drop each image
        Actions actions = new Actions(driver);
        for (WebElement image : images) {
            actions.dragAndDrop(image, trash).perform();
            Thread.sleep(1000); // wait to see the move
        }

        // ✅ Verification
        List<WebElement> dropped = trash.findElements(By.tagName("li"));
        if (dropped.size() == 4) {
            System.out.println("✅ All 4 images successfully dragged and dropped into Trash!");
        } else {
            System.out.println("❌ Drag and Drop failed. Dropped count: " + dropped.size());
        }

      
    }
}
