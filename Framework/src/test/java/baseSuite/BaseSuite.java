package baseSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class BaseSuite {
	
	@DataProvider(name = "getValue")
	public static Object[][] DataSupplier(Method method) throws IOException {

		File file = new File(System.getProperty("user.dir") + "/data/GmailSignUp.xlsx");

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheet(method.getName());

		int rowCount = sheet.getLastRowNum();

		int colCount = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rowCount][colCount];

		for (int i = 0; i < rowCount; i++) {

			for (int j = 0; j < colCount; j++) {

				data[i][j] = sheet.getRow(i + 1).getCell(j).getStringCellValue();
			}
		}
		return data;
	}

}
