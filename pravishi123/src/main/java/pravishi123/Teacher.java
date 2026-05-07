package pravishi123;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Teacher {
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://intercambio-stg.techsaga.live/admin/login");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("admin@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[8]/button/i[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[8]/div/a[1]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div/h4/a[1]")).click();
		//Teacher form fill process;
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Black");
		driver.findElement(By.xpath("//*[@id=\"l_name\"]")).sendKeys("David");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("black@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("8987656789");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id=\"confirm_password\"]")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id=\"here_about_us\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"here_about_us\"]/option[2]")).click();
		//JavascriptExecutor as = (JavascriptExecutor) driver;
		//as.executeScript("window.scrollBy(0,500)");
	   // Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"createFrm\"]/div[1]/div[8]/div/label/input")).click();
	    driver.findElement(By.xpath("//*[@id=\"createFrm\"]/div[1]/div[9]/div/label/input")).click();
	    driver.findElement(By.xpath("//*[@id=\"birthday\"]")).sendKeys("10/17/2000");
	    driver.findElement(By.name("gender")).click();
	    driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div/form/div[1]/div[11]/div/select/option[2]")).click();
	    driver.findElement(By.name("address")).sendKeys("Noida sector 15");
	    driver.findElement(By.id("city")).sendKeys("Noida");
	    driver.findElement(By.id("state")).click();
	    driver.findElement(By.xpath("//*[@id=\"state\"]/option[14]")).click();
	    driver.findElement(By.id("zip")).sendKeys("201301");
	    driver.findElement(By.id("timezone")).click();
	    driver.findElement(By.xpath("//*[@id=\"timezone\"]/option[4]")).click();
	    driver.findElement(By.id("class_type")).click();
	    driver.findElement(By.xpath("//*[@id=\"class_type\"]/option[3]")).click();
	    driver.findElement(By.id("class_type_preference")).click();
	    driver.findElement(By.xpath("//*[@id=\"class_type_preference\"]/option[3]")).click();
	    driver.findElement(By.id("defaultRadio1")).click();
	    driver.findElement(By.id("basic-default-location_comment")).sendKeys("test");
	    driver.findElement(By.id("basic-default-voluntee_for_intercombio")).sendKeys("test");
	    driver.findElement(By.xpath("//*[@id=\"createFrm\"]/div[2]/button[2]")).click();
	    

	    
		
	}

}
