
package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class locatorsdemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
       // boolean logoDisplayStatus = driver.findElement(By.id("root")).isDisplayed();
        //System.out.println(logoDisplayStatus);
        //linktest and partial link text 
        //partial link text is not preefrable;
        
        //driver.findElement(By.linkText("Sauce Labs Backpack")).click();
       //driver.findElement(By.partialLinkText("Sauce Labs Backpac")).click();
       
       //Classname 
       // WebElement item = driver.findElement(By.className("inventory_item_description"));
        //System.out.println("Total number of links: " + links.size());

//Tag name also to locate group of web elements 
       
       // List<WebElement> divs = driver.findElements(By.tagName("div"));
        //System.out.println("Total number of div elements: " + divs.size());
      
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total number of images: " + images.size());
        
    }
}