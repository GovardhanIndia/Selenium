package week2day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSeleniumProject {

	public static void main(String[] args) {
		//Launch 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("http://leaftaps.com/opentaps");
		//Enter User Name
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		//click login
		driver.findElementByClassName("decorativeSubmit").click();
		//click crmsfa link
		driver.findElementByLinkText("CRM/SFA").click();
		//Click Create Lead
		driver.findElementByLinkText("Create Lead").click();
		//Enter Company name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		//Enter First name
		driver.findElementById("createLeadForm_firstName").sendKeys("Govardhan");
		//Enter Last name
		driver.findElementById("createLeadForm_lastName").sendKeys("Surendran");
		//Create Lead
		//driver.findElementByName("submitButton").click();
		
		
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select objSource = new Select(source);
		objSource.selectByVisibleText("Public Relations");
		WebElement marketCampign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select mcObject = new Select(marketCampign);
		List<WebElement> mcOptions = mcObject.getOptions();
		int mcSize = mcOptions.size();
		System.out.println("Size of the Mc " +mcSize);
		mcObject.selectByIndex(mcSize - 3);

	}

}
