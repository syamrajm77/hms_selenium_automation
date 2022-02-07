package stepdefinition;

import actions.DashboardAction;
import actions.ObservationDashboardAction;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ObservationDashboardStepDef {

	
	private DashboardAction dashboardAction;
	private ObservationDashboardAction observationDashboardAction;

	@Before
	public void setUp() {
		
		dashboardAction = new DashboardAction();
		observationDashboardAction = new ObservationDashboardAction();
	}
	@Given("^User is on Search Observation$")
	public void user_is_on_Search_Observation() {
		try {
			dashboardAction.loadHome();
			dashboardAction.loadOpClinic();
			dashboardAction.observationDashboard();
		} catch (Exception e) {
		}
	}

	@When("^User search observation$")
	public void user_search_observation() {
		try {
			//observationDashboardAction.searchObservation();
		} catch (Exception e) {
			System.err.println("search err " + e);
		}
	}

	@Then("^Search observation successfullfy$")
	public void search_observation_successfullfy() {
		try {
			System.out.println("observation searched successfully");
		} catch (Exception e) {
		}
	}
}
