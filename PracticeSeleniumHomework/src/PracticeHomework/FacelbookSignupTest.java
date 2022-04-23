package PracticeHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacelbookSignupTest {

	public static void main(String[] args) {	
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Jars\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     
	  
	     

	}

}
