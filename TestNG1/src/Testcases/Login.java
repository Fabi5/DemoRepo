package Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	@BeforeTest
	public void init() {
		System.out.println("-----@BeforeTest--------");
	
	}
	
	@AfterTest
	public void quit(){
		System.out.println("-------@AfterTest-----------------");
		// close browser
	}
	
	@BeforeMethod
	public void BeforeMetho() {
		System.out.println("******@BeforeMethod********************");
	
	}
	
	
	@AfterMethod
	public void afterMetho() {
		System.out.println("******@AfterMethod********************");
	
	}
	
	
  @Test
  public void login1() {
	 //String exp = "ABC";//
	 //String act = "ABCx";//
	  System.out.println("Before Assertions");
	  
	  //Assert.assertEquals(exp, act);
		// Assert.assertTrue(isElementPresent("xxx"), "Elementnotfound");
	 //System.out.println("--------------A---------");
	 //Assert.fail("Custom Err messg - 404 error");
	// System.out.println("--------------B---------");
}
	  
  @Test
  
  public void logout() {
	  System.out.println("Loggingout");
  }
	  
  
}
