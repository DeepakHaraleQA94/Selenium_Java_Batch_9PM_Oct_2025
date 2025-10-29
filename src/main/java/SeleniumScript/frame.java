package SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/Account/Login");
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.name("Password")).sendKeys("jobprogram");
		driver.findElement(By.xpath("( //button[@type='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("More")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("iFrames")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("iframe2");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Toggle navigation")).click();
		driver.findElement(By.linkText("Home")).click();
	}
}
