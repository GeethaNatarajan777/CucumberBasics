package StepDefinitionss;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTablewithoutHeader {
	WebDriver driver;
	@Given("^user is on the orange HRM demo login page$")
	public void user_is_on_the_orange_HRM_demo_login_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\drivernew\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

	}

	@When("^user enters the following credentials$")
	public void user_enters_the_following_credentials(DataTable Table) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<String> credentials= Table.asList(String.class);
		String username = credentials.get(0);
		String password = credentials.get(0);
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);

	}

	@When("^clicks login button$")
	public void clicks_login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();

	}

	/*@Then("^user should see the home page results$")
	public void user_should_see_the_home_page_results() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean status= driver.findElement(By.partialLinkText("Welcome")).isDisplayed();
		Assert.assertTrue(status);*/

	}




