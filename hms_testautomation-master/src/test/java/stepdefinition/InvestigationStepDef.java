package stepdefinition;

import actions.DashboardAction;
import actions.InvestigationAction;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvestigationStepDef {

	private InvestigationAction investigationAction;
	private DashboardAction dashboardAction;
	

	@Before
	public void setUp() {
		
		investigationAction = new InvestigationAction();
		dashboardAction = new DashboardAction();
		
	}
	@Given("^User on cancel investigation$")
	public void user_on_cancel_investigation() {
		try {
			dashboardAction.cancelInvestigation();
		} catch (Exception e) {
		}
	}

	@When("^User is clicking Investigation$")
	public void user_is_clicking_Investigation() {
		try {
			Thread.sleep(1000);
			investigationAction.cancelInvestigation();
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	@Then("^goto Investigation$")
	public void goto_Investigation() {
		try {
			System.out.println("investigation then");

		} catch (Exception e) {
		}
	}

}
