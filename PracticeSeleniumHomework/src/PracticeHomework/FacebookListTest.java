package PracticeHomework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookListTest {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Selenium Jars\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     
	     List<WebElement>allLinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li/a"));
	    	 System.out.println(allLinks.size());
	    		 
	    		 
	    		   for (int i=0; i<allLinks.size(); i++){
	    			System.out.println(allLinks.get(i).getText()); 
	    			 
	    		 }
	    		 {
	    		
	    		 }
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	
	}

}
