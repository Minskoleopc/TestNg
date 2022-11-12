package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testR3 {
	ChromeDriver driver ;
	
	@BeforeMethod
	public void LaunchBroswerChrome() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//ankurjain//Documents//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
		driver.manage().window().maximize();	
	}
	
	@AfterMethod
	public void ClosingBrowser() {
		driver.quit();
	}
		
	@Test(priority =1, description = "Verify the title of page")
	
	public void loginTest() {
		
		// complete  test
		// Arrangement
//		System.setProperty("webdriver.chrome.driver", "C://Users//ankurjain//Documents//chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
//		driver.manage().window().maximize();
		
		// Actions
		
		
		String title = driver.getTitle();
		String expectedTitle = "WebDriver | Data Tables";
		
		
		//Assertions
		Assert.assertEquals(title, expectedTitle);
		//driver.quit();
		
	}
	
	@Test(priority =2, description = "Verify header Text")
	public void validatePageHeader() {
		String actualHeaderText = driver.findElement(By.cssSelector("h1")).getText();
		String expectedHeaderText = "Data, Tables & Button States";
		Assert.assertEquals(actualHeaderText, expectedHeaderText);
	}
	
	
	// 2 people - 2 People
	
	//Sahadev // Murari 
	//Manjit  // Kabindra
	
	// Introduction 
	// you role and responsibilites
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
