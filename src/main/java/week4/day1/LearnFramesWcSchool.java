package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFramesWcSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(ByXPath.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Razik");
		alert.accept();
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		if (text.contains("Razik")) {
			System.out.println("text has Razik");

		}
		driver.switchTo().defaultContent();
		driver.findElement(ByXPath.xpath("//a[@title='Change Orientation']")).click();

	}
}
