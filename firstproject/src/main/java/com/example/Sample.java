package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

    public static void main(String[] args) throws InterruptedException {

        // 1️⃣ Setup ChromeDriver
     //   System.setProperty("webdriver.chrome.driver", "C:\\Path\\to\\chromedriver.exe");

        // 2️⃣ Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 3️⃣ Open login page
        driver.get("https://intercambio-stg.techsaga.live/admin/login");

        // 4️⃣ Enter email
        driver.findElement(By.id("email")).sendKeys("admin@gmail.com");

        // 5️⃣ Enter password
        driver.findElement(By.id("password")).sendKeys("12345678");

        // 6️⃣ Click login button
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[3]/button")).click();

        // 7️⃣ Wait for dashboard to load
        Thread.sleep(3000);

        // 8️⃣ Print current URL to check login
        //System.out.println("Current URL after login: " + driver.getCurrentUrl());

        // 9️⃣ Close browser
        driver.quit();
    }
}
