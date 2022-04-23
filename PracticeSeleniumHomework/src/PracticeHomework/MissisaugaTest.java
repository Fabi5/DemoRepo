package PracticeHomework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MissisaugaTest  {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium Jars\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://www.mississauga.ca");
		 //Thread.sleep(2000);
		// driver.findElement(By.id("closeButton")).click();
		 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[contains(text(),'Events and attractions')]")).click();
		
		 
//		 Actions  builder  = new Actions(driver);
//		 builder.moveToElement(event).build().perform();
//		 
		 Thread.sleep(2000);
	     List<WebElement>  all = driver.findElements(By.xpath("//ul[@class=\"dropdown-menu nav-dropdown-menu show\"]//a"));
	    
	    
	      for(WebElement a :all) {
			System.out.println(a.getText());
			
			
			if (a.getText().equals("Public art")) {
				a.click();	
				Thread.sleep(2000);
			System.out.println(driver.getTitle());
				break;
	
	    
			}
			}
	    }
	
	    }

