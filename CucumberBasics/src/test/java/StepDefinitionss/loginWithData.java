package StepDefinitionss;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginWithData {
	WebDriver driver;
	@Given("^user is on the orange HRM login page$")
	public void user_is_on_the_orange_HRM_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\drivernew\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	  
	}

	@When("^user enters the valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_valid_credentials_and(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.id("txtUsername")).sendKeys(username);
	  driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("^clicks the login button$")
	public void clicks_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	    
	}

	@Then("^user should see the home page$")
	public void user_should_see_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean status= driver.findElement(By.partialLinkText("Welcome")).isDisplayed();
		Assert.assertTrue(status);
	    
	}


}
