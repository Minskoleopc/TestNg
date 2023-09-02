package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WebElement ??
		// WebElement ????? // Html element
		// <h1 id = "one" class = "two" name = "nm">Hello</h1>

		// Testcase 1

		// Arrangement

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ankurjain\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
//		
//		
//		
//		// Action 
//		WebElement ele =driver.findElement(By.cssSelector("#user-name"));
//		ele.sendKeys("standard_user");
//		WebElement ele2 = driver.findElement(By.cssSelector("#password"));
//		ele2.sendKeys("secret_sauce");
//		WebElement ele3 = driver.findElement(By.cssSelector("#login-button"));
//		ele3.click();
//			
//		// Assertion
//		WebElement ele4 = driver.findElement(By.cssSelector(".app_logo"));
//		boolean flag =ele4.isDisplayed();
//		if(flag) {
//			System.out.println("Testcase1 pass");
//		}
//		else {
//			System.out.println("Testcase1  fail");
//		}
//		driver.close();
//		
		// Test case 2

//		// Action 

		WebElement ele = driver.findElement(By.cssSelector("#user-name"));
		ele.sendKeys("standard_user");
		WebElement ele2 = driver.findElement(By.cssSelector("#password"));
		ele2.sendKeys("set_sauce");
		WebElement ele3 = driver.findElement(By.cssSelector("#login-button"));
		ele3.click();
		WebElement ele4 = driver.findElement(By.cssSelector("h3[data-test=\"error\"]"));
		String expectedText = ele4.getText();
		System.out.println(expectedText);
		
		if(expectedText.contains("Epic sadface: Username and password do not match any user in this service")) {
			System.out.println("Test case 2 pass");
		}
		else {
			System.out.println("Test case 2 Fail");
		}
		
		driver.close();

	}

}
