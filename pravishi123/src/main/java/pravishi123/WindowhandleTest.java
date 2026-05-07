package pravishi123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandleTest {
    public static void main(String[] args) {

        // STEP 1: ChromeDriver create karo
        WebDriver driver = new ChromeDriver();

        // STEP 2: URL open
        driver.get("https://google.com");

        // STEP 3: Current window handle print karo
        String windowID = driver.getWindowHandle();
        System.out.println("Current Window ID: " + windowID);

        // STEP 4: Browser close
        driver.quit();
    }
}
