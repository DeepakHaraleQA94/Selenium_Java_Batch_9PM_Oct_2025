package SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardAction {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/#");
		 WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		 
		 Actions action = new Actions(driver);
		 
		 action.doubleClick(doubleClick).perform();
		
		 
		 WebElement drag = driver.findElement(By.id("draggable"));
		 WebElement drop = driver.findElement(By.id("droppable"));
		 action.clickAndHold(drag).perform();
		 Thread.sleep(3000);
		 
		 action.release(drop).perform();
		 
		 Thread.sleep(3000);
		 action.contextClick().perform();
		 
		 
		 
		 
	}
}
