package pravishi123;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Intercambio {
	private static WebElement yearDropdown;

	public static void main(String[] args) {

     
        
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        
        driver.get("http://intercambio-stg.techsaga.live/admin/login");

        
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("admin@gmail.com");

        
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");

       
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[7]")).click();
        driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[7]/div/a[1]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div/h4/div/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Mack");
        driver.findElement(By.xpath("//*[@id=\"l_name\"]")).sendKeys("David");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("mack@yopmail.com");
        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("8967564785");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");
        driver.findElement(By.xpath("//*[@id=\"confirm_password\"]")).sendKeys("12345678");
        driver.findElement(By.name("receiving_text_message")).click();
        
//        Select year = new Select(driver.findElement(By.xpath("//*[@id=\"createFrm\"]/div[1]/div[9]/div/select")));
//        driver.findElement(By.xpath("//*[@id=\"createFrm\"]/div[1]/div[7]/div/label/span")).click();
//        year.selectByVisibleText("2000");
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement birthYearDropdown = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.name("birthday"))
        );
        Select birthYear = new Select(birthYearDropdown);
        birthYear.selectByVisibleText("2000");
        
        Select gender = new Select(driver.findElement(By.xpath("//*[@id=\"gender\"]")));
        gender.selectByVisibleText("Male");
      //  driver.findElement(By.xpath("//*[@id=\"editFrm\"]/div[1]/div[7]/div/label/span")).click();
       // driver.findElement(By.xpath("//*[@id=\"editFrm\"]/div[1]/div[8]/div/label/span")).click();
        driver.findElement(By.xpath("//*[@id=\"street_address\"]")).sendKeys("Noida");
        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("noida");
        Select state = new Select(driver.findElement(By.xpath("//*[@id=\"state\"]")));
        state.selectByVisibleText("CT");
        driver.findElement(By.xpath("//*[@id=\"zip\"]")).sendKeys("201301");
        Select timezone = new Select(driver.findElement(By.xpath("//*[@id=\"time_zone\"]")));
        timezone.selectByVisibleText("Central Time");
        //Class type prefrence
        Select type = new Select(driver.findElement(By.xpath("//*[@id=\"class_teaching_type\"]")));
        type .selectByVisibleText("Online");
        //Preference
        Select preference1 = new Select(driver.findElement(By.xpath("//*[@id=\"class_type_preference\"]")));
        preference1 .selectByVisibleText("Group Classes");
        Select how =new Select(driver.findElement(By.xpath("//*[@id=\"question\"]")));
        how .selectByVisibleText("Community Event");
        Select what = new Select(driver.findElement(By.name("question[4]")));
        what .selectByVisibleText("Afar");
        Select country=new Select(driver.findElement(By.name("question[5]")));
        country .selectByVisibleText("Angola");
        Select Do = new Select(driver.findElement(By.name("question[6]")));
        Do .selectByVisibleText("Yes");
        Select What = new Select(driver.findElement(By.name("question[7]")));
        What .selectByVisibleText("Asian");
        Select household = new Select(driver.findElement(By.name("question[12]")));
        household .selectByVisibleText("$50,000 to $70,000");
        Select home = new Select(driver.findElement(By.name("question[13]")));
        home.selectByVisibleText("2");
        Select commit = new Select(driver.findElement(By.name("question[18]")));
        commit .selectByVisibleText("Yes");
        Select preference = new Select (driver.findElement(By.name("question[19]")));
        preference.selectByVisibleText("No preference");
        Select hear = new Select(driver.findElement(By.name("question[20]")));
        hear.selectByVisibleText("Friend");
        Select consent = new Select (driver.findElement(By.name("question[21]")));
        consent.selectByVisibleText("Yes");
        Select level = new Select(driver.findElement(By.name("education")));
        level.selectByVisibleText("Primary/elementary school");
        driver.findElement(By.xpath("//*[@id=\"under_age\"]")).sendKeys("2");
        driver.findElement(By.xpath("//*[@id=\"emergency_name\"]")).sendKeys("Robert");
        driver.findElement(By.xpath("//*[@id=\"emergency_number\"]")).sendKeys("8986756787");
        driver.findElement(By.xpath("//*[@id=\"createFrm\"]/div[3]/div[1]/div/div[1]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"createFrm\"]/div[4]/div[1]/div/div[1]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"createFrm\"]/div[10]/button[2]")).click();



    }

}
