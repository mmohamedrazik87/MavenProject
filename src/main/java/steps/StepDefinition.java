package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	ChromeDriver driver;
	@Given("Launch Chrome browser")
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@And("Enter username as DemosalesManager")
	public void enterUserName() {
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
	}
	@And("Enter Password as CRMSFA")
	public void enterPassword() {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
	}
	@And("click submit")
	public void clickSubmit(){
		WebElement clickSubmit = driver.findElement(By.className("decorativeSubmit"));
		clickSubmit.click();

}
	@And("click CRMSFA hyperlink")
	public void clickCRMSFA(){
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	}
	@And("click on leads")
	public void clickLead(){
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	}
	
	@And("click on create lead")
	public void clickcreateLeadLink(){
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	}
	@When("add companyName as CTS")
	public void companyName(){
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("CTS");
	}
	
	@And("add firstName as FName1")
	public void firstName(){
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Razik");
	}
	
	@And("add lastName as LName1")	
	public void lastName() throws InterruptedException{
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Moh");
}
	
	@And("click createLead")
	public void createLead(){
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	}
	
	@Then("verify whether lead created successfully")
	public void matchTitle(){
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	
}