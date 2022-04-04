package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		WebElement fstElement = driver.findElement(By.xpath("(//ul[@id='sortable']/li)[1]"));
		WebElement ThrdEle = driver.findElement(By.xpath("(//ul[@id='sortable']/li)[3]"));
		WebElement svnthElement = driver.findElement(By.xpath("(//ul[@id='sortable']/li)[7]"));
		WebElement sixthElement = driver.findElement(By.xpath("(//ul[@id='sortable']/li)[6]"));
		Actions builder = new Actions(driver);
		//builder.dragAndDrop(fstElement, svnthElement).build().perform();
		//builder.dragAndDrop(ThrdEle, sixthElement).build().perform();
		builder.clickAndHold(fstElement).moveToElement(sixthElement).click(sixthElement).build().perform();

	}

}
