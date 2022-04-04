package week4.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RailIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		WebElement txtStationFrom = driver.findElement(By.id("txtStationFrom"));
		txtStationFrom.clear();
		txtStationFrom.sendKeys("TEN", Keys.TAB);
		WebElement txtStationTo = driver.findElement(By.id("txtStationTo"));
		txtStationTo.clear();
		txtStationTo.sendKeys("MS", Keys.TAB);
		WebElement chkSelectDateOnly = driver.findElement(By.id("chkSelectDateOnly"));
		chkSelectDateOnly.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement tableElement = driver
				.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
		List<WebElement> rows = tableElement.findElements(By.tagName("tr"));
		WebElement row1 = rows.get(0);
		List<WebElement> cols = row1.findElements(By.tagName("td"));
		for (int i = 0; i < rows.size(); i++) {
			WebElement eachRows = rows.get(i);
			List<WebElement> Allcols = eachRows.findElements(By.tagName("td"));
			for (int j = 0; j < Allcols.size(); j++) {
				WebElement coltex = Allcols.get(j);
				System.out.println(coltex.getText());
				
				
			}
			
			
		}
		
		
	}

}
