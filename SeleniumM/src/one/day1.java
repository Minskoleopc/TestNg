package one;

import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// selenium  webdriver jar download and added 
		// Check version for chrome 
		// Download Chrome Driver and Extract
		// Copy Chrome Driver path into the testcase
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankurjain\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
