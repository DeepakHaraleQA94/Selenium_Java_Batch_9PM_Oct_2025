package SeleniumScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/Account/Login");
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.name("Password")).sendKeys("jobprogram");
		driver.findElement(By.xpath("( //button[@type='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Employee")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create")).click();
		 WebElement country = driver.findElement(By.id("CountryId"));
		 Thread.sleep(3000);
		 Select select = new Select(country);
		 select.selectByVisibleText("Canada");
		 Thread.sleep(3000);
		 select.selectByIndex(5);
		 Thread.sleep(3000);
		 select.selectByValue("5");
		 
		 
		 Thread.sleep(3000);
		 List<WebElement> getOption = country.findElements(By.tagName("option"));
		 for(WebElement obj:getOption) {
			 System.out.println(obj.getText());
			 if(obj.getText().equals("France")) {
				 obj.click();
			 }
		 }
		 
		 
	}
}
