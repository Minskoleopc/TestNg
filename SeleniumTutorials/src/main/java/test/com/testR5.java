package test.com;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commom.com.BeforeMethods;


// feature testcase (login)
// smoke test / sanity testcase
// regression testcases


@Test(groups= "userRegistration")
public class testR5 extends BeforeMethods {
	@Test(priority = 1, description = "This is login testcase",groups = "loginF")
	public void loginTest() {
		System.out.println("Login successful");
	}

	@Test(priority = 2, description = "This is logout testcase",groups = {"loginF","regression"})
	public void logOut() {
		System.out.println("Logout Successful");
	}

	@Test(priority = 3, description = "This is added to card testcase" ,groups = "addC")
	public void addTOCart1() {
		System.out.println("Adding to card 1");
	}

	@Test(priority = 4, description = "This is added to card testcase",groups = {"addC","regression"})
	public void addTOCart2() {
		System.out.println("Adding to card 2");
	}

	@Test(priority = 5, description = "This is added to card testcase",groups = "addC")
	public void addTOCart3() {
		System.out.println("Adding to card 3");
	}

}
