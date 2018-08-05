package day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.ConnectionClosedException;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstProgram {
	
	public static void main(String args[]) throws InterruptedException {
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		//Enter User Name
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crmsfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement ele = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(ele);
		dd.selectByValue("Govardhan");
*/	
		
	String text = "Transaction 6554022 dated 16 Jul 2018 for 1.27 GBP has been approved successfully. New status is Scheduled.";
	System.out.println(text.replaceAll("[^0-9]", ""));
	String[] split = text.split("dated");	
	String transactionId = split[0].replaceAll("[^0-9]", "");
	
	
	
	
	}
	
	
	public String[][] readFromExcel(String sheetName, XSSFWorkbook wbook) throws IOException {
		XSSFSheet sheet = wbook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		XSSFRow headerRow = sheet.getRow(0);
		int lastCellNum = headerRow.getLastCellNum();
		String[][] data = new String[rowCount][lastCellNum];
		
		for(int i = 1;i<=rowCount;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<lastCellNum;j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				data[i-1][j] = value;
			}				
		}	
		return data;
	}
	
	public void writeToExcel(XSSFWorkbook wbook, String sheetName, String columnName, int rowVal, String content){
		XSSFSheet sheet = wbook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		XSSFRow headerRow = sheet.getRow(0);
		int lastCellNum = headerRow.getLastCellNum();
		String[][] data = new String[rowCount][lastCellNum];
		
		for(int i = 0;i<=rowCount;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<lastCellNum;j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				//data[i-1][j] = value;
				if(value.equals(columnName)) {
					data[i+rowVal][j] = content;
					cell.setCellValue(data[i+rowVal][j]);
				}
			}	
		}			
	}
				

	
	
}
 

