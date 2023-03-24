package test.com;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import commom.com.BaseTest;
import commom.com.Retry;

public class Test14 extends BaseTest {
	
	@Test()
	public static void TestOne() {
		System.out.println("one executed");
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		Assert.assertEquals(false, true);
		
		
	}

}
