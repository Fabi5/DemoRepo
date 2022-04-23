package PracticeHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasXpath {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Jars\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();

	     
		driver.get("https://www.adidas.ca/en/account-login");
		
		Thread.sleep(4000);
		driver.findElement(By.id("login-email")).sendKeys("gankadng@abc.com");
		driver.findElement(By.id("login-password")).sendKeys("fafbkjar");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		 String expected ="Incorrect email/password – please check and retry";
		 String actual = driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();
		 System.out.println(actual);
				
		 if (expected.equals(actual)) {
			 System.out.println("pass");
		 }else
			 
			 System.out.println("fail");
		
		
		

		
		
	}

}
