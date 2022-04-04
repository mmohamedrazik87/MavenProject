package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.agent.builder.AgentBuilder.LocationStrategy;

public class DraggableActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement dragEle = driver.findElement(By.xpath("//p[contains(text(),'Drag me around')]"));
		Point location = dragEle.getLocation();
		int x = location.getX(); 
		int y = location.getY();		
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(dragEle, x+30, 0).perform();
		

	}

}
