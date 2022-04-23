package PracticeHomework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListTest2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Jars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		 List <WebElement> alloptions = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		 System.out.println(alloptions.size());
		 
		 
		 for(int i=0; i<alloptions.size(); i++)  {
			 System.out.println(alloptions.get(i).getText());
			 
			 WebElement dropdown = driver.findElement(By.id("gh-cat"));
			 Select s = new Select(dropdown);
			 
			//s.selectByIndex(2);
			//System.out.println(s.getText()+"----"+s.isSelected());
			 
			 
		 }
		 
	} 
		 
		 
		
		}

	


