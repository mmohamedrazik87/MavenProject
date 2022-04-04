package learnTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFindLeads extends ProjectSpecificMethod {
	@Test
	public  void tc004() throws InterruptedException  {
		// TODO Auto-generated method stub
			
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'First name:')])[3]/following::input[@name='firstName']")).sendKeys("test");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//tr/td/div/a[@class='linktext'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement companyName = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		companyName.clear();
		companyName.sendKeys("CTS");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String finalText = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(finalText);
			
		
		

	}

}
