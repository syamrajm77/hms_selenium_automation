package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	WebDriver driver;

	@FindBy(id = "loginName")
	WebElement userName;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id="hospital")
	WebElement hospitalId;
	
	@FindBy(name="departmentId")
	WebElement deptId;
	
	@FindBy(name = "Login2")
	WebElement submitButton;
	
	@FindBy(id="main")
    WebElement clickMain;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String userName1) {
		userName.sendKeys(userName1);
	}

	public void setPasswrod(String password1) {
		password.sendKeys(password1);
	}

	public void setHospitalId(String hospitalId1) {
		
		Select hospitals = new Select(hospitalId);
		hospitals.selectByValue(hospitalId1);
	}

	public void setDeptId(String deptId1) {
		
		Select hospitals = new Select(deptId);
		hospitals.selectByValue(deptId1);
	}
	
	public void clickSubmit() {
		submitButton.click();
	}
	
	public void clickMain() {
		clickMain.click();
	}
}
