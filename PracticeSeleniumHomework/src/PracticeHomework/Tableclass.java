package PracticeHomework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tableclass {

	public static void main(String[] args) {
		
		

		  // System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		  // FirefoxDriver driver = new FirefoxDriver();
		   
		   System.setProperty("webdriver.chrome.driver","C:\\Selenium Jars\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/sql/sql_join_inner.asp");
			
			
       //  List<WebElement> rows= driver.findElements(By.xpath("//div[@class=\"w3-responsive\"][2]//tr"));
         // System.out.println("Number of Rows: "+rows.size());
        //  List<WebElement> col= driver.findElements(By.xpath("//div[@class=\"w3-responsive\"][2]//th"));
        //  System.out.println("Number of Rows: "+col.size());
			

        WebElement rows= driver.findElement(By.xpath("//div[@class=\"w3-responsive\"][2]//tr[2]"));
           System.out.println("Number of Rows: "+rows.getSize());
	}
	
	////div[@class="w3-responsive"][2]//tr[2]/td

}
           //div[class="w3-responsive"][2]//tr


