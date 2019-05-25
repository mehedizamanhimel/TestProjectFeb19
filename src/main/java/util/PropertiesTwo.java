package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTwo {
	
	public Properties property = new Properties();
	File testFile = new File("testData.properties");
	
	public PropertiesTwo() throws IOException  {
		FileInputStream file = new FileInputStream(testFile);
		property.load(file);
		file.close();
	}

}
