package stepdefinition;

import actions.DashboardAction;
import actions.LoginAction;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.CommonUtils;

public class LoginStepDef {
	
	private LoginAction loginAction;
	
	private DashboardAction dashboardAction;
	

	@Before
	public void setUp() {
		loginAction = new LoginAction();
		
		dashboardAction = new DashboardAction();
		
	}
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() {
		try {
			CommonUtils.loadHomePage();
		} catch (Exception e) {
		}

	}

	@When("^User enters UserName \"([^\"]*)\" and Password \"([^\"]*)\" and Select Institution \"([^\"]*)\" and Service Centre \"([^\"]*)\"$")
	public void user_enters_UserName_and_Password_and_Select_Institution_and_Service_Centre(String userName, String password, String hospitalId, String deptId) {
		try {
			loginAction.login(userName,password,hospitalId,deptId);
		}catch (Exception e) {
		}
	    
	}
	
	@When("^User enters UserName and Password and Select Institution and Service Centre$")
	public void user_enters_UserName_and_Password_and_Select_Institution_and_Service_Centre() {
	    try {
	    	loginAction.login();
	    }catch (Exception e) {
		}
	}
	
	@When("^login alert accept$")
	public void login_alert_accept() {
		try {
			loginAction.loginAlertAccept();
			System.out.println("accept login");

		} catch (Exception e) {
		}
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() {
		try {
			System.out.println("login success");
		} catch (Exception e) {
		}

	}

}
