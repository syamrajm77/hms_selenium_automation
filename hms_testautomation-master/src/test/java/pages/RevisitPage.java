package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RevisitPage {
WebDriver driver;

@FindBy(id="mobno")
WebElement mobileNo;

@FindBy(id="searchId")
WebElement searchButton;
///html/body/div[5]/div[2]/div[6]/form[1]/table/tbody/tr[2]/td[1]
@FindBy(xpath="/html/body/div[5]/div[2]/div[6]/form[1]/div[5]/div/div/div/table/tbody/tr[2]/td[1]")
WebElement revisitPage;

@FindBy(id="vdeptId")
WebElement departmentId;

@FindBy(id="quickloddrs")
WebElement quickLoddrs;

@FindBy(id="vRationCardTypes")
WebElement rationCardType;

@FindBy(id="cashreceivedRV")
WebElement cashRecievedCheck;

@FindBy(id="massCasualityR")
WebElement massCasualityCheck;

@FindBy(id="massSelectIdR")
WebElement massCasualitySelect;

@FindBy(id="Submit12")
WebElement revisitSubmit;

@FindBy(id="cashReasonRV")
WebElement cashReason;

public RevisitPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void setMobileNo(String mobileNo1) {
	System.out.println("mobileNo1 "+mobileNo1);
mobileNo.sendKeys(mobileNo1);
}

public void clickSearchButton() {
	searchButton.click();
}

public void clickRevisitPage() {
	revisitPage.click();
}


public void setDepartmentId(String departmentId1) {
	Select dept=new Select(departmentId);
	dept.selectByValue(departmentId1);
}

public void setQuickLoddrs(String quickLoddrs1) {
	Select ldrDrSel=new Select(quickLoddrs);
	ldrDrSel.selectByValue(quickLoddrs1);
}

public void setRationCardType(String rationCardType1) {
	
	Select rationCard=new Select(rationCardType);
	rationCard.selectByValue(rationCardType1);
}

public void setCashRecievedCheck() {
	cashRecievedCheck.click();
}

public void setMassCasualityCheck(String massCasualityCheck1) {
	massCasualityCheck.sendKeys(massCasualityCheck1);
}

public void setMassCasualitySelect(String massCasualitySelect1) {
	massCasualitySelect.sendKeys(massCasualitySelect1);
}

public void revisitSubmit() {
	revisitSubmit.click();
}

public void setCashReason(String cashReason1) {
	Select cashReasonC=new Select(cashReason);
	cashReasonC.selectByValue(cashReason1);
}

public void cashReceivedClick() {
	cashRecievedCheck.click(); 
	}
public boolean cashReceivedSelect() {
	boolean status=false;
	if(cashRecievedCheck.isSelected()) {
		status=true;
	}else {
	status=false;	
	}
	return status;
	}

public boolean massCasualitySelect() {
	boolean status=false;
	if(massCasualityCheck.isSelected()) {
		status=true;
	}else {
	status=false;	
	}
	return status;
	}
}
