package steps;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class login {
	ChromeDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C://Users//ankurjain//Documents//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");

	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.cssSelector("#login-button")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		Boolean logo = driver.findElement(By.className("app_logo")).isDisplayed();
		assertEquals(logo, true);
	}

	@When("user enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
		driver.findElement(By.cssSelector("#user-name")).sendKeys("staard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("set_sauce");
	}

	@Then("error message is displayed - Invalid Credentials")
	public void error_message_is_displayed_Invalid_Credentials() {
		Boolean logo = driver.findElement(By.className("app_logo")).isDisplayed();
		assertEquals(logo, true);
	}

}
