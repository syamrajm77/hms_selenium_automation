package actions;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;

import driver.EhealthDriver;
import pages.InvestigationPage;

public class InvestigationAction {
	private static final Log LOG = LogFactory.getLog(InvestigationAction.class);
	WebDriver driver;
	InvestigationPage investigationPage;

	private String uhid = "T104500604180641";
	private String department = "4";
	private String patiantName = "syam";
	private String age = "40";
	private String inviNo = "100";
	private String eqpmentvalue = "10972";

	public void cancelInvestigation() {
		try {
		
			System.out.println("cancelInvestigation**");
			driver = EhealthDriver.getDriverInstance();
			investigationPage = new InvestigationPage(driver);
			investigationPage.setHiNo(uhid);
			investigationPage.setDepartmentId(department);
			investigationPage.setPatientName(patiantName);
			investigationPage.setAge(age);
			investigationPage.setAppointmentNo(inviNo);
			investigationPage.setEquipmentId(eqpmentvalue);
			Thread.sleep(1000);
			investigationPage.clickSearch();
		} catch (Exception e) {
			LOG.error(e);
		}
	}
}
