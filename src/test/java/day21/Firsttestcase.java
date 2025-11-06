package day21;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;




 /*
  * test case
  * launch browser(chrome)
  * open URL https://demo.opencart.com/
  * validate title should be "Your Store"
  * close browser 
  */

public class Firsttestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //1,launch browser(chrome)
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		

		// 2,open URL https://demo.opencart.com/
		driver.get("https://www.opencart.com/");
		
		//3 validate title should be "your store"
		String act_title=driver.getTitle();
	if(act_title.equals("Your Store"))
	{
		System.out.println("test passed");
	}
		
		else
		{
			System.out.println("test Failed ");
			
			//4, Close browser 
			//driver.close 
			//driver.close();
		}
	}
		

}

