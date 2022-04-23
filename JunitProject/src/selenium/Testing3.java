package selenium;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runners.MethodSorters;

         @FixMethodOrder(MethodSorters.NAME_ASCENDING)
         
public class Testing3 {
	
       @Rule
	public ErrorCollector err = new ErrorCollector();
	//@Ignore
	@Test
	public void b_test6 () {
		String actual = "abc";
		String expected = "abc";
		System.out.println("before 1 st Assert");
		Assert.assertEquals(expected, actual);// we use regular assert in insdustry
		System.out.println("After 1st Assert");
		Assert.assertTrue("verify 4>3", 4>3);
		System.out.println("After 2nd Assert");
		
		
	}
	@Test
	public void a_test7() {
		
		String actual = "abc";
		String expected = "abc1";
		System.out.println("before 1 st Assert");
		try {
		Assert.assertEquals(expected, actual);
		}catch(Throwable t) {
			System.out.println("I'm in 1st catch");
			err.addError(t);
		}
		System.out.println("After 1st Assert");
		try {
		Assert.assertTrue("verify 4>3", 4>3);
		}catch (Throwable t) {
			System.out.println("I m in 2nd catch");
			err.addError(t);
		}
		System.out.println("After 2nd Assert");
		
	
	
	
	
}
}