package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSlocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.nopcommerce.com/");
		 driver.manage().window().maximize();//maximize the browser window 

		//tag id tag#id
		 //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T Shirts");
       //without tag
		 //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T Shirts");
		 
		 //tag class  tag.classname   Syntax input.search-box-text
		// driver.findElement(By.cssSelector(" input.search-box-text")).sendKeys("T Shirts");
		 //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T Shirts");
		 //tag attribute  input[placeholder="Search store"]
		 
		 //driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T Shirts");
		// driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T Shirts");
		 
		 //tag class and attribute user name and password 
		 driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T Shirts");

		 
		 
		 
	}
	
	
	

}
