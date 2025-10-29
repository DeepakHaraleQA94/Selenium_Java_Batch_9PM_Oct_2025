package SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class script {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new EdgeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
//		 js.executeScript("window.scrollBy(0,500)");
		 js.executeScript("document.getElementById('UserName').value='training@jalaacademy.com'");
			js.executeScript("document.getElementById('Password').value='jobprogram'");
			js.executeScript("document.getElementById('btnLogin').click()");
			Thread.sleep(3000);
//			String getURL = js.executeScript("return document.URL").toString();
//		 System.out.println(getURL);
		 
//		 String javascript = "document.getElementById('btnLogin').style.border='5px solid red'";
//			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//			jsExecutor.executeScript(javascript);
//			
			
			js.executeScript("document.getElementById('pass').scrollIntoView()");
	}
}
