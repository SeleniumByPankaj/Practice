package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelReaderTestNG {

	@DataProvider(name = "getValue")
	public static Object[][] DataSupplier(Method method) throws IOException {

		File file = new File("E:\\Pankaj\\Automation\\01SeptMavenDemo\\EmpWorkSheet.xlsx");

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		System.out.println("Name of the method is "+method.getName());

		XSSFSheet sheet = wb.getSheet("emp");

		int rowCount = sheet.getLastRowNum();

		System.out.println("total number of rows are " + rowCount);
		
		int colCount = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Number of columns are "+colCount);

		Object[][] data = new Object[rowCount][colCount];

		for (int i = 0; i < rowCount; i++) {

			System.out.println("Priting " + i + "th row data");

			for (int j = 0; j < colCount; j++) {

				data[i][j] = sheet.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		return data;
	}

	@Test (dataProvider = "getValue")
	public void printData(String firstName, String lastName, String email, String password) {
		System.out.println("First name is " + firstName);
		System.out.println("last name is " + lastName);
		System.out.println("email is " + email);
		System.out.println("password is " + password);
	}
}
