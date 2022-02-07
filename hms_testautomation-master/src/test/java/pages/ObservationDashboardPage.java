package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObservationDashboardPage {

	WebDriver driver;

	@FindBy(id = "tokenNo")
	WebElement tokenNo;

	@FindBy(id = "uhid")
	WebElement uhId;

	@FindBy(id = "patientName")
	WebElement patientName;

	@FindBy(name = "doctorName")
	WebElement doctorName;

	@FindBy(id = "mobileNo")
	WebElement mobileNo;

	@FindBy(id = "search")
	WebElement searchBtn;

	public ObservationDashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setTokenNo(String tokenNo1) {
		System.out.println(" token "+tokenNo1);
		tokenNo.sendKeys(tokenNo1);
	}

	public void setUhId(String uhId1) {
		System.out.println(" uhId1 "+uhId1);
		uhId.sendKeys(uhId1);
	}

	public void setPatientName(String patientName1) {
		patientName.sendKeys(patientName1);
	}

	public void setDoctorName(String doctorName1) {
		doctorName.sendKeys(doctorName1);
	}

	public void setMobileNo(String mobileNo1) {
		mobileNo.sendKeys(mobileNo1);
	}

	public void searchObservation() {
		searchBtn.click();
	}
}
