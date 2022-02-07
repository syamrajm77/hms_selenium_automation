package actions;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;

import driver.EhealthDriver;
import pages.PatientRegistrationPage;

public class PatientRegistrationAction {
	private static final Log LOG = LogFactory.getLog(PatientRegistrationAction.class);

	WebDriver driver;
	PatientRegistrationPage patientRegistrationPage;
	Integer idCardTypeId = 1;
	String idCardNum = "CXUPM0218D";
	String patientName = "Syam raj";
	Integer relationShipId = 2;
	String relativeName = "Mani rajan";
	Integer age = 30;
	Integer gender = 3;
	Integer bloodGroup = 12;
	String emailId = "syamrajm.ehk@kerala.gov.in";

	public void patientRegistration() {
		try {
			driver = EhealthDriver.getDriverInstance();
			patientRegistrationPage = new PatientRegistrationPage(driver);
			patientRegistrationPage.otherRegSelect();
			patientRegistrationPage.setIdCardSel(idCardTypeId);
			patientRegistrationPage.setIdCardNumber(idCardNum);
			patientRegistrationPage.setPatientName(patientName);
			patientRegistrationPage.setRelationId(relationShipId);
			patientRegistrationPage.setRelativeName(relativeName);
			patientRegistrationPage.setPatientAge(age);
			patientRegistrationPage.patientPage();
			patientRegistrationPage.setGender(gender);
			patientRegistrationPage.setBloodGroupId(bloodGroup);
			patientRegistrationPage.setEmailId(emailId);
			Thread.sleep(1000);
			patientRegistrationPage.submitPatient();
		} catch (Exception e) {
			LOG.error(e);
		}
	}

}
