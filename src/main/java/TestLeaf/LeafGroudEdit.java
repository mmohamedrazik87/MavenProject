package TestLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroudEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("mmohamedrazik87@gmail.com");
		WebElement appendText = driver.findElement(ByXPath.xpath("//input[@value='Append ']"));
		String text = appendText.getText();
		appendText.clear();
		appendText.sendKeys(text + "Added Text", Keys.TAB);
		String defaultText = driver.findElement(ByXPath.xpath("//input[@value='TestLeaf']")).getText();
		System.out.println("Default text entered is " + defaultText);
		WebElement clearText = driver.findElement(ByXPath.xpath("//input[@value='Clear me!!']"));
		clearText.clear();
		WebElement clickEle = driver
				.findElement(ByXPath.xpath("//label[contains(text(),'Confirm that edit field is disabled')]"));
		boolean enabled = clickEle.isEnabled();
		System.out.println(enabled);
		if (clickEle.isEnabled()) {
			System.out.println("Text box First name is Enabled. ");
			
		} else {
			System.out.println("Text box First name is Disabled. ");
		}

	

	}

}
