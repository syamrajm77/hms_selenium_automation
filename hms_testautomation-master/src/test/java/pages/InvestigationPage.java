package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InvestigationPage {
	WebDriver driver;

	@FindBy(name = "hinNo")
	WebElement hinNo;

	@FindBy(id = "departmentId")
	WebElement departmentId;

	@FindBy(name = "patientName")
	WebElement patientName;

	@FindBy(name = "age")
	WebElement age;

	@FindBy(name = "appointmentNo")
	WebElement appointmentNo;

	@FindBy(id = "equipmentId")
	WebElement equipmentId;

	@FindBy(id = "searchButton")
	WebElement searchButton;

	public InvestigationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setHiNo(String hinNo1) {
		hinNo.sendKeys(hinNo1);
	}

	public void setDepartmentId(String departmentId1) {
		Select department = new Select(departmentId);
		department.selectByValue(departmentId1);
	}

	public void setPatientName(String patientName1) {
		patientName.sendKeys(patientName1);
	}

	public void setAge(String age1) {
		age.sendKeys(age1);
	}

	public void setAppointmentNo(String appointmentNo1) {
		appointmentNo.sendKeys(appointmentNo1);
	}

	public void setEquipmentId(String equipmentId1) {
		Select equipment = new Select(equipmentId);
		equipment.selectByValue(equipmentId1);
	}

	public void clickSearch() {
		searchButton.click();
	}
}
