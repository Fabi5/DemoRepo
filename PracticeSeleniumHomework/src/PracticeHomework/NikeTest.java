package PracticeHomework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Selenium Jars\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://www.nike.com/ca");
		 Thread.sleep(2000);
		 //WebElement collection = driver.findElement(By.xpath("//li[@class=\"pre-desktop-menu-item d-lg-ib is-static is-header\"][6]"));
		 //WebElement collection = driver.findElement(By.linkText("Women"));
		driver.findElement(By.linkText("Careers"));
		// Actions builder = new Actions(driver);
		 // builder.moveToElement (collection).build().perform();
		  
		 // Thread.sleep(2000);
		 // List<WebElement> allLinks = driver.findElements(By.xpath("//a[contains(@aria-label,'main-menu, Collections, Football')]"));
			
		//  List<WebElement> allLinks = driver.findElements(By.xpath("//button[contains(@aria-label,'main-menu, Women, Shop By Sport')]/a"));
		//  System.out.println(allLinks.size());
		 // for (WebElement a : allLinks) {
		//	  System.out.println(a.getText());
		  
			 //button[contains(@aria-label,'main-menu, Women, Shop By Sport')]
	}

}
