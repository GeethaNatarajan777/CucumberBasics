package StepDefinitionss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class openGoogleSteps {
	WebDriver driver;
	@Given("^user enters the google website$")
	public void user_enters_the_google_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\drivernew\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	    
	}

	@When("^user enters the search term \"([^\"]*)\"$")
	public void user_enters_the_search_term(String name) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(name);
	}
	   

	@When("^press the enter button$")
	public void press_the_enter_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
	   }

	@Then("^user should see the search results$")
	public void user_should_see_the_search_results() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Boolean status= driver.findElement(By.partialLinkText("geetha")).isDisplayed();
		if(status) {
			System.out.println("Results Displayed");
		}
	   
	}


}
