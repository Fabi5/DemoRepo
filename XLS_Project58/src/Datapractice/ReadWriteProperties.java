package Datapractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadWriteProperties {

	public static void main(String[] args) throws IOException {
		
		FileInputStream  prop = new FileInputStream("C:\\Testing\\props.properties");
		Properties  p = new  Properties();
		p.load(prop);
		
		String incorrectemail  = p.getProperty("incorrectemail");
		System.out.println(incorrectemail);
		String browser = p.getProperty("browser");
		System.out.println(browser);
		String bug  = p.getProperty("bug");
		System.out.println(bug);
		String testing  = p.getProperty("testing");
		System.out.println(testing);
		String url  = p.getProperty("url");
		System.out.println(url);
		
		
	}

}
