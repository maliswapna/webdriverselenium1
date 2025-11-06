import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocatorDemo {

    public static void main(String[] args) throws InterruptedException {

        // Setup ChromeDriver automatically
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Open Demoblaze
        driver.get("https://www.demoblaze.com");

        // Wait for page to load
        Thread.sleep(2000);

        // --- Locator Examples ---

        // 1. By ID
        driver.findElement(By.id("login2")).click();
        Thread.sleep(1000);

        // 2. By Name
        driver.findElement(By.name("username")).sendKeys("testuser");
        driver.findElement(By.name("password")).sendKeys("pass123");

        // 3. By Xpath
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(2000);

        // 4. By CSS Selector
        driver.findElement(By.cssSelector("a#logout2")).click();
        Thread.sleep(1000);

        // Close browser
        driver.quit();
    }
}
