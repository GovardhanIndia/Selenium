package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FramesEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver", "./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("//button[text() = 'Try it']").click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Siva");
		
		driver.switchTo().alert().accept();
		String text = driver.findElementById("demo").getText();
		
		if(text.contains("Siva")) {
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");
		driver.switchTo().defaultContent();
		driver.findElementById("tryhome").click();
	}

}
