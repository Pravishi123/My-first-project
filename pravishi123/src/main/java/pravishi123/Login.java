package pravishi123;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login{
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://intercambio-stg.techsaga.live/login");
		driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/div/form/div[1]/div[2]/input")).sendKeys("mack@yopmail.com");
		driver.findElement(By.xpath("//*[@id=\"password-input\"]")).sendKeys("12345678");
		driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/div/form/div[4]/button")).click();
		
		
	}
	
}