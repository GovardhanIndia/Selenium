package week2day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExamples {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		//Enter User Name
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		//click login
		driver.findElementByClassName("decorativeSubmit").click();
		//click crmsfa link
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text() = 'Leads']").click();
		driver.findElementByXPath("//a[text() = 'Find Leads']").click();
		driver.findElementByXPath("(//input[@name = 'firstName'])[3]").sendKeys("Hello");
		Thread.sleep(3000);
		System.out.println(driver.findElementByXPath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").getText());
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@src = '/images/fieldlookup.gif'])[2]").click();
		
	}
}
