package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class login1 {
  @Test
  public void login() {
	   
	  String exp = "ABC";//
		 String act = "ABCx";//
	 Assert.assertEquals(exp, act);
		// Assert.assertTrue(isElementPresent("xxx"), "Elementnotfound");
	 System.out.println("--------------A---------");
	 Assert.fail("Custom Err messg - 404 error");
	 System.out.println("--------------B---------");
  }
}
