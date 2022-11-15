package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testR4 {
	ChromeDriver driver;

	@Test
	public void loginTest() {
		
		SoftAssert softassert = new SoftAssert();

		// Arrangement
		System.setProperty("webdriver.chrome.driver", "C://Users//ankurjain//Documents//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();

		// Actions 1

		String title = driver.getTitle();
		String expectedTitle = "WebDriver | Contac Us";
		// Assertions1
		System.out.println("Asserting title");
		softassert.assertEquals(title, expectedTitle,"Title verification failed");

		// Actions 2
		System.out.println("Asserting attribute value");
		String eAvaule = "contactme";
		String actutalAValue = driver.findElement(By.cssSelector("h2[name='contactme']")).getAttribute("name");

		// Assertions 2
		softassert.assertEquals(eAvaule, actutalAValue ,"attribute verification failed");
		
		System.out.println("Closing browser");
		driver.quit();
		
		//softassert.assertAll();

	}

}
