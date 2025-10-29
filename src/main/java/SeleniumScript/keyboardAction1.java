package SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardAction1 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new EdgeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("userName")).sendKeys("Deepak");
		driver.findElement(By.id("userEmail")).sendKeys("deepak@gmail.com");
		 driver.findElement(By.id("currentAddress")).sendKeys("Pune 421756");
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.perform();
			
		action.sendKeys(Keys.TAB);
		action.perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
//		action.click();
	}

}


