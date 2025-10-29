package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class emailableReport {

	
	@Test
	public void test() {
	
	Reporter.log("hello1",true);
	}
	
	
	@Test
	public void show() {

	Reporter.log("hello java",true);
	}
}
