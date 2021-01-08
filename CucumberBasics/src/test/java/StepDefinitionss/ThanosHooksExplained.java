package StepDefinitionss;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ThanosHooksExplained {
	
	@Given("^when the thanos has infinity stones$")
	public void wnen_the_thanos_has_infinity_stones() throws Throwable {
		System.out.println("when the thanos has infinity stones");
	    
	}

	@When("^thanos snaps his fingers$")
	public void thanos_snaps_his_fingers() throws Throwable {
	   System.out.println("thanos snaps his fingers");
	}

	@Then("^half of the living things died$")
	public void half_of_the_living_things_died() throws Throwable {
	    System.out.println("half of the living things died");
	}


}
