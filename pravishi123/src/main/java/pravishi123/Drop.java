package pravishi123;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class Drop{
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		driver.switchTo().frame(frame);
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]"));
		WebElement drop = driver.findElement(By.id("trash"));
 		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		
		
	}
}

