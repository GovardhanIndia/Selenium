package week4day1;

import java.util.ResourceBundle.Control;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElementByXPath("//ol[@id = 'selectable']/li[1]");
		WebElement item3= driver.findElementByXPath("//ol[@id = 'selectable']/li[3]");
		WebElement item5 = driver.findElementByXPath("//ol[@id = 'selectable']/li[5]");
		Actions builder = new Actions(driver);
		driver.getKeyboard().sendKeys(Keys.CONTROL);
		builder.moveToElement(item1);
		/*builder.click(item1).perform();
		builder.click(item3).perform();
		builder.click(item5).perform();*/
		
		item1.click();		
		item3.click();
		item5.click();		
	}
}
