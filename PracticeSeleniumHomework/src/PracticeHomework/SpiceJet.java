package PracticeHomework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.spicejet.com/");
	    
//	   WebElement  student = driver.findElement(By.xpath("//div[@class=\"css-1dbjc4n\"]"));
//		
//	    Actions builder = new Actions(driver);
//		 builder.moveToElement(student).build().perform();
		 Thread.sleep(2000);
//		 List<WebElement> all = driver.findElements(By.xpath("//div[@class=\"css-1dbjc4n r-18u37iz r-1w6e6rj r-e65kyq r-1t2hasf\"]//a"));
//		 System.out.println(all.size());
//		 
//		 for( WebElement a : all) {
//			 System.out.println(a.getText());
//		 }
//		 
//		  driver.findElement(By.linkText("Student Discount")).click();
				   
	   // WebElement radio  = driver.findElement(By.className("class=\"css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-117bsoe r-1mf7evn r-1otgn73\""));
		 // radio.click();
		 
		  driver.findElement(By.xpath("//div[@data-testid=\"round-trip-radio-button\"]")).click();

		
		
	}

}
