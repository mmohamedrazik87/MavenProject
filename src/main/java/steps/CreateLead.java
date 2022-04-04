package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {


	@And("click on leads")
	public void clickLead1(){
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	}
	
	@And("click on create lead")
	public void clickcreateLeadLink1(){
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	}
	@When("add companyName as CTS")
	public void companyName1(){
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("CTS");
	}
	
	@And("add firstName as FName1")
	public void firstName1(){
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Razik");
	}
	
	@And("add lastName as LName1")	
	public void lastName1() throws InterruptedException{
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Moh");
}
	
	@And("click createLead")
	public void createLead1(){
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	}
	
	@Then("verify whether lead created successfully")
	public void matchTitle1(){
		String title = driver.getTitle();
		System.out.println(title);
	}

}
