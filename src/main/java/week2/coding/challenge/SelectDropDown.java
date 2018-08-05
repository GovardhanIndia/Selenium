package week2.coding.challenge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		WebElement findElementByName = driver.findElementByName("dropdown2");
		Select dd = new Select(findElementByName);
		
		List<WebElement> ddOptions = dd.getOptions();
		for(WebElement options:ddOptions) {
			System.out.println(options.getText());
		}
		int ddSize = ddOptions.size();
		dd.selectByIndex(ddSize-2);
		getCheckBox(driver);
	}

	private static void getCheckBox(ChromeDriver driver) {
		// TODO Auto-generated method stub
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		boolean isSelected = driver.findElementByXPath("//div[@class='example'][2]//input").isSelected();
		
		if(isSelected == true) {
			System.out.println("Check Box is selected");
			driver.findElementByXPath("//div[@class='example'][2]//input").click();
		}
		else
			System.out.println("Check Box is not selected");
		
		
		
		
	}

}
