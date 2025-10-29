package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotation {

	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	} 
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("before class",true);
	}
	
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method ");
	}
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	
	
	@Test
	public void validateClass() {
		System.out.println("main method");
	}
	
	
	
	
}
