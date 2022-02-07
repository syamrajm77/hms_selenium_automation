package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	WebDriver driver;

	@FindBy(id = "pNameId")//
	WebElement patientName;
	
	@FindBy(id = "gender")//
	WebElement gender;
	
	@FindBy(id = "age")//
	WebElement age;
	
	@FindBy(xpath="/html/body")
	WebElement regPage;
	
	@FindBy(id="pHouseName")//
	WebElement houseName;
	
	@FindBy(id="PhouseId")//
	WebElement area;
	
	@FindBy(id = "mobileNoId")//
	WebElement mobileNo;
	
	@FindBy(id = "stateId")//
	WebElement state;
	
	@FindBy(id = "migrantCityId")//
	WebElement district;
	
	@FindBy(id="rationCardTypes")//
	WebElement rationCardTypes;
	
	@FindBy(id = "otherCategoryId") 
    WebElement specialCatgory;
	 
	@FindBy(id="VisitschemeId")
	WebElement scheme;
	
	@FindBy(id="monIncome")
	WebElement monthIncome;
	
	@FindBy(id = "deptId")
	WebElement departmentId;
	
	@FindBy(id="unit")
	WebElement unit;
	
	/*
	 * @FindBy(id="opsession") WebElement opSession;
	 */
	
	@FindBy(name = "loddrs")
	WebElement loddrs;
	
	
	/*
	 * @FindBy(id="locality") WebElement locality;
	 */
	
	/*
	 * @FindBy(id="address") WebElement address;
	 */
	
	@FindBy(id="cashreceived")
	WebElement cashReceived;
	
	@FindBy(id="massCasuality")
	WebElement massCasuality;
	
	 @FindBy(id="cashReason") 
	 WebElement cashReason;
	 /*
	 * @FindBy(id="chisNo") WebElement chisNo;
	 * 
	 * @FindBy(id="mrNoId") WebElement mrNoId;
	 */
	
	@FindBy(id="Submit11")
	WebElement submitReg;
		
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setPatientName(String patientName1) {
    patientName.sendKeys(patientName1);	
    }

	public void setGender(String gender1) {
		Select genderSel=new Select(gender);
		genderSel.selectByValue(gender1);
	}
	
	public void setAge(Integer age1) {
		age.sendKeys(String.valueOf(age1));
	}

	public void clickRegPage() {
		regPage.click();
	}

	public void setMonthIncome(String monthIncome1) {
		monthIncome.sendKeys(monthIncome1);
	}

	public void setHouseName(String houseId1) {
		houseName.sendKeys(houseId1);
	}
	
	public void setArea(String area1) {
		area.sendKeys(area1);
	}

	public void setMobileNo(String mobileNo1) {
		mobileNo.sendKeys(mobileNo1);
	}

	public void setDepartmentId(String departmentId1) {
		Select departmentSel=new Select(departmentId);
		departmentSel.selectByValue(departmentId1);
	}

	/*
	 * public void setOpSession(String opSession1) { Select opSessionSel=new
	 * Select(opSession); opSessionSel.selectByValue(opSession1); }
	 */

	public void setRationCardTypes(String rationCardTypes1) {
		Select rationCardTypesSel=new Select(rationCardTypes);
		rationCardTypesSel.selectByValue(rationCardTypes1);
	}

	public void setUnit(String unit1) {
		Select unitSel=new Select(unit);
		unitSel.selectByValue(unit1);
	}

	public void setLoddrs(String loddrs1) {
        Select loddrsSel=new Select(loddrs);
		loddrsSel.selectByValue(loddrs1);
	}

	
	  public void setSpecialCategory(String specialCatgory1) { 
      Select specialCatgorySel=new Select(specialCatgory);
      specialCatgorySel.selectByValue(specialCatgory1); }
	 

	public void setScheme(String scheme1) {		
		 Select schemeSel=new Select(scheme);
		 schemeSel.selectByValue(scheme1);

		}

		/*
		 * public void setLocality(String locality1) { locality.sendKeys(locality1); }
		 */

	/*
	 * public void setAddress(String address1) { address.sendKeys(address1); }
	 */

	public void cashReceivedClick() {
		cashReceived.click(); 
		}
	public boolean cashReceivedSelect() {
		boolean status=false;
		if(cashReceived.isSelected()) {
			status=true;
		}else {
		status=false;	
		}
		return status;
		}

	public void setCashReason(String cashReason1) {
		cashReason.sendKeys(cashReason1);
		Select cashReasonSel=new Select(cashReason);
		cashReasonSel.selectByValue(cashReason1);
	}

	/*
	 * public void setChisNo(String chisNo1) { chisNo.sendKeys(chisNo1); }
	 * 
	 * public void setMrNoId(String mrNoId1) { mrNoId.sendKeys(mrNoId1); }
	 */
	public void clickSubmit() {
		submitReg.click();
	}
	
	public void massCasuality() {
		massCasuality.click();
	}

	public RegistrationPage() {
		super();
	}
	public void setState(String state1) {
		Select stateSel=new Select(state);
		stateSel.selectByValue(state1);
	}
	
	public void setDistrict(String district1) {
		Select districtSel=new Select(district);
		districtSel.selectByValue(district1);
	}
}
