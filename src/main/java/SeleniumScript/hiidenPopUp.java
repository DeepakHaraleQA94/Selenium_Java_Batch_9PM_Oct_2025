package SeleniumScript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hiidenPopUp {

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
		driver.findElement(By.linkText("Popups")).click();
		
		driver.findElement(By.id("btn-six")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("alert")).click();
		
		   Alert alt = driver.switchTo().alert();
		   Thread.sleep(3000);
		   alt.accept();
		   
		   Thread.sleep(3000);
		   
		   
		   driver.findElement(By.id("btn-one")).click();
		   
//		   String mainid = driver.getWindowHandle();
//		   System.out.println(mainid);
		   
		   
           Set<String> windowsid = driver.getWindowHandles();
           System.out.println(windowsid);
             Iterator<String> itr = windowsid.iterator();
             String main = itr.next();
             System.out.println(main);
               String child = itr.next();
               System.out.println(child);
	
               
               driver.switchTo().window(child);
               
               driver.manage().window().maximize();
               
               
           
           
	}
	
	
}
