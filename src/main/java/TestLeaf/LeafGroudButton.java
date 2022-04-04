package TestLeaf;

import java.awt.Color;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroudButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();	
		driver.navigate().to("http://leafground.com/home.html");
		driver.manage().window().maximize();
		driver.findElement(ByXPath.xpath("(//h5[contains(text(),'Button')])[1]")).click();
		driver.navigate().back();
		driver.findElement(ByXPath.xpath("(//h5[contains(text(),'Button')])[1]")).click();
		driver.findElement(ByXPath.xpath("//button[@id='home']")).click();
		driver.findElement(ByXPath.xpath("(//h5[contains(text(),'Button')])[1]")).click();
		driver.findElement(ByXPath.xpath("//button[@id='position']")).click();
		WebElement findColor = driver.findElement(ByXPath.xpath("//button[@id='color']"));
		String cssValue = findColor.getCssValue("color");
		String asHex = org.openqa.selenium.support.Color.fromString(cssValue).asHex();
		System.out.println("color is " + asHex);
		
		
		
		
		
		//http://leafground.com/pages/button.html

	}

}
