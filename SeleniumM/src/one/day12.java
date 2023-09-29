package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ankurjain\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement ele = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
		Select sel = new Select(ele);
		// select by index
		sel.selectByIndex(2);
		// select by visibleText
		sel.selectByVisibleText("Python");
		// select by value
		sel.selectByValue("python");
		
		// Selecting the value from all three drop down
		selectDropDown(driver,1,"Python");
		selectDropDown(driver,2,"Maven");
		selectDropDown(driver,3,"JavaScript");
		driver.close();
		
		// 7.00 am testNG
		// 9:30 pm -- radio check boxes 
		// 9.00 am collections 
		// 9:30 pm testNG
		
		

	}

	public static void selectDropDown(WebDriver driver ,int id, String visibletext) {
		WebElement ele = driver.findElement(By.cssSelector("#dropdowm-menu-"+id));
		Select sel = new Select(ele);
		sel.selectByVisibleText(visibletext);
	}

	
	public void selectDropDown(WebDriver driver ,int id, int indexValue) {
		WebElement ele = driver.findElement(By.cssSelector("#dropdowm-menu-"+id));
		Select sel = new Select(ele);
		sel.selectByIndex(indexValue);
	}
	
	public void selectDropDownValue(WebDriver driver ,int id, String Value) {
		WebElement ele = driver.findElement(By.cssSelector("#dropdowm-menu-"+id));
		Select sel = new Select(ele);
		sel.selectByValue(Value);

	}

	

}
