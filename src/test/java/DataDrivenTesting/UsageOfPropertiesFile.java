package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UsageOfPropertiesFile {

	public static void main(String[] args) throws IOException {
		//To Load the File into Java Stream
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		
		//Create the Objet of Properties
		Properties pobj = new Properties();
		
		//To Load the FileInputStream to properties
		pobj.load(fis);
		
		//Use the keys to read the values
		String browser = (String) pobj.getProperty("browser");
		System.out.println(browser);
	}
	
}

