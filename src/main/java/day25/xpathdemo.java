package day25;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo{

    public static void main(String[] args) throws InterruptedException {
        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Open the application
        driver.get("https://opensource-demo.orangehrmlive.com/web/auth/login");
        
        Thread.sleep(5000); // wait 5 seconds
        
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());

        // Click the OrangeHRM Inc link
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        // Print all window handles
        Set<String> windowIds = driver.getWindowHandles();
        System.out.println(windowIds);

       
    }
}
