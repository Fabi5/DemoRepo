package data;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWriteProperties {

	public static void main(String[] args) throws IOException {
		
		FileInputStream  f = new FileInputStream("C:\\Testing\\prop.propertiess");
        Properties prop = new Properties();
		prop.load(f);		
				
		
		
		String browser  =  prop.getProperty("browser");
		System.out.println(browser);
		
		String incorrectemail = prop.getProperty("incorrectemail");
		System.out.println(incorrectemail);
		
		System.out.println("url");
		System.out.println("testing");
		System.out.println("tool");
		
		prop.setProperty("testcase", "testlink");
		System.out.println(prop.getProperty("testcase"));
	
		prop.setProperty("bug", "jira");
		System.out.println(prop.getProperty("bug"));
		
		FileOutputStream fo = new FileOutputStream("C:\\Testing\\prop.properties");
		prop.store(fo,"Adding to Properties file");
		
	}

}
