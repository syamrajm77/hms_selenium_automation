package stepdefinition;


import actions.LogoutAction;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogoutStepDef {
	
	private LogoutAction logoutAction;
	

	@Before
	public void setUp() {
		logoutAction = new LogoutAction();
		
	}
	@Given("^User click logout button$")
	public void user_click_logout_button() {
		try {
			Thread.sleep(5000);
			logoutAction.logout();
		}catch (Exception e) {
		}
	}

	@Then("^logout success$")
	public void logout_success() {
	    try {
	    	System.out.println("logout success");
	    }catch (Exception e) {
		}
	}
	
}
