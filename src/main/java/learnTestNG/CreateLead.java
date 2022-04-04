package learnTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends ProjectSpecificMethod {
	@Test
	public void tc001() {
		WebDriverManager.chromedriver().setup();
		driver.get("http://leaftaps.com/opentaps/control/login");
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
