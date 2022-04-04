package week4.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.sql.rowset.RowSetWarning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {

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
		System.out.println(rows.size());
		WebElement row = rows.get(0);
		List<WebElement> cols = row.findElements(By.tagName("td"));
		System.out.println(cols.size());
		for (int i = 1; i < rows.size(); i++) {
		WebElement eachRow = rows.get(i);
		List<WebElement> allCols = eachRow.findElements(By.tagName("td"));
		for (int j = 0; j < allCols.size(); j++) {
			WebElement eachCols = allCols.get(j);
			System.out.println(eachCols.getText());
			
			
		}
			
		}

	}

}
