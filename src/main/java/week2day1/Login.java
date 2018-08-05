package week2day1;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import utils.WebDriverListener;

public class Login extends WebDriverListener {
	@Test
	public void main() {
		// TODO Auto-generated method stub
			driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		//Enter User Name
		try {
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("Element Not Available");
			
		} catch(Exception e) {
			System.err.println("Hello");
		} finally {
			System.err.println("Finally");
		}
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crmsfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		//Enter First name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Govardhan");
		//Enter Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Surendran");
		//Enter the Phone Number
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9884955591");
		//Create Lead
		driver.findElement(By.name("submitButton")).click();
	}

}
