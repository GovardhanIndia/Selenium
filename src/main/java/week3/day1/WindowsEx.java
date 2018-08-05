package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Contact Us").click();
		Set<String> allWindows = driver.getWindowHandles();
				
		for(String winCollection: allWindows) {
			System.out.println(winCollection);
		}
		List<String> listOfWin = new ArrayList<String>();
		
		listOfWin.addAll(allWindows);
		driver.switchTo().window(listOfWin.get(1));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.switchTo().window(listOfWin.get(0));		
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(listOfWin.get(1));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}

}
