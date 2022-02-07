package stepdefinition;

import actions.DashboardAction;
import actions.InvestigationAction;
import actions.LoginAction;
import actions.LogoutAction;
import actions.ObservationDashboardAction;
import actions.PatientRegistrationAction;
import actions.RegistrationAction;
import actions.RevisitAction;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.CommonUtils;

public class Steps {

//	private LoginAction loginAction;
//	private LogoutAction logoutAction;
//	private InvestigationAction investigationAction;
//	private RegistrationAction registrationAction;
//	private DashboardAction dashboardAction;
//	private RevisitAction revisitAction;
//	private PatientRegistrationAction patientRegistrationAction;
//	private ObservationDashboardAction observationDashboardAction;
//
//	@Before
//	public void setUp() {
//		loginAction = new LoginAction();
//		logoutAction = new LogoutAction();
//		investigationAction = new InvestigationAction();
//		dashboardAction = new DashboardAction();
//		registrationAction = new RegistrationAction();
//		revisitAction = new RevisitAction();
//		patientRegistrationAction = new PatientRegistrationAction();
//		observationDashboardAction = new ObservationDashboardAction();
//	}

//	@Given("^User is on Home Page$")
//	public void user_is_on_Home_Page() {
//		try {
//			CommonUtils.loadHomePage();
//		} catch (Exception e) {
//		}
//
//	}
//
//	@When("^User enters UserName \"([^\"]*)\" and Password \"([^\"]*)\" and Select Institution \"([^\"]*)\" and Service Centre \"([^\"]*)\"$")
//	public void user_enters_UserName_and_Password_and_Select_Institution_and_Service_Centre(String userName, String password, String hospitalId, String deptId) {
//		try {
//			loginAction.login(userName,password,hospitalId,deptId);
//		}catch (Exception e) {
//		}
//	    
//	}
//	
//	@When("^User enters UserName and Password and Select Institution and Service Centre$")
//	public void user_enters_UserName_and_Password_and_Select_Institution_and_Service_Centre() {
//	    try {
//	    	loginAction.login();
//	    }catch (Exception e) {
//		}
//	}
//	
//	@When("^login alert accept$")
//	public void login_alert_accept() {
//		try {
//			loginAction.loginAlertAccept();
//			System.out.println("accept login");
//
//		} catch (Exception e) {
//		}
//	}
//
//	@Then("^Message displayed Login Successfully$")
//	public void message_displayed_Login_Successfully() {
//		try {
//			System.out.println("login success");
//		} catch (Exception e) {
//		}
//
//	}

//	@Given("^User on logout$")
//	public void forLogout() {
//		try {
//			System.out.println("User on logout");
//		} catch (Exception e) {
//		}
//
//	}
//
//	@When("^User is Clicking logout$")
//	public void logout() {
//		try {
//			logoutAction.logout();
//		} catch (Exception e) {
//		}
//	}
//
//	@Then("^goto dashboard$")
//	public void homePage() {
//		try {
//			System.out.println("In home Page");
//		} catch (Exception e) {
//		}
//
//	}

//	@Given("^User on reception$")
//	public void user_on_reception() {
//		try {
//			System.out.println("on reception");
//		} catch (Exception e) {
//		}
//	}
//
//	@When("^User is clicking reception$")
//	public void user_is_clicking_reception() {
//		try {
//			DashboardAction.loadReception();
//			System.out.println("clicking on reception after");
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
//
//	@Then("^goto reception dashboard$")
//	public void goto_reception_dashboard() throws Throwable {
//		System.out.println("reception exit");
//	}

//	@Given("^User on cancel investigation$")
//	public void user_on_cancel_investigation() {
//		try {
//			DashboardAction.cancelInvestigation();
//		} catch (Exception e) {
//		}
//	}
//
//	@When("^User is clicking Investigation$")
//	public void user_is_clicking_Investigation() {
//		try {
//			Thread.sleep(1000);
//			investigationAction.cancelInvestigation();
//		} catch (Exception e) {
//			System.err.println(e);
//		}
//	}
//
//	@Then("^goto Investigation$")
//	public void goto_Investigation() {
//		try {
//			System.out.println("investigation then");
//
//		} catch (Exception e) {
//		}
//	}

//	@When("^User is on new registration$")
//	public void user_is_on_new_registration() {
//		try {
//			Thread.sleep(1000);
//			System.out.println("test new registratioln");
//			DashboardAction.gotoQuickRegistration();
//
//		} catch (Exception e) {
//			System.err.println(e);
//		}
//	}
//
//	@When("^User submit registration$")
//	public void user_submit_registration() {
//		try {
//			System.out.println("register when");
//			registrationAction.newRegistration();
//		} catch (Exception e) {
//			System.err.println("submit error" + e);
//		}
//	}
//
//	@Then("^Registered successfullfy$")
//	public void registered_successfullfy() {
//		try {
//			System.out.println("register example");
//		} catch (Exception e) {
//		}
//	}

//	@Given("^User is on revisit$")
//	public void user_is_on_revisit() {
//		try {
//			Thread.sleep(1000);
//			System.out.println("User is on revisit");
//			dashboardAction.gotoRevisit();
//
//		} catch (Exception e) {
//			System.err.println(e);
//		}
//	}
//
//	@When("^User submit revisit$")
//	public void user_submit_revisit() {
//		try {
//			revisitAction.revist();
//		} catch (Exception e) {
//			System.err.println(e);
//		}
//	}
//
//	@Then("^submit successfullfy$")
//	public void submit_successfullfy() {
//		try {
//
//		} catch (Exception e) {
//		}
//	}

//	@Given("^User is on patient registration$")
//	public void user_is_on_patient_registration() {
//		try {
//			dashboardAction.gotoPatientRegistration();
//		} catch (Exception e) {
//		}
//	}
//
//	@When("^User submit patient registration$")
//	public void user_submit_patient_registration() {
//		try {
//			patientRegistrationAction.patientRegistration();
//		} catch (Exception e) {
//		}
//	}
//
//	@Then("^submit registration successfullfy$")
//	public void submit_registration_successfullfy() {
//		try {
//			System.out.println("Registration done success");
////	dashboardAction.loadHome();
////		dashboardAction.loadOpClinic();
////		dashboardAction.observationDashboard();
//		} catch (Exception e) {
//		}
//	}

//	@Given("^User is on Search Observation$")
//	public void user_is_on_Search_Observation() {
//		try {
//			DashboardAction.loadHome();
//			DashboardAction.loadOpClinic();
//			DashboardAction.observationDashboard();
//		} catch (Exception e) {
//		}
//	}
//
//	@When("^User search observation$")
//	public void user_search_observation() {
//		try {
//			observationDashboardAction.searchObservation();
//		} catch (Exception e) {
//			System.err.println("search err " + e);
//		}
//	}
//
//	@Then("^Search observation successfullfy$")
//	public void search_observation_successfullfy() {
//		try {
//			System.out.println("observation searched successfully");
//		} catch (Exception e) {
//		}
//	}

	
}
