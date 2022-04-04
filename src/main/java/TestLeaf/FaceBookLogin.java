package TestLeaf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div/a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("MohamedRazik");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("MonnaMohamed");
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("Pa22w0rd@@");
		WebElement dob = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		WebElement monthOfBirth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		WebElement yearOfBirth = driver.findElement(By.xpath("//select[@id='year']"));
		Select dobDd = new Select(dob);
		Select mobDd= new Select(monthOfBirth);
		Select yobDd= new Select(yearOfBirth);		
		dobDd.selectByValue("15");
		mobDd.selectByVisibleText("Sep");
		yobDd.selectByValue("1987");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		
		
		
		
		

	}

}
