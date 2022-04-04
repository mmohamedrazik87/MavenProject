import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverclose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://brandportal.qa.bp.opsecol.net/review/listings/all");
		driver.findElement(By.name("username")).sendKeys("qa_shd1_user2");
		driver.findElement(By.name("password")).sendKeys("Testing123!");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();
		driver.close();

	}

}
