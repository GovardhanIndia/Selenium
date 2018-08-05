package week5codingchallenge;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassB extends ClassA{
	
	@BeforeSuite
	public void methodBeforeSuite() {
		System.out.println("I am in the @Before Suite of the Sub Class B");
	}
	
	@BeforeTest
	public void methodBeforeTest() {
		System.out.println("I am in the @Before Test of the Sub Class B");
	}
	
	@BeforeClass
	public void methodBeforeClass() {
		System.out.println("I am in the @Before Class of the Sub Class B");
	}
	
	@BeforeMethod
	public void methodBeforeMethod() {
		System.out.println("I am in the @Before Method of the Sub Class B");
	}
	
	@Test
	void methodTest() {
		System.out.println("I am in the Sub Class @ Test Method");		
	}
	
	@AfterSuite
	public void methodAfterSuite() {
		System.out.println("I am in the @After Suite of the Sub Class B");
	}
	
	@AfterTest
	public void methodAfterTest() {
		System.out.println("I am in the @After Test of the Sub Class B");
	}
	
	@AfterClass
	public void methodAfterClass() {
		System.out.println("I am in the @After Class of the Sub Class B");
	}
	
	@AfterMethod
	public void methodAfterMethod() {
		System.out.println("I am in the @After Method of the Sub Class B");
	}


}
