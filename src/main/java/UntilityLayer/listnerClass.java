package UntilityLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class listnerClass implements ITestListener {
	
	ExtentReports  report = utility.getExtentReport();
	public static ExtentTest eTest;
	
	public void onStart(ITestContext context) {
	  
		System.out.println("testclass execution started ");
		

	  }
	
	
	  public void onTestStart(ITestResult result) {
  
		   System.out.println("test method execution started  "+ result.getMethod().getMethodName());
		   String testName = result.getName();
			eTest = report.createTest(testName);
			eTest.log(Status.INFO,testName+" execution started");
	  
	  }
	
	  
	  
	  public void onTestSuccess(ITestResult result) {
		    System.out.println(" TC method passed" + result.getMethod().getMethodName());
		  }
	
	  public void onTestFailure(ITestResult result) {
		    System.out.println("TC method validation Failed "+ result.getMethod().getMethodName() );
		  }
	  
	  
	  public void onTestSkipped(ITestResult result) {
		    System.out.println("TC method skipped " + result.getMethod().getMethodName() );
		  }

	  
	public void onFinish(ITestContext context) {
	   System.out.println("Test class execution has been completed ");
	   
	   report.flush();
	  }
	
	
	
	
}
