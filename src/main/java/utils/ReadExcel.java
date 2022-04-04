package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// To Open an excel file
		XSSFWorkbook book = new XSSFWorkbook("./testData/tc001.xlsx");
		// To open the sheet from excel file
		XSSFSheet sheet = book.getSheetAt(0);
		// To find active rows in the excel file
		int rowNum = sheet.getLastRowNum();
		System.out.println(rowNum);
		// To find active columns in the excel file
		int colCount = sheet.getRow(0).getLastCellNum();
		System.out.println(colCount);
		// Iterate the rows using for loop
		for (int i = 1; i <= rowNum; i++) {
			XSSFRow eachRow = sheet.getRow(i);
			//Iterate the cols inside the row to get the data
			for (int j = 0; j < colCount; j++) {
				String value = eachRow.getCell(j).getStringCellValue();
				System.out.println(value);

			}

			book.close();

		}

	}

}
