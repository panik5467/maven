package com.example;
 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;
 
/**
 * @author Crunchify.com
 * 
 */
 
public class PropertyValues {
	String result = "";
	InputStream inputStream;
	FileInputStream fis;
 
	public String getPropValues() throws IOException {
 
		try {
			Properties prop = new Properties();
			String propFileName = "/applications/config.properties";
 
			//inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			fis = new FileInputStream(propFileName);
 
			if (fis != null) {
				prop.load(fis);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
 
			Date time = new Date(System.currentTimeMillis());
 
			// get the property value and print it out
			String result = String.join(" - ",
				prop.getProperty("user"),
				prop.getProperty("company1"),
				prop.getProperty("company2"),
				prop.getProperty("company3")
			);

			System.out.println(result);
 
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			fis.close();
		}
		return result;
	}
}