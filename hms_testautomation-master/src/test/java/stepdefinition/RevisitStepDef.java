package stepdefinition;

import java.util.List;

import actions.DashboardAction;
import actions.RevisitAction;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Registration;
import model.Revisit;

public class RevisitStepDef {

	private DashboardAction dashboardAction;
	private RevisitAction revisitAction;
	

	@Before
	public void setUp() {
		
		dashboardAction = new DashboardAction();
		revisitAction = new RevisitAction();
		
	}
	
	@Given("^User is on revisit$")
	public void user_is_on_revisit() {
		try {
			Thread.sleep(1000);
			System.out.println("User is on revisit");
			//dashboardAction.gotoRevisit();

		} catch (Exception e) {
			System.err.println(e);
		}
	}

	@When("^User submit revisit$")
	public void user_submit_revisit() throws Throwable {
		try {System.out.println("user submit revisit **");
			List<Revisit> revisitList = revisitAction.getRevisitDataFromExcel();
			for (Revisit revisit : revisitList) {
				Thread.sleep(4000);
				DashboardAction.gotoRevisit();
				Thread.sleep(4000);
				revisitAction.submitRevist(revisit);
				Thread.sleep(4000);
			}
		} catch (Exception e) {
			System.err.println("submit error" + e);
		}
	}

	@Then("^submit successfullfy$")
	public void submit_successfullfy() {
		try {
			Thread.sleep(1000);
			System.out.println("revisit submit successfullfy");

		} catch (Exception e) {
		}
	}
	
	
	
}
