package one;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ankurjain\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(3)")).isEnabled();
		driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(5)")).isSelected();
	}

}
