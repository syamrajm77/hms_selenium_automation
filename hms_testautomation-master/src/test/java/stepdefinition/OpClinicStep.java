package stepdefinition;

import actions.DashboardAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpClinicStep {
	
	
	@Given("^User on op clinic$")
	public void user_on_op_clinic() {
		try {
			DashboardAction.loadOpClinic();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@When("^User is clicking op clinic$")
	public void user_is_clicking_op_clinic() throws Throwable {
		try {
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("^goto op clinic dashboard$")
	public void goto_op_clinic_dashboard() throws Throwable {
		try {
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
