package hooks;

import org.openqa.selenium.WebDriver;

import actions.LoginAction;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.CommonUtils;

public class Hooks {
	WebDriver driver;
	LoginAction loginAction;
	@Before("@login")
	public void login(Scenario scenario) {
		loginAction = new LoginAction();
		System.out.println("Before Run"+ scenario.getStatus());
		CommonUtils.loadHomePage();
		//loginAction.login();
	}
	@After("@logout")
	public void logout(Scenario scenario) {

		System.out.println("after run"+scenario.getStatus());
	}
}
