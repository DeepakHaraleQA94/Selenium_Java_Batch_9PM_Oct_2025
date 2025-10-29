package SeleniumScript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/Account/Login");
		    File tmp = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    String random = RandomString.make(4);
		    File des = new File("C:\\Users\\lenovo\\eclipse-workspace\\Automation_project\\screenshot\\"+random+".png");
		    
		    FileHandler.copy(tmp, des);
		    
	}
}
