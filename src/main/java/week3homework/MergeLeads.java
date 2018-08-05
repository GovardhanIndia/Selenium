package week3homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLeads {

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
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		//Click on the Icon next to From Lead
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		//To find the number of windows currently available for the Driver
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String newWindowHandles : windowHandles )
			System.out.println(newWindowHandles);
		//To get the Windows
		List<String> windowHandlesList = new ArrayList<String>();
		windowHandlesList.addAll(windowHandles);
		
		//Switch to the Second Window
		driver.switchTo().window(windowHandlesList.get(1));
		driver.manage().window().maximize();
		driver.findElementByName("id").sendKeys("11060");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.findElementByLinkText("11060").click();
		Thread.sleep(5000);
		//Switch Back to the first window
		driver.switchTo().window(windowHandlesList.get(0));
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		windowHandles = driver.getWindowHandles();
		for(String newWindowHandles : windowHandles )
			System.out.println(newWindowHandles);
		windowHandlesList.addAll(windowHandles);
		driver.switchTo().window(windowHandlesList.get(3));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElementByName("id").sendKeys("11060");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.findElementByLinkText("11060").click();
		Thread.sleep(3000);
		driver.switchTo().window(windowHandlesList.get(2));
		driver.findElementByLinkText("Merge").click();
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").sendKeys("10736");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		if(driver.findElementByClassName("x-paging-info").getText().equals("No records to display")) {
			System.out.println(driver.findElementByClassName("x-paging-info").getText());
		}
		
		
		
	}

}
