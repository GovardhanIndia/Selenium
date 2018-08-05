package week2day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String leadId;
		boolean flag = false;
		
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
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name = 'firstName'])[3]").sendKeys("Govardhan");
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		Thread.sleep(5000);
/*		driver.findElementByXPath("(//table[@class='x-grid3-row-table'])[1]//a[1]").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("HCL");
		driver.findElementByClassName("smallSubmit").click();	
		Thread.sleep(3000);
*/		//String updatedCompName = driver.findElementById("viewLead_companyName_sp").getText();
		
		
		//driver.close();
		//table
		List<WebElement> table = driver.findElementsByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])");
		
		for(int i = 1; i<=table.size();i++) {
			leadId  = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])["+i+"]/a").getText();
			System.out.println(leadId);

			if(leadId.equals("10918")) {
				driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])["+i+"]/a").click();
				flag = true;
				break;
			}		
		}
		
		/*if(flag==true) {
			driver.findElementByLinkText("Edit").click();
			driver.findElementById("updateLeadForm_companyName").clear();
			driver.findElementById("updateLeadForm_companyName").sendKeys("HCL");
			driver.findElementByClassName("smallSubmit").click();			
		}*/
	
	}
	
}
