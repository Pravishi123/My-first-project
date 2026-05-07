package pravishi123;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TeacherLogin {
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://intercambio-stg.techsaga.live/");
		driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/div/form/div[1]/div[2]/input")).sendKeys("zack@gmail.com");
		//driver.findElement(By.cssSelector("#toggle-password")).sendKeys("12345678");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345678");

		driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/div/form/div[4]/button")).click();
	
		
	}

}
