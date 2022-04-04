
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://brandportal.qa.bp.opsecol.net/review/listings/all");
		WebElement userName = driver.findElement(By.name("username"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(userName)).sendKeys("qa_shd1_user2");
		driver.findElement(By.name("password")).sendKeys("Testing123!");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//WebElement target = driver.findElement(By.className("material-icons menu-icon clickable"));
		WebElement mainButton = driver.findElement(By.xpath("//div[@class='material-icons menu-icon clickable']"));
		//wait.until(ExpectedConditions.elementToBeClickable(mainButton)).click();
		Thread.sleep(5000);
		mainButton.click();
	
		//Actions builder = new Actions(driver);
		//builder.moveToElement(target).perform();
		//builder.moveToElement(driver.findElement(By.linkText("All Listings"))).click().perform();
		//driver.findElement(By.className("glyphicon glyphicon-filter")).click();
		//driver.findElement(By.className("btn btn-danger")).click();
		//driver.close();
		

		
		
	}

}
