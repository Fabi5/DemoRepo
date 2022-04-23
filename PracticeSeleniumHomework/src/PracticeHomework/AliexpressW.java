package PracticeHomework;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AliexpressW {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		

	    driver.get("https://www.aliexpress.com/");
		   
		   
		// WebElement  womens= driver.findElement(By.className("cate-name"));
		// Actions builder = new Actions(driver);
		 //builder.moveToElement(womens).build().perform();
		 //Thread.sleep(2000);
		 //List<WebElement>  all = driver.findElements(By.xpath("(//div[@class='sub-cate-row'])[3]//a"));
		 
		 
		/* WebElement  womens= driver.findElement(By.linkText("Phones & Telecommunications"));
		 
		 
		 Actions builder = new Actions(driver);
		 builder.moveToElement(womens).build().perform();
		 Thread.sleep(2000);
		List<WebElement>  all = driver.findElements(By.xpath("(//div[@class='sub-cate-row'])[3]//a"));

		System.out.println(all.size());
		
		for (WebElement a: all ) {
			System.out.println(a.getText());*/
	  
	    	driver.findElement(By.className("close-btn")).click();
	    	Thread.sleep(1000);
//	    	driver.findElement(By.className("btn-close")).click();
//	    	Thread.sleep(2000);
			WebElement beauty = driver.findElement(By.xpath("//dl[@class='cl-item cl-item-beauty']"));
			 Actions builder = new Actions(driver);
			 builder.moveToElement(beauty).build().perform();
			 Thread.sleep(2000);
			List<WebElement>  all = driver.findElements(By.xpath("(//div[@class='sub-cate-row'])[3]"));

			System.out.println(all.size());
			
			for (WebElement a: all ) {
				System.out.println(a.getText());
			
		}
			//"//dl[@class='cl-item cl-item-beauty']//dt[@class='cate-name'] "
		
		
		
		
		
	}

}
