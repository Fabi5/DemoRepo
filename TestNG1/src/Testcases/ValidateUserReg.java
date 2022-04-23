package Testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateUserReg {
  @Test
  public void Validate() {
	  
	  SoftAssert softAssert = new SoftAssert();
	  softAssert.assertEquals("abx", "abx");

	  softAssert.assertEquals("ABC", "xyz");
	  softAssert.assertTrue(5>8, "Error message");
	  softAssert.fail("404 Error");
	  
	  softAssert.assertAll();
	  
	  
  }
}
