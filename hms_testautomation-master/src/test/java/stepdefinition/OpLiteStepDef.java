package stepdefinition;


import java.util.List;

import actions.DashboardAction;
import actions.OpLiteAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.OpConsultaion;
import model.Registration;

public class OpLiteStepDef {
	private OpLiteAction opLiteAction;
	
	@Given("^User is on opLite$")
	public void user_is_on_opLite() {
		try {
			OpLiteAction.gotoOpLite();
			Thread.sleep(2000);
			
		} catch (Exception e) {
		}
	}

	@When("^User select patient$")
	public void user_select_patient() {
		System.out.println("user_select_patient");
		try {
			Thread.sleep(3000);
			OpLiteAction.searchOpPatient();
			Thread.sleep(3000);
			OpLiteAction.selectOpPatient();
			Thread.sleep(30000);
		} catch (Exception e) {
		}
	}

	@When("^User submit op details$")
	public void user_submit_op_details(){
		System.out.println("user_submit_op_details**");
		try {
			Thread.sleep(20000);
			List<OpConsultaion> opConsultaionList = opLiteAction.getOpConsultaionDataFromExcel();
			for (OpConsultaion opConsultaion : opConsultaionList) {
				Thread.sleep(20000);
				opLiteAction.opConsultaion(opConsultaion);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
		}
	}

	@Then("^Op successfullfy$")
	public void op_successfullfy() {
		try {

		} catch (Exception e) {
		}
	}
}
