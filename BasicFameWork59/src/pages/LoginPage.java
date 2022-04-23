package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	
	
WebDriver driver;


public  void openBrowser() {
	 System.setProperty("webdriver.gecko.driver","C:\\Selenium Jars\\geckodriver.exe");
	 driver = new FirefoxDriver();
}

public  void openLoginPage() {
	
	//driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=6rlClzCRzkQ&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5nb29nbGUuY29tXC8iLCJvYXV0aF9rZXkiOiI2cmxDbHpDUnprUSIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjM5MzI4MjQzLCJpYXQiOjE2MzkzMjcwNDMsImp0aSI6IjU2ZjU2Nzc2LWY1NzMtNDJlMi1iNWY4LTRmYTI1N2E4M2MyMCIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.fCmvvKvNkny6ZNkSnh6BOAUrm1D5Rm4w-8fdGM1EQNKUJINV55pSXJlWwVt55YvPwSXmalQos_Qq2b5LEc3bq9ELTEPNkcWsh4CccdQR-Ukwjt0sEPjtwgumuUO-okN9-m3fmredTcUW0QY02kYN0Idyj95sG9akDZGGFr3A7kXiQQof73Rkm21u12JWOujxNkkmkwuVDnrGL7DzSTtaRz4Xk75ApDAhDJRcMQC_PLlmX7WLmo0ldJvvYOGXH03EFfYm0axrPbdqCYM40YyAKr5JtlTiMrFtXacPRFV0FvXm3TAUvNTwto1srXCBlNPJ37W1FdKGrNM8egbqxBGEkg&preferred_environment=");
   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://www.ebay.ca/");
}


public  void closeBrowser() {
	driver.quit();
}
public  void login(String a, String b) throws InterruptedException {
	driver.findElement(By.id("usernameInput-input")).sendKeys(a);
	driver.findElement(By.name("password")).sendKeys(b);
	driver.findElement(By.id("signIn")).click();
	
	Thread.sleep(4000);
}
public String readGlobalErr() {
	String actual = driver.findElement(By.id("globalError")).getText();
	System.out.println(actual);
	return actual;

}


public String readErr() {
	String actual = driver.findElement(By.className("Error__text")).getText();
	System.out.println(actual);	
	return actual;
}
}