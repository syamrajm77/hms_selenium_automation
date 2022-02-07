package stepdefinition;

import actions.DashboardAction;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashboardStepDef {
	
	private DashboardAction dashboardAction;


	@Before
	public void setUp() {
		
		dashboardAction = new DashboardAction();
		
	}
	
	

	@Given("^User on reception$")
	public void user_on_reception() {
		try {
			System.out.println("on reception");
		} catch (Exception e) {
		}
	}

	@When("^User is clicking reception$")
	public void user_is_clicking_reception() {
		try {
			dashboardAction.loadReception();
			System.out.println("clicking on reception after");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("^goto reception dashboard$")
	public void goto_reception_dashboard() throws Throwable {
		System.out.println("reception exit");
	}
}
