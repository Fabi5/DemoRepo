package PracticeHomework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver","C:\\Selenium Jars\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://jqueryui.com/droppable");

		/* List<WebElement>  selectable =  driver.findElements(By.linkText("Selectable"));
		 System.out.println(selectable.size());
		 if(selectable.size()>0) {
			 System.out.println("Elementis Present");
		    }else
		    {
			System.out.println("Element not present");*/
			
			
			
			
			driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
			
			List<WebElement> selectable = driver.findElements(By.id("selectable"));
			
			System.out.println(selectable.size());
			if(selectable.size()>0) {
				System.out.println("present");
				
			}else {
				System.out.println("not present");
			}
			
			//driver.switchTo().frame(0);
			//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
	
			
			
			
			//System.out.println("------switch back to main page-------");
			//driver.switchTo().defaultContent();
			
			
			
			
		  
		  
			
	}
	}

