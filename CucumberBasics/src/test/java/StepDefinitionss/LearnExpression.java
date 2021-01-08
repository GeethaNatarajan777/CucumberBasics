package StepDefinitionss;

import cucumber.api.java.en.Given;

public class LearnExpression {
	@Given("^I have (\\d+) Apples$")
	public void I_have_7_Apples(int count){
		System.out.println("Count of apple is"+count);
		}
	@Given("^I have (\\d+\\.\\d+) CGPA$")
	public void i_have_CGPA(int num) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("CGPA is "+num);
	    
	}

	@Given ("^\"(.*?)\" is elder than \"(.*?)\" and \"(.*?)\"$")
	public void is_elder_than_and(String name1, String name2, String name3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(name1 + " is elder than " + name2 + " and " + name3);
	   
	}


	
}
