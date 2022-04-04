package assignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotAs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		WebElement sixthElement = driver.findElement(By.xpath("(//ul[@id='sortable']/li)[6]"));
		// Taking snap shot
		//File takeScreenShot = driver.getScreenshotAs(OutputType.FILE);
		//To take an particular Element
		File EleScreenshot = sixthElement.getScreenshotAs(OutputType.FILE);
		// Create an image file to store the screen shot
		File image = new File("./snaps/image001.jpg");
		// Merging temp screenshot and image file together
		FileUtils.copyFile(EleScreenshot, image);

	}

}
