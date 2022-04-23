package PracticeHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackandForwaredTest {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium Jars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	/*	driver.get("https://www.google.com/");
		
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());//"About"
		driver.navigate().back();*/
		
		driver.get("https://www.ebay.ca/");
		
		driver.findElement(By.className("gh-p")).click();
		Thread.sleep(2000);
	//	System.out.println(driver.getTitle());
		driver.navigate().back();

	}

}
