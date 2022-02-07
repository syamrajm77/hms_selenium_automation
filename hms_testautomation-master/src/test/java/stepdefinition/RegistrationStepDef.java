package stepdefinition;

import java.util.List;

import actions.DashboardAction;
import actions.RegistrationAction;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Registration;

public class RegistrationStepDef {
	
	private RegistrationAction registrationAction;
	private DashboardAction dashboardAction;
	
	@Before
	public void setUp() {
		
		dashboardAction = new DashboardAction();
		registrationAction = new RegistrationAction();
		
	}
	@When("^User is on new registration$")
	public void user_is_on_new_registration() {
		try {
			Thread.sleep(1000);
			// DashboardAction.gotoQuickRegistration();
			System.out.println("user_is_on_new_registration");
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	@When("^User submit registration$")
	public void user_submit_registration() {
		try {
			List<Registration> registrationList = registrationAction.getRegistrationDataFromExcel();
			for (Registration registration : registrationList) {
				Thread.sleep(4000);
				DashboardAction.gotoQuickRegistration();
				Thread.sleep(4000);
				registrationAction.newRegistration(registration);
				Thread.sleep(4000);
			}
		} catch (Exception e) {
			System.err.println("submit error" + e);
		}
	}

	@Then("^Registered successfullfy$")
	public void registered_successfullfy() {
		try {
			Thread.sleep(1000);
			System.out.println("register example");
			 
		} catch (Exception e) {
		}
	}
	
}
