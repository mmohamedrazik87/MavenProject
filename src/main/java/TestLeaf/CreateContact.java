package TestLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Mohamed");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Razik");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Moh");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("Razz");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("BFS");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("automation send details");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("mmohamedrazik87@gmail.com");
		WebElement stateProvince = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select selState= new Select(stateProvince);
		selState.selectByVisibleText("Arizona");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		WebElement desc = driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']"));
		desc.clear();
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		

	}

}
