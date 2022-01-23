package TestInfo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static String readExcel(int row,int cell,String sheetName) throws IOException{
		File f =new File ("C:\\Users\\thula\\OneDrive\\Desktop\\Flipkart.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook W = new XSSFWorkbook(fin);
		Sheet sheet = W.getSheet(sheetName);
	Row r = sheet.getRow(row);
	Cell cell2 = r.getCell(cell);
	String value = cell2.getStringCellValue();
	return value;
	}

}
