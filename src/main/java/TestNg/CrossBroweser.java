package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBroweser {
WebDriver driver;
	@Parameters("Bname")
	@Test
	public void test(String Bname) {
		
		if(Bname.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(Bname.equals("firefox")) {
		     driver = new FirefoxDriver();	
		}else if(Bname.equals("edge")) {
			driver = new EdgeDriver();
		}else {
			System.out.println("please check browser name ...!");
		}
		
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/Account/Login");
		
	}
}
