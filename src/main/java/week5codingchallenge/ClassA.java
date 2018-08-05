package week5codingchallenge;

import org.testng.annotations.*;


public class ClassA {
	 
	@BeforeSuite
	public void methodBeforeSuite() {
		System.out.println("I am in the methodBeforeSuite");
	}
	
	@BeforeSuite
	public void methodBeforeSuite1() {
		System.out.println("I am in the methodBeforeSuite1");
	}
	
	@BeforeTest
	public void methodBeforeTest() {
		System.out.println("I am in the methodBeforeTest");
	}
	
	@BeforeTest
	public void methodBeforeTest1() {
		System.out.println("I am in the methodBeforeTest1");
	}
	
	
	@BeforeClass
	public void methodBeforeClass() {
		System.out.println("I am in the methodBeforeClass");
	}
	
	@BeforeClass
	public void methodBeforeClass1() {
		System.out.println("I am in the methodBeforeClass1");
	}
	
	@BeforeMethod
	public void methodBeforeMethod() {
		System.out.println("I am in the methodBeforeMethod");
	}
	
	@BeforeMethod
	public void methodBeforeMethod1() {
		System.out.println("I am in the methodBeforeMethod1");
	}
	
	@Test
	void methodTest() {
		System.out.println("I am in the methodTest");
	}
	
	@Test
	void methodTest1() {
		System.out.println("I am in the methodTest1");
	}
	
	@AfterMethod
	public void methodAfterethod() {
		System.out.println("I am in the methodAfterMethod");
	}
	
	@AfterMethod
	public void methodAfterMethod1() {
		System.out.println("I am in the methodAfterMethod1");
	}
	
	@AfterClass
	public void methodAfterClass() {
		System.out.println("I am in the methodAfterClass");
	}
	
	@AfterClass
	public void methodAfterClass1() {
		System.out.println("I am in the methodAfterClass1");
	}
	
	@AfterTest()
	public void methodAfterTest() {
		System.out.println("I am in the methodAfterTest");
	}
	
	@AfterTest
	public void methodAfterTest1() {
		System.out.println("I am in the methodAfterTest1");
	}
	
	@AfterSuite
	public void methodafterSuite() {
		System.out.println("I am in the methodAfterSuite");
	}
	
	@AfterSuite
	public void methodAfterSuite1() {
		System.out.println("I am in the methodAfterSuite1");
	}
	
}