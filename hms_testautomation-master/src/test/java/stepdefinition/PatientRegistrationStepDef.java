package stepdefinition;

import actions.DashboardAction;
import actions.PatientRegistrationAction;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PatientRegistrationStepDef {
	
	private DashboardAction dashboardAction;
	private PatientRegistrationAction patientRegistrationAction;

	@Before
	public void setUp() {
		
		dashboardAction = new DashboardAction();
		patientRegistrationAction = new PatientRegistrationAction();
	}
	@Given("^User is on patient registration$")
	public void user_is_on_patient_registration() {
		try {
			dashboardAction.gotoPatientRegistration();
		} catch (Exception e) {
		}
	}

	@When("^User submit patient registration$")
	public void user_submit_patient_registration() {
		try {
			patientRegistrationAction.patientRegistration();
		} catch (Exception e) {
		}
	}

	@Then("^submit registration successfullfy$")
	public void submit_registration_successfullfy() {
		try {
			System.out.println("Registration done success");
//	dashboardAction.loadHome();
//		dashboardAction.loadOpClinic();
//		dashboardAction.observationDashboard();
		} catch (Exception e) {
		}
	}

}
