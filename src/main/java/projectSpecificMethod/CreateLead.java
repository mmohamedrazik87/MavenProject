package projectSpecificMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement clickSubmit = driver.findElement(By.className("decorativeSubmit"));
		clickSubmit.click();
		WebElement clickCrmSfa = driver.findElement(By.linkText("CRM/SFA"));
		clickCrmSfa.click();
		WebElement clickLeads = driver.findElement(By.linkText("Leads"));
		clickLeads.click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		
		
		
		
		
	
		

	}

}
