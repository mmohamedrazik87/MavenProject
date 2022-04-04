package test;

import org.openqa.selenium.By.ByXPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestInv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/sri-lanka-in-india-2021-22-1278665/india-vs-sri-lanka-2nd-test-1278683/full-scorecard");
		WebElement findElement = driver.findElement(ByXPath.xpath("//span[@class='cursor-pointer']"));
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='cursor-pointer']/../following-sibling::td"));
		for (int i = 0; i <= findElements.size(); i++) {
			
			System.out.println(findElements.get(i));
			
			
			
		}
/*		String text = findElement.getText();
		if (text.contains("run out"))
		{
			System.out.println("The Batsman got run out");
		}
	}*/
	

}
}
