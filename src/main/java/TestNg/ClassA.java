package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA {

	
	@Test(groups = "sanity")
	public void test1() {
		System.out.println("TC1");
		Assert.fail();
	}
	
	@Test(groups = "regression")
	public void test2() {
		System.out.println("TC2");
	}
	
	
	@Test(groups = "sanity")
	public void test3() {
		System.out.println("TC3");
		
	}
	
	@Test(groups = "functional")
	public void test4() {
		System.out.println("TC4");
	}
	
	
}
