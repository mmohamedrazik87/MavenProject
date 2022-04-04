package TestLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public RemoteWebDriver driver;

	@Parameters({ "URL", "BROWSER_NAME" })
	@BeforeMethod
	public void beforeMethod(String url, String browser) throws InterruptedException {

		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get(url);
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
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("CTS");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Razik");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Moh");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

	}

}
