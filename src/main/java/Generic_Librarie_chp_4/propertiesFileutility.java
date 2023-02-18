package Generic_Librarie_chp_4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author Yuva
 *
 */
public class propertiesFileutility{
	private Properties property;
	/**
	 * 
	 * @param filepath
	 */
	
	public void propertyFileInitialization(String filepath) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(filepath);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	
	property=new Properties();
	try{
		property.load(fis);
	}catch(IOException e) {
		e.printStackTrace();
	}
	
}
	/**
	 * 
	 * @param key
	 * @return
	 */
public String fetchproper(String key) {
	return property.getProperty(key);
}
}

