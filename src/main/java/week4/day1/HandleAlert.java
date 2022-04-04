package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(ByXPath.xpath("//button[text()='Confirm Box']")).click();
		alert.dismiss();
		String text = driver.findElement(ByXPath.xpath("//p[@id='result']")).getText();
		System.out.println(text);
		driver.findElement(ByXPath.xpath("//button[text()='Prompt Box']")).click();
		alert.sendKeys("TestLeaf");
		alert.accept();
		String text2 = driver.findElement(ByXPath.xpath("//p[@id='result1']")).getText();
		System.out.println(text2);
		driver.findElement(ByXPath.xpath("//button[text()='Sweet Alert']")).click();
		driver.findElement(ByXPath.xpath("//button[text()='OK']")).click();

	}

}
