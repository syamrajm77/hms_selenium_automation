package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpConsultationPage {

	WebDriver driver;

	@FindBy(id = "mrNo")
	WebElement mrNo;
	
	@FindBy(id = "presentComplain")
	WebElement presentComplaints;
	
	@FindBy(id = "clinicalFindings")
	WebElement clinicalFindings;
	
	@FindBy(id = "snomed")
	WebElement provisionalDiagnosis;
	
	@FindBy(id = "finalDiagnosis")
	WebElement finalDiagnosis;
	
	@FindBy(id = "temperature")
	WebElement temperature;
	
	@FindBy(id = "systolic")
	WebElement systolic;
	
	@FindBy(id = "diastolic")
	WebElement diastolic;
	
	@FindBy(id = "pulse")
	WebElement pulse;
	
	@FindBy(id = "weight")
	WebElement weight;
	
	@FindBy(id = "height")
	WebElement height;
	
	@FindBy(id = "respiratoryRate")
	WebElement respiratoryRate;
	
	@FindBy(id = "bloodGroupValue")
	WebElement bloodGroupValue;
	
	@FindBy(id = "chargeCodeName0")
	WebElement chargeCodeName;
	
	@FindBy(name = "fixedInvestigation")
	WebElement bre;
	
	@FindBy(id = "nomenclature0")
	WebElement drugName;
	
	@FindBy(id = "realtedbutton9")
	WebElement procedureExpanBtn;
	
	@FindBy(id = "realtedbutton3")
	WebElement surgeryExpanBtn;
	
	@FindBy(id = "realtedbutton8")
	WebElement adviceExpanBtn;
	
	@FindBy(id = "Submit11")
	WebElement submitOp;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[1]")
	WebElement opTabSelect;
	
	public OpConsultationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void setRespiratoryRate(String respiratoryRate1) {
		respiratoryRate.sendKeys(respiratoryRate1);
	}
	
	public void setMrNo(String mrNo1) {
		mrNo.sendKeys(mrNo1);
	}

	public void setPresentComplaints(String presentComplaints1) {
		presentComplaints.sendKeys(presentComplaints1);
	}

	public void setClinicalFindings(String clinicalFindings1) {
		clinicalFindings.sendKeys(clinicalFindings1);
	}
	public void setProvisionalDiagnosis(String provisionalDiagnosis1) {
		provisionalDiagnosis.sendKeys(provisionalDiagnosis1);
	}
	public void setFinalDiagnosis(String finalDiagnosis1) {
		finalDiagnosis.sendKeys(finalDiagnosis1);
	}
	public void setTemperature(String temperature1) {
		temperature.sendKeys(temperature1);
	}
	public void setSystolic(String systolic1) {
		systolic.sendKeys(systolic1);
	}
	public void setDiastolic(String diastolic1) {
		diastolic.sendKeys(diastolic1);
	}
	public void setPulse(String pulse1) {
		pulse.sendKeys(pulse1);
	}
	public void setWeight(String weight1) {
		weight.sendKeys(weight1);
	}
	public void setHeight(String height1) {
		height.sendKeys(height1);
	}
	public void setBloodGroupValue(String bloodGroupValue1) {
		Select bloodGroup = new Select(bloodGroupValue);
		bloodGroup.selectByValue(bloodGroupValue1);
	}
	
	public void setChargeCodeName(String chargeCodeName1) {
		chargeCodeName.sendKeys(chargeCodeName1);
	}
	
	public void setBre(String bre1) {
		bre.sendKeys(bre1);
	}
	
	public void setDrugName(String drugName1) {
		drugName.sendKeys(drugName1);
	}
	
	public void clickProcedureExpanBtn() {
		procedureExpanBtn.click();
	}
	public void clickSurgeryExpanBtn() {
		surgeryExpanBtn.click();
	}
	
	public void clickAdviceExpanBtn() {
		adviceExpanBtn.click();
	}
	
	public void clickSubmitOp() {
		submitOp.click();
	}
	
	public void clickOpTab() {
		opTabSelect.click();
	}
}
