package Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class  MyTestNGListener implements ITestListener{
  
  public void onTestFailure(ITestResult result){
	  System.out.println("Test Fail");
	  
	  
	  
  }
	  
	  public void onTestSuccess(ITestResult result) {
		  System.out.println("Test Passed "+ result.getName());
	  }
  }
  

