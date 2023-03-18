package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {

		// create an object of file class to locate xlsx file

		File file = new File("E:\\Pankaj\\Automation\\01SeptMavenDemo\\EmpWorkSheet.xlsx");

		// create an object of fileInputStream class to read file

		FileInputStream fis = new FileInputStream(file);

		// creating workbook instatnce that refers to .xlsx file

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// creating sheet object that refers to specific sheet in workbook

		XSSFSheet sheet = wb.getSheet("emp");

		// get all the rows in sheet

		int rowCount = sheet.getLastRowNum();
		
		System.out.println("total number of rows are " + rowCount);

		// row iteration

		for (int i = 1; i <= rowCount; i++) {

			// getting a column count wrt first row

			int colCount = sheet.getRow(i).getLastCellNum();

			System.out.println("Priting " + i + "th row data");

			// iterating over columns
			
			for (int j = 0; j < colCount; j++) {
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue() + " ");
			}
		}

	}

}
