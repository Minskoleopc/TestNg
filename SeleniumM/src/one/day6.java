package one;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ankurjain\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		driver.findElement(By.cssSelector("input[name = \"first_name\"]")).sendKeys("chinmay");
		driver.findElement(By.cssSelector("input[name = \"last_name\"]")).sendKeys("deshpande");
		driver.findElement(By.cssSelector("input[name = \"email\"]")).sendKeys("email@gmail.com");
		driver.findElement(By.cssSelector("textarea[name = \"message\"]")).sendKeys("chinmay deshpande");
		
		
		// click()
		//driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).click();
		
		// submit()
		//driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
		
		
		
//		getLocation();
//		Point a = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).getLocation();
//		System.out.println(a);
		
		
		// clear()
		
//		driver.findElement(By.cssSelector("input[name = \"first_name\"]")).clear();
//		driver.findElement(By.cssSelector("input[name = \"last_name\"]")).clear();
//		driver.findElement(By.cssSelector("input[name = \"email\"]")).clear();
//		driver.findElement(By.cssSelector("textarea[name = \"message\"]")).clear();
		
		//isDisplayed()
//		driver.findElement(By.cssSelector("input[name = \"first_name\"]")).isDisplayed();
		
		//getTagName();
		//driver.findElement(By.cssSelector("input[name = \"first_name\"]")).getTagName();
		
		//getCssValue
		//driver.findElement(By.cssSelector("input[name = \"first_name\"]")).getCssValue("font-size");
		
		//getAttribute()
//		
//		String a = driver.findElement(By.cssSelector("input[name = \"first_name\"]")).getAttribute("placeholder");
//		System.out.println(a);
		
//		
//		String txt = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2")).getText();
//		System.out.println(txt);

//		Dimension qq = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2")).getSize();
//		System.out.println(qq);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
	}

}
