package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BasicJavaClass {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://your-insurance-portal-url.com");
    }

    @Test
    public void loginTest() {
        driver.findElement(By.id("username")).sendKeys("testUser");
        driver.findElement(By.id("password")).sendKeys("testPass");
        driver.findElement(By.id("loginButton")).click();

        String title = driver.getTitle();
        assert title.contains("Dashboard") : "Login failed!";
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
