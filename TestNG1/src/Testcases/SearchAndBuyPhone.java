package Testcases;

import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SearchAndBuyPhone {
	boolean flag = true; // xls, jason we can read flag
  @Test(priority=1)
  public void  search(ITestContext context) {
	  System.out.println("Searching phone");
	  context.setAttribute("phone", "I Phone 8plus");
  }
	  @Test(priority=2, dependsOnMethods = { "search"})
	  public void selectphone(ITestContext context) {
		  String name = (String)context.getAttribute("phone");
		 // if (flag)
		//  throw new SkipExceptin("Skipping Test");
	   System.out.println("selecting phone"+name);
	   
  }
	  @Test(priority=3,dependsOnMethods ={"selectphone","search"})
	  public void checkout() {
	  System.out.println("checking out");
  }
}
