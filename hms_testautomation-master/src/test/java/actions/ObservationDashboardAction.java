package actions;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;

import driver.EhealthDriver;
import pages.ObservationDashboardPage;

public class ObservationDashboardAction {
	private static final Log LOG = LogFactory.getLog(ObservationDashboardAction.class);

	WebDriver driver;
	ObservationDashboardPage observationDashboardPage;

	String tokenNo = "121";
	String uhId = "T104500604180641";
	String patientName = "";
	String doctorName = "";
	String mobileNo = "";

	public void searchObservation() {
		try {
			driver = EhealthDriver.getDriverInstance();
			observationDashboardPage = new ObservationDashboardPage(driver);
			observationDashboardPage.setTokenNo(tokenNo);
			observationDashboardPage.setUhId(uhId);

			observationDashboardPage.setPatientName(patientName);
			observationDashboardPage.setDoctorName(doctorName);
			observationDashboardPage.setMobileNo(mobileNo);
			observationDashboardPage.searchObservation();
		} catch (Exception e) {
			LOG.error(e);
		}
	}
}
