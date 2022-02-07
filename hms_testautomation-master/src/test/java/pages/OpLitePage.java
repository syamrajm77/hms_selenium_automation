package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpLitePage {

	WebDriver driver;
	
	@FindBy(id="counterId")
	WebElement opCounter;
	
	@FindBy(id="searchresults")
	WebElement selectPatient;

	@FindBy(id = "search")
	WebElement submitSearch;
	
	@FindBy(xpath="/html/body/div[5]/div[2]/div[3]/div[1]/div/table/tbody/tr[1]/td[3]")
	WebElement patientTable;
	
	public void clickSearchButton() {
		submitSearch.click();
	}
	
	public void setOpCounter(String counter) {
		Select opCounterSel=new Select(opCounter);
		opCounterSel.selectByValue(counter);
	}

	public void selectPatient() {
		selectPatient.click();
	}

	public OpLitePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void submitSelPatient() {
		patientTable.click();
	}
}
