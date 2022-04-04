package newsteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass {

	@Given("Launch Chrome browser")
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	}
	@And("Enter username as DemosalesManager")
	public void enterUserName1() {
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
	}
	@And("Enter Password as CRMSFA")
	public void enterPassword1() {
		WebElement password1 = driver.findElement(By.id("password"));
		password1.sendKeys("crmsfa");
	}

	@And("And click CRMSFA hyperlink")
	public void clickCRMSFA() {
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		String title = driver.getTitle();
		if (title.contains("home")) {
			System.out.println("Home Page Displayed");
		}

		else {
			System.out.println("Home Page NOT Displayed");
		}

	}

}
