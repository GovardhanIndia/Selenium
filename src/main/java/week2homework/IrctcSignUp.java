package week2homework;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int indexOfOthers;
		int count = 0;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Launch Application
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		//Click Sign up link
		driver.findElementByLinkText("Sign up").click();
		//Enter the details to signup
		driver.findElementById("userRegistrationForm:userName").sendKeys("Govardhan");
		driver.findElementById("userRegistrationForm:password").sendKeys("Hello@321");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Hello@321");
		driver.findElementById("userRegistrationForm:securityQ").sendKeys("What make was your first car or bike?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Swift");
		WebElement preferLang = driver.findElementById("userRegistrationForm:prelan");
		Select objLang = new Select(preferLang);
		objLang.selectByValue("en");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Govardhan");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		WebElement dayObj = driver.findElementById("userRegistrationForm:dobDay");
		Select dayObjRef = new Select(dayObj);
		dayObjRef.selectByVisibleText("06");
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("JUL");
		driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1985");
		//WebElement occObj = driver.findElementById("userRegistrationForm:occupation");
		Select occObjRef = new Select(driver.findElementById("userRegistrationForm:occupation"));
		List<WebElement> occList = occObjRef.getOptions();
		
		for(WebElement occListNew: occList) {
			System.out.println(occListNew.getText());
			
			if(occListNew.getText().equals("Others")) {
				indexOfOthers = occList.indexOf(occListNew);
				occObjRef.selectByIndex(indexOfOthers);
			}
		}
		WebElement cntryDDObj = driver.findElementById("userRegistrationForm:countries");
		Select ddObj = new Select(cntryDDObj);
		
		int index = 0;
		List<WebElement> countryList = ddObj.getOptions();
		int ddSize[] = new int[countryList.size()];
		
		for(WebElement countryListNew: countryList) {
			if(countryListNew.getText().startsWith("E")){
				ddSize[index] = countryList.indexOf(countryListNew);
				index++;
			}				
		}
		
		if(index>=1) {
			ddObj.selectByIndex(ddSize[1]);
		}
		
		/*driver.findElementById("userRegistrationForm:email").sendKeys("govardhan.chennai@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9884955591");
		
		WebElement objNationality = driver.findElementById("userRegistrationForm:nationalityId");
		Select objRefNat = new Select(objNationality);
		objRefNat.selectByValue("94");
		driver.findElementById("userRegistrationForm:address").sendKeys("Door no 4");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600040", Keys.TAB);
		Thread.sleep(5000);
		WebElement objCityName = driver.findElementById("userRegistrationForm:cityName");
		Select objCityName1 = new Select(objCityName);
		objCityName1.selectByIndex(1);
		Thread.sleep(3000);
		WebElement objPO = driver.findElementById("userRegistrationForm:postofficeName");
		Select objPO1 = new Select(objPO);
		List<WebElement> options = objPO1.getOptions();
		for(WebElement occListNew: options) {
			System.out.println(occListNew.getText());
			System.out.println(options.indexOf(occListNew));
		}
		objPO1.selectByIndex(1);
		driver.findElementById("userRegistrationForm:landline").sendKeys("26211960");
*/	
	}

}
