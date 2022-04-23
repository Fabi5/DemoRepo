package PracticeHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) {

System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable");
			driver.switchTo().frame(0)	;
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
	     System.out.println(droppable.getText());
         Actions builder = new Actions(driver);
         builder.dragAndDrop(draggable,droppable).build().perform();
         
         
          System.out.println(droppable.getText());
          if (droppable.getText().equals("Dropped!")) {
        		  
        		  System.out.println("pass");
	}else
		System.out.println("fail");

		
         
	}

}
