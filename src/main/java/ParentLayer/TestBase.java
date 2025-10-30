package ParentLayer;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public TestBase() throws IOException {
		 prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\Automation_project\\src\\main\\java\\DataLayer\\config.properties");
		prop.load(file);
	}

	
	public void initilization() {
		
		String browserName = prop.getProperty("BrowserName");
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}

		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		System.out.println("Hello123");

	}
}
