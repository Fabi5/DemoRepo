package PracticeHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSeleniumFirst {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Jars\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver();
     driver.manage().window().fullscreen();
   //  driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
     		
     		
    /* driver.findElement(By.id("identifierId")).sendKeys("dfbkdfbkdsfbk");
     driver.findElement(By.className("VfPpkd-vQzf8d")).click();*/
     
     driver.get("https://www.spicejet.com/");
     driver.findElement(By.linkText("Login")).click();
     driver.quit();
     
//     driver.get("https://www.linkedin.com/");
////     driver.findElement(by.class("btn__primary--large from__button--floating")).click();
//     driver.findElement(By.className("nav__button-secondary")).click();
////     driver.findElement(By.linkText("	Sign in")).click();
	}
}
		