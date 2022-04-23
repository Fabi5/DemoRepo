package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	SoftAssert softAssert = new SoftAssert();
 
	@Test(priority = 1, groups = "smoke") // create new User test@test.com
	public void createUser() {
		System.out.println(" I am in home test");
		System.out.println(" Before assertion");
		Assert.assertTrue(4>3, "Verifying Element");// we use regular assert
		System.out.println(" After assertion");
		Assert.assertEquals("abc", "abc");
	}
	@Test ( priority = 2,dependsOnMethods = "createUser") //edit User test@test.com
	public void  editUser() {
	System.out.println("Before assertion");
	softAssert.assertTrue(2>3, "Verifying Element");// we use regular assert
	System.out.println(" After assertion");
	
	softAssert.assertAll();// similar to error collector in Junit
}
	@Test ( priority = 3,dependsOnMethods = "editUser") // DeleteUser test@test.com
	public void deleteUser() {
	System.out.println(" I am in end test");
	System.out.println(" Before assertion");
	softAssert.assertTrue(4>3, "Verifying Element1");// we use regular assert
	System.out.println(" After assertion");
	softAssert.assertEquals("abc", "abc");
	 System.out.println(" After  second assertion");
     softAssert.assertAll();
  
}
}