package test;

import org.testng.annotations.Test;

import data.DataFile;
import pages.LoginPage;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	WebDriver driver;
	LoginPage lp = new LoginPage();
	DataFile df = new DataFile();
//	
//	String wrongEmail ="dfgdk";
//	String wrongPassword ="dfggfshsf";
//	String emailwithSpecialchar ="dfgdlfng@$";
//	String globalErr ="Please check your card number / username or password and try again.";
//	String emptyEmailErr = "Please enter your username or card number.";
//	String emptypassword ="Please enter your password.";
//    String emailwithSpecchar ="Please enter a username or card number without special characters.";
	
	

 
  @BeforeMethod
  public void beforeMethod() {
	 lp.openBrowser();
	 lp.openLoginPage();
	
	 // firefox
	 // open scotia login page
	 // implicit wait
	  
//	System.setProperty("webdriver.gecko.driver","C:\\Selenium Jars\\geckodriver.exe");
//		 driver = new FirefoxDriver();
//		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=6rlClzCRzkQ&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5nb29nbGUuY29tXC8iLCJvYXV0aF9rZXkiOiI2cmxDbHpDUnprUSIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjM5MzI4MjQzLCJpYXQiOjE2MzkzMjcwNDMsImp0aSI6IjU2ZjU2Nzc2LWY1NzMtNDJlMi1iNWY4LTRmYTI1N2E4M2MyMCIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.fCmvvKvNkny6ZNkSnh6BOAUrm1D5Rm4w-8fdGM1EQNKUJINV55pSXJlWwVt55YvPwSXmalQos_Qq2b5LEc3bq9ELTEPNkcWsh4CccdQR-Ukwjt0sEPjtwgumuUO-okN9-m3fmredTcUW0QY02kYN0Idyj95sG9akDZGGFr3A7kXiQQof73Rkm21u12JWOujxNkkmkwuVDnrGL7DzSTtaRz4Xk75ApDAhDJRcMQC_PLlmX7WLmo0ldJvvYOGXH03EFfYm0axrPbdqCYM40YyAKr5JtlTiMrFtXacPRFV0FvXm3TAUvNTwto1srXCBlNPJ37W1FdKGrNM8egbqxBGEkg&preferred_environment=");
//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
  }

  @AfterMethod
  public void afterMethod() {
	  //close  firefox
	// driver.quit();
	 lp.closeBrowser();
  }
  
 //@Test(priority=1)
  // just for reference
  public void loginWithWrongEmailPasswordTest() throws InterruptedException {
  //enter wrong email
  // enter wrong password
  // click on login button
		  driver.findElement(By.name("usernameInput")).sendKeys("vdgsrgdzgesagr");
	  driver.findElement(By.name("password")).sendKeys("xzgxfgsrh");
	  driver.findElement(By.id("signIn")).click();
	  
  Thread.sleep(4000);
  // verify error message

     String expected = df.globalErr;
     String actual = driver.findElement(By.id("globalError")).getText();
      System.out.println(actual);
     Assert.assertEquals(actual, expected);
}
  
  
  @Test (priority = 1)
  public void loginWithWrongEmailPaswordTest() throws InterruptedException {
	   lp.login(df.wrongEmail,df.wrongPassword);
	  //	driver.findElement(By.id("usernameInput-input")).sendKeys("vdgsrgdzgesagr");
	//	driver.findElement(By.name("password")).sendKeys("xzgxfgsrh");
	//	driver.findElement(By.id("signIn")).click();
		
	//	Thread.sleep(4000);
		
	   //String expected = df.globalErr;
		//String actual = driver.findElement(By.id("globalError")).getText();
		//String actual =lp.readGlobalErr();
		//System.out.println(actual);	
		Assert.assertEquals(lp.readGlobalErr(), df.globalErr);
		//Assert.assertEquals(actual, expected);
  }

  
  
 @Test (priority = 2)
  public void loginWithEmptyEmailTest() throws InterruptedException {
	     lp.login("",df.wrongPassword);
		//driver.findElement(By.name("password")).sendKeys("xzgxfgsrh");
		//driver.findElement(By.id("signIn")).click();
		
		//Thread.sleep(4000);
		
		   String expected = "Please enter your username or card number.";
		//String actual = driver.findElement(By.className("Error__text")).getText();
		  String actual = lp.readErr();
		  System.out.println(actual);		
		  Assert.assertEquals(actual, expected);
  }

 @Test (priority = 3)
  public void loginWithEmptyPasswordTest() throws InterruptedException {
	  lp.login(df.wrongEmail,"");
	  //	driver.findElement(By.id("usernameInput-input")).sendKeys("vdgsrgdzgesagr");
		  //driver.findElement(By.id("signIn")).click();
		
		//Thread.sleep(4000);
		
		  String expected = df.emptyPasswordErr;
		//String actual = driver.findElement(By.className("Error__text")).getText();
		String actual = lp.readErr();
		System.out.println(actual);		
		Assert.assertEquals(actual, expected);
  }

  
  @Test (priority = 4)
  public void loginWithSpecialCharEmailTest() throws InterruptedException {
	  lp.login(df.emailWithSpecialChar,df.wrongPassword );
	  //	driver.findElement(By.id("usernameInput-input")).sendKeys("vdgsrgdzgesagr@#$");
		//driver.findElement(By.name("password")).sendKeys("xzgxfgsrh");
		//driver.findElement(By.id("signIn")).click();
		
	//	Thread.sleep(4000);
		
		String expected = df.emailWithSpecCharErr;
		//String actual = driver.findElement(By.className("Error__text")).getText();
		String actual = lp.readErr();
		System.out.println(actual);		
		Assert.assertEquals(actual, expected);
  }

   

  
  
  
  
  
  
	  //enter email
	  // click on login button
	  // please enter your password
 
  
 
	  //enter email with special chars ----sdfe
	  //enter password
	  // click on login button
	  // please enter your password
	  
	  
	 
}
