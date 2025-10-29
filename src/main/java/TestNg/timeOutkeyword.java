package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeOutkeyword {

	@Test(timeOut = 2000)
	public void TC2() throws InterruptedException {
		Thread.sleep(3000);
		Reporter.log("TC2 is running", true);

	}

	@Test(dependsOnMethods = "TC2")
	public void test() {
		System.out.println("hello");
	}
	
	@Test
	public void show() {
		System.out.println("hi");
	}

}