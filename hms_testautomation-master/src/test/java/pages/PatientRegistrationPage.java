package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PatientRegistrationPage {

	WebDriver driver;

	@FindBy(id = "otherIdReg")
	WebElement otherIdReg;

	@FindBy(name = "otherIdCard")
	WebElement idCardSel;

	@FindBy(id = "OtherIdCardId")
	WebElement idCardNumber;

	@FindBy(id = "pNameId")
	WebElement patientName;

	@FindBy(id = "relId")
	WebElement relationId;

	@FindBy(id = "relativeNameId")
	WebElement relativeName;

	@FindBy(id = "age")
	WebElement patientAge;

	@FindBy(id = "gender")
	WebElement gender;

	@FindBy(id = "bloodGroupId")
	WebElement bloodGroupId;

	@FindBy(id = "emailId")
	WebElement emailId;

	@FindBy(name = "Submit11")
	WebElement submitPatient;

	@FindBy(xpath = "/html/body/div[5]/form[2]/div[4]")
	WebElement patientPage;

	public PatientRegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void otherRegSelect() {
		otherIdReg.click();
	}

	public void setIdCardSel(Integer idCardSel1) {
		Select idCardSelected = new Select(idCardSel);
		idCardSelected.selectByValue(String.valueOf(idCardSel1));

	}

	public void setIdCardNumber(String idCardNumber1) {
		idCardNumber.sendKeys(idCardNumber1);
	}

	public void setPatientName(String patientName1) {
		patientName.sendKeys(patientName1);
	}

	public void setRelationId(Integer relationId1) {
		Select relationIdSel = new Select(relationId);
		relationIdSel.selectByValue(String.valueOf(relationId1));
	}

	public void setRelativeName(String relativeName1) {
		relativeName.sendKeys(relativeName1);
	}

	public void setPatientAge(Integer patientAge1) {
		patientAge.sendKeys(String.valueOf(patientAge1));
	}

	public void setGender(Integer gender1) {
		Select genderSel = new Select(gender);
		genderSel.selectByValue(String.valueOf(gender1));
	}

	public void setBloodGroupId(Integer bloodGroupId1) {
		Select bloodGroupSel = new Select(bloodGroupId);
		bloodGroupSel.selectByValue(String.valueOf(bloodGroupId1));
	}

	public void setEmailId(String emailId1) {
		emailId.sendKeys(emailId1);
	}

	public void submitPatient() {
		submitPatient.click();
	}

	public void patientPage() {
		patientPage.click();
	}

}
