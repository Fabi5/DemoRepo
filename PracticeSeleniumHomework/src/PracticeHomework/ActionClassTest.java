package PracticeHomework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Selenium Jars\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://www.amazon.ca/");
		
		//WebElement customerservice= driver.findElement(By.linkText("Customer Service"));
		//Actions builder = new Actions(driver);
		//builder.moveToElement(customerservice).build().perform();
		
		driver.findElement(By.linkText("Customer Service")).click();
		
	}	
		
		
	

}
