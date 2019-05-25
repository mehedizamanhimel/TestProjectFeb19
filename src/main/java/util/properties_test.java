package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties_test {
	
	public Properties properties = new Properties();
	File file = new File("testData.properties");
	
	public properties_test () throws IOException {
		FileInputStream filetwo = new FileInputStream(file);
		properties.load(filetwo);
		filetwo.close();
		
	}

}
