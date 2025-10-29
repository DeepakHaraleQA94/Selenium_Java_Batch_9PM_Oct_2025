package TestLayer;

import java.io.IOException;

import org.jspecify.annotations.Nullable;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.LoginPage;
import ParentLayer.TestBase;
import UntilityLayer.listnerClass;


@Listeners(listnerClass.class)
public class LoginTestPage extends TestBase{
	LoginPage login;
	public LoginTestPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() {
		initilization();
		
	}
	
	@Test(dependsOnMethods = "validateLoginPage")
	public void add() {
		System.out.println("hi");
	}
	
	
	@Test
	public void validateLoginPage() throws IOException, InterruptedException {
		 login = new LoginPage();
		 login.enterUname(prop.getProperty("uname"));
		 login.enterPass(prop.getProperty("pass"));
		 login.clickOnLoginBtn();
		 Thread.sleep(3000);
		 login.enterUname(prop.getProperty("uname"));
		 login.enterPass(prop.getProperty("pass"));
		 login.clickOnLoginBtn();
		 Thread.sleep(3000);
		String actual = driver.getTitle();
		Assert.assertEquals(actual, "Magnus1", "Home page title not matched, TC failed");
		Reporter.log("Home page title matched, TC Passed", true);
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	
	

	
	
}
