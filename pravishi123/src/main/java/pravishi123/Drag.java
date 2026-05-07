package pravishi123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
    public static void main(String[] args)  {
        // 1️⃣ Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2️⃣ Open website
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

        // 3️⃣ Switch to iframe (the drag-drop content lives inside it)
        WebElement frame = driver.findElement(By.xpath("//iframe[contains(@src, 'photo-manager.html')]"));
        driver.switchTo().frame(frame);

        // 4️⃣ Locate drag (image) and drop (trash) elements
        WebElement drag = driver.findElement(By.xpath("//*[@id='gallery']/li[1]"));
        WebElement drop = driver.findElement(By.id("trash"));

        // 5️⃣ Perform drag and drop
        Actions action = new Actions(driver);
        action.dragAndDrop(drag, drop).perform();
       

        // 6️⃣ Pause to see result
      //  Thread.sleep(2000);

        
    }
}
