package StepDefinitionss;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundExplained {
	@Given("^Student finish the High school education$")
	public void student_finish_the_High_school_education() throws Throwable {
		System.out.println("Student finish the High school education");   
	}

	@Given("^Student finish the Higher secondary education$")
	public void student_finish_the_Higher_secondary_education() throws Throwable {
		System.out.println("Student finish the Higher secondary education");
	}

	@Given("^the student applied for the medical course$")
	public void the_student_applied_for_the_medical_course() throws Throwable {
		System.out.println("the student applied for the medical course");
	}

	@When("^the student cleared the medical exam$")
	public void the_student_cleared_the_medical_exam() throws Throwable {
		System.out.println("the student cleared the medical exam");
	}

	@Then("^the student is eligible for joining the medical course$")
	public void the_student_is_eligible_for_joining_the_medical_course() throws Throwable {
		System.out.println("the student is eligible for joining the medical course");
	}

	@Given("^the student applied for the enginerring course$")
	public void the_student_applied_for_the_enginerring_course() throws Throwable {
		System.out.println("the student applied for the enginerring course");
	}

	@When("^the student has a sayable cut off$")
	public void the_student_has_a_sayable_cut_off() throws Throwable {
		System.out.println("the student has a sayable cut off");
	}

	@Then("^the student is eligible to join engineering$")
	public void the_student_is_eligible_to_join_engineering() throws Throwable {
		System.out.println("the student is eligible to join engineering");
	}
}
