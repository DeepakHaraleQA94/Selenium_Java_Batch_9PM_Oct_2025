package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class keyword {	
	
	@Test(priority = 1)
	  public void addition() {
		  Reporter.log("add", true);
	  }
	
	
	@Test(priority = 2)
	  public void substraction() {
		  Reporter.log("sub", true);
	}
	
	
	@Test(enabled = true)
	  public void division() {
		  Reporter.log("div", true);
	  }
	
	
	
	@Test()
	  public void multiplication() {
		  Reporter.log("mul", true);
	  }
	

}
