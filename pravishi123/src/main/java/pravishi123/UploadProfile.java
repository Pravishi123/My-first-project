package pravishi123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadProfile {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open demo upload site
        driver.get("https://demoqa.com/upload-download");

        // Locate the file input element
        WebElement uploadInput = driver.findElement(By.id("uploadFile"));

        // Provide absolute file path
        String filePath = "C:\\Users\\ADMIN\\Downloads\\download.jpg";
        uploadInput.sendKeys(filePath);

        // Verify uploaded file name (the displayed path will show fakepath)
        WebElement uploadedPath = driver.findElement(By.id("uploadedFilePath"));
        System.out.println("Uploaded File Displayed: " + uploadedPath.getText());

        //driver.quit();
    }
}
