package PracticeHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySuggestionList {

	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Selenium Jars\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver(); 
		driver.get ("https://www.ebay.com/");
		driver.manage().window().maximize();

	}


		
		
		
	}


