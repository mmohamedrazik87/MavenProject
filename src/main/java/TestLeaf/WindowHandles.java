package TestLeaf;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();	
		driver.navigate().to("http://leafground.com/home.html");
		driver.findElement(ByXPath.xpath("//img[@alt='Windows']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Open Multiple Windows')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> handles = new ArrayList<String>(windowHandles);
		System.out.println(handles);
		driver.switchTo().window(handles.get(1));
		driver.manage().window().maximize();
	

		
		
		
		
		
	}

}
