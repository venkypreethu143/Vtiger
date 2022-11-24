package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UsageOfExcelSheet {
	public static void main(String[] args) throws IOException{
		//To Load the File into Java Stream
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		
		//Create a workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		//Navigate to Required Sheet
		Sheet sh = wb.getSheet("contact");
		
		//Navigate to Required Row inside the Sheet
		Row rw = sh.getRow(3);
		
		//Navigate to Required Cell inside the Sheet
		Cell ce = rw.getCell(3);
		
		//Read the value Present in the cell
		String Value = ce.getStringCellValue();
		System.out.println(Value);
	}
}
