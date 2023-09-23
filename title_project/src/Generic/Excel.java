package Generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements Framework_constant
{
 public static String fetchdata(int r, int c) throws EncryptedDocumentException, IOException
 {
	 FileInputStream fis = new FileInputStream(expath);
	 Workbook wk = WorkbookFactory.create(fis);
	 Sheet sheet = wk.getSheet("Sheet1");
	 Row row = sheet.getRow(r);
	 Cell cell = row.getCell(c);
	 String data = cell.getStringCellValue();
	 return data;
 }
}
