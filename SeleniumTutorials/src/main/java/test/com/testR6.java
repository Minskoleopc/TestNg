package test.com;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commom.com.BeforeMethods;


@Test(groups= "userRegistration")
public class testR6  extends BeforeMethods{
	
	boolean database = false;
	
	@Test(enabled= false)
	public void skipTest1() {
		System.out.println("Test case one");
	}
	
	@Test
	public void skipTest2() {
		System.out.println("Test case one");
		throw new SkipException("Skipping the TestCase");
	}
	
	@Test
	public void skipTest3() {
		
		if(database) {
			System.out.println("Running the testcase ");
		}
		else {
			System.out.println("skiping the testcase as db Connection is failed");
			throw new SkipException("Skipping the TestCase");
		}
		
	}
	
	
	
}
