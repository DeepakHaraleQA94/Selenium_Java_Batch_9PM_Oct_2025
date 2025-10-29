package TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsertClass {

	@Test
	public void validatetest() {
		SoftAssert soft = new SoftAssert();
		
		String ExpectedResult="abc123";
		 String ActualResult="abc";
		 
		 soft.assertEquals(ActualResult, ExpectedResult,"Result is not matching");
		 Reporter.log("TC1 is running", true);
		 System.out.println("hello");
		 
		
	}
}
