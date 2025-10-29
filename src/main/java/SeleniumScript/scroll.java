package SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class scroll {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/#");
//		WebElement view = driver.findElement(By.id("txtDate"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('txtDate').scrollIntoView()");


		
	}
}
