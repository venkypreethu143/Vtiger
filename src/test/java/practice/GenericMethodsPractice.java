package practice;

import java.io.IOException;

import vTiger.GenericLibrary.ExcelFileLibrary;
import vTiger.GenericLibrary.JavaLibrary;
import vTiger.GenericLibrary.PropertyFileLibrary;

public class GenericMethodsPractice {
	
	public static void main(String[] args) throws IOException {
		
		JavaLibrary jLib = new JavaLibrary();
		PropertyFileLibrary pLib = new PropertyFileLibrary();
		ExcelFileLibrary eLib = new ExcelFileLibrary();
		
		String date = jLib.getSystemDate();
		System.out.println(date);
		String date1 = jLib.getSystemDateInFormat();
		System.out.println(date1);
		
		
		String value = pLib.readDataFromPropertyFile("browser");
		System.out.println(value);
		String value1 = pLib.readDataFromPropertyFile("username");
		System.out.println(value1);
		
		
		String val = eLib.readDataFromExcel("Organization", 1, 2);
		System.out.println(val);
		int row = eLib.getRowCount("Contacts");
		System.out.println(row);
		eLib.writeDataIntoExcel("Organization", 7, 8, "Preetham");
		
	}			
}		