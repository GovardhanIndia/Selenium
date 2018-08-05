package week2day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
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
		//Click Create Lead
		/*driver.findElementByLinkText("Create Lead").click();
		//Enter Company name
		driver.findElementById("createLeadForm_companyName").sendKeys("HCL");
		//Enter First name
		driver.findElementById("createLeadForm_firstName").sendKeys("Govardhan");
		//Enter Last name
		driver.findElementById("createLeadForm_lastName").sendKeys("Surendran");
		//Enter the Phone Number
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9884955591");
		//Create Lead
		driver.findElementByName("submitButton").click();
		Thread.sleep(5000);*/
		//editLead(driver);
		duplicateLead(driver);
		
		//deleteLead(driver);
	}
	
	private static void deleteLead(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
		driver.findElementByName("phoneNumber").sendKeys("9884955591");
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		Thread.sleep(5000);
		String leadId = driver.findElementByXPath("(//table[@class='x-grid3-row-table'])[1]//a[1]").getText();
		System.out.println(leadId);
		driver.findElementByXPath("(//table[@class='x-grid3-row-table'])[1]//a[1]").click();
		driver.findElementByLinkText("Delete").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//div[@class='x-form-item x-tab-item'])[2]//input").sendKeys(leadId);
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		Thread.sleep(3000);
		
		if(driver.findElementByClassName("x-paging-info").getText().equals("No records to display")) {
			System.out.println(driver.findElementByClassName("x-paging-info").getText());
		}
		
	}

	private static void duplicateLead(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
		driver.findElementByName("emailAddress").sendKeys("govardhan.chennai@gmail.com");
		
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		Thread.sleep(5000);
		String leadName = driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[1]/following-sibling::td[2]//a").getText();
		//String leadName = driver.findElementByXPath("//td[@class = 'x-grid3-col x-grid3-cell x-grid3-td-firstName '][1]//a").getText();
		System.out.println(leadName);
		driver.findElementByXPath("(//table[@class='x-grid3-row-table'])[1]//a[1]").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		
		if(driver.findElementById("sectionHeaderTitle_leads").getText().equals("Duplicate Lead")) {
			System.out.println(driver.findElementById("sectionHeaderTitle_leads").getText());
			driver.findElementByClassName("smallSubmit").click();	
			System.out.println(driver.findElementById("viewLead_firstName_sp").getText());
			
			if(driver.findElementById("viewLead_firstName_sp").getText().equals(leadName)) {
				System.out.println("Duplicate Lead Created Successfully");
			}
		}
		
	}

	private static void editLead(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		String leadId;
		boolean flag = false;
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name = 'firstName'])[3]").sendKeys("Govardhan");
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//table[@class='x-grid3-row-table'])[1]//a[1]").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("TCS");
		driver.findElementByClassName("smallSubmit").click();	
		Thread.sleep(3000);
		String updatedCompName = driver.findElementById("viewLead_companyName_sp").getText();
		
		if(updatedCompName.contains("TCS")) {
			System.out.println("Company name updated successfully");
		}
		driver.close();
		//table
		/*List<WebElement> table = driver.findElementsByXPath("(//table[@class='x-grid3-row-table'])");
		
		for(int i = 1; i<=table.size();i++) {
			leadId  = driver.findElementByXPath("(//table[@class='x-grid3-row-table'])["+i+"]/tbody/tr/td//a").getText();
			System.out.println(leadId);

			if(leadId.equals("11193")) {
				driver.findElementByXPath("(//table[@class='x-grid3-row-table'])["+i+"]/tbody/tr/td//a").click();
				flag = true;
				break;
			}		
		}
		
		if(flag==true) {
			driver.findElementByLinkText("Edit").click();
			driver.findElementById("updateLeadForm_companyName").clear();
			driver.findElementById("updateLeadForm_companyName").sendKeys("HCL");
			driver.findElementByClassName("smallSubmit").click();			
		}
*/	
	
	}
}




/*List<WebElement> leadIdVal = driver.findElementsByXPath("(//div[@class = 'x-grid3-scroller'])[1]//tbody/tr/td[1]");

for(WebElement TableLeadId:leadIdVal) {
	leadId = TableLeadId.getText();

	if(leadId.equals("10432")) {
		driver.findElementByXPath("(//div[@class = 'x-grid3-scroller'])[1]//tbody/tr/td[1]//a").click();
	}
}*/


//List<WebElement> data = table.findElements(By.tagName("td"));

/*for(WebElement newData : data) {
	System.out.println(newData.getText());
}*/

//data.get(0).findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[3]/a")).click();		
