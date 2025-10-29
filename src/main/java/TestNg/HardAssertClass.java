package TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertClass {

@Test
public void validateAssertMthod() {
	
	 String ExpectedResult="abc123";
	 String ActualResult="abc";
	 
	 Assert.assertEquals(ActualResult, ExpectedResult,"Result is not matching");
	 Reporter.log("TC1 is running", true);
	 System.out.println("hello");
	 
}
	
}
