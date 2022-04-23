package PracticeHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		String s = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
		System.out.println(s);
		Thread.sleep(1000);
        driver.findElement(By.id("gh-ac")).sendKeys("heater");
       
	      String p = driver.findElement(By.id("gh-ac")).getAttribute("value");
	      System.out.println(p);
	    
	    
	 

	}

}
