package TestLeaf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("moh");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		WebElement findElement = driver.findElement(By.xpath("(//tbody/tr/td/div/a[@class='linktext'])[1]"));
		findElement.click();
		String text = findElement.getText();
		
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String title = driver.getTitle();
		if(title.contains("Duplicate Lead"))
				{
			System.out.println("Title Contains" + title);
		}
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();					
		WebElement findElement2 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String text2 = findElement2.getText();
		if (text==text2){
			System.out.println("Lead ID" + text+" matches duplicated lead id " + text2);
		driver.close();
		
	}
	}

}
