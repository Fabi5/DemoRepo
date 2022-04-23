package PracticeHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLoginTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium Jars\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-CA&.intl=ca&.done=https%3A%2F%2Fmail.yahoo.com%2Fdll");

	    driver.findElement(By.id("login-username")).sendKeys("asha@abc.com");
	    driver.findElement(By.id("login-signin")).click();
	    String expectedErr ="Sorry, we don't recognize this email.";
	    String actualErr = driver.findElement(By.id("username-error")).getText();
	     
	    if (expectedErr.equals(actualErr)) {
	    	
	    	System.out.println("pass");
	    }else
	    
	    System.out.println("fail");
	}

}
