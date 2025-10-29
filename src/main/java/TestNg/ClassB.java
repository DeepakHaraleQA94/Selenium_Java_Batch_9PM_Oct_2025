package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassB {

	
	@Test(groups = "smoke")
	public void test5() {
		System.out.println("TC5");
	}
	
	
	@Test(groups = "sanity")
	public void test6() {
		System.out.println("TC6");
		
		Assert.fail();
	}
	
	@Test(groups = "sanity")
	public void test7() {
		System.out.println("TC7");
	}
	
	@Test(groups = "regression")
	public void test8() {
	
		System.out.println("TC8");
	}
}
