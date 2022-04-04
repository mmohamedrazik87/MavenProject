package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.findElement(ByXPath.xpath("//img[@alt='Windows']")).click();
		String windowHandle = driver.getWindowHandle();
		driver.findElement(ByXPath.xpath("//button[contains(text(),'Open Multiple Windows')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.print(windowHandles);
		List<String> windowsList = new ArrayList<>(windowHandles);
		driver.switchTo().window(windowsList.get(1));
		driver.manage().window().maximize();
		driver.close();
		driver.switchTo().window(windowHandle);
		driver.manage().window().maximize();
	}

}
