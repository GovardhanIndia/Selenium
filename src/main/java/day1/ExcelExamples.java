package day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExcelExamples {
	
	public String testCaseName, testDesc, nodeName, author, category, excelFileName, sheetName, workBookName;
	public static XSSFWorkbook wbook;
	
	@BeforeSuite
	public void beforeSuite() throws IOException {
		wbook = new XSSFWorkbook("./data/WPFAutomation.xlsx");
	}
	
	
	@Test(dataProvider = "Test") // (invocationCount = 2, timeOut = 95000)
	public void initiateACIPayment(String payeeAccount, String fromAccount, String amount, String transactionId ) throws InterruptedException {
		
		
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



