package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager; // For automatic driver management

public class Builtseleniumscript {

    public static void main(String[] args) {
        
        // 1. Setup and Launch Browser
        // This line automatically downloads and configures the correct ChromeDriver
        WebDriverManager.chromedriver().setup(); 
        
        // Instantiates the ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();

        // 2. Open URL
        driver.get("https://www.saucedemo.com/");

        // 3. Locate elements and perform actions (Login)
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // 4. Print page title
        System.out.println("Title: " + driver.getTitle());

        // 5. Close browser
        driver.quit();
    }
}