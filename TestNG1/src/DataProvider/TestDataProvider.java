package DataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
  @DataProvider
  public static Object[][] getData(Method m){
	 System.out.println("Method/Test "+ m.getName());
	 if(m.getName().equals("createUser")) {
  }
	  Object[][]data = new Object[2][4];
	  // row 1
	    data[0][0] = "chrome";
		data[0][1] = "SuperAdmin";
		data[0][2] = 2343;
		data[0][3]= "abx@gmail.com";
		
		//row // 2
  
		data[1][0] = "Mozilla";
		data[1][1] = "SuperAdmin1";
		data[1][2] = 23432;
		data[1][3]= "abc@gmail.com";
//		//row 3
//		 data[2][0] = "edge";
//		 data[2][1] = "SuperAdmin2";
//		 data[2][2] = 234323;
//		 data[2][3]= "abcd@gmail.com";
		 
		return data;
	
}
}