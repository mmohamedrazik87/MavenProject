package learnParameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends ProjectSpecificMethod {

	@DataProvider(name = "Dynamic_Data")
	public String[][] testData() {
		String[][] data = new String[2][5];
		data[0][0] = "demosalesmanager";
		data[0][1] = "crmsfa";
		data[0][2] = "companyName1";
		data[0][3] = "firstName1";
		data[0][4] = "lastName1";

		data[1][0] = "demosalesmanager";
		data[1][1] = "crmsfa";
		data[1][2] = "companyName2";
		data[1][3] = "firstName2";
		data[1][4] = "lastName2";
		return data;
	}

	@Test(dataProvider = "Dynamic_Data")
	public void tc001(String userName, String password, String companyName, String fName, String lname)
			throws InterruptedException {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(userName);
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys(password);
		WebElement clickSubmit = driver.findElement(By.className("decorativeSubmit"));
		clickSubmit.click();
		WebElement clickCrmSfa = driver.findElement(By.linkText("CRM/SFA"));
		clickCrmSfa.click();
		WebElement clickLeads = driver.findElement(By.linkText("Leads"));
		clickLeads.click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys(companyName);
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(fName);
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys(lname);
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

	}

}
