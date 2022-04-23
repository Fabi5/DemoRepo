package PracticeHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorclass {

	private static final WebElement Tennis = null;
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.adidas.ca/en/");

			//WebElement tennis = driver.findElement(By.linkText("Tennis"));
			Thread.sleep(2000);
			
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			WebElement tennis =  driver.findElement(By.linkText("Tennis"));
	
			//option 1- Scroll by x and  y coordinates
			//System.out.println(tennis.getLocation());
			//jse.executeScript("window.scrollBy(0,4000)");
			//tennis.click();
			
			
			//Option 2 - scroll until element is in the view is true
			jse.executeScript("arguments[0].scrollIntoView(true);",tennis);
			tennis.click();
			
			
			//Option3- direct click using Javascript
			//jse.executeScript("arguments[0].click();",tennis);

			
	}

}



//WebElement careers = driver.findElement(By.linkText("Careers"));
//Thread.sleep(10000);

//JavascriptExecutor jse = (JavascriptExecutor)driver;			
//WebElement careers = driver.findElement(By.linkText("Careers"));

//Option 1 - Scroll by x and Y cordinates
//System.out.println(careers.getLocation());
//jse.executeScript("window.scrollBy(0,4000)");
//careers.click();

//Option 2 - scroll until element is in the view is true
//jse.executeScript("arguments[0].scrollsIntoView(true);",careers);
//careers.click();

//Option3- direct click using Javascript
//jse.executeScript("arguments[0].click();",careers);