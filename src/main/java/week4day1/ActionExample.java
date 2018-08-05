package week4day1;

import java.util.ResourceBundle.Control;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		WebElement item2 = driver.findElementByXPath("//ul[@id='sortable']/li[2]");
		WebElement item4 = driver.findElementByXPath("//ul[@id='sortable']/li[4]");
		
		Actions builder = new Actions(driver);
		int x = item4.getLocation().getX();
		int y = item4.getLocation().getY();
		
		/*builder.click(item1).perform();
		builder.click(item3).perform();
		builder.click(item5).perform();*/
		
		builder.dragAndDropBy(item2, x, y).perform();
	}
}
