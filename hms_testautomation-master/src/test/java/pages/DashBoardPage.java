package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	WebDriver driver;

	@FindBy(xpath  = "/html/body/div[1]/form[1]/div[2]/ul/li[1]/a")
	WebElement receptionMenu;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickReceptionMenu() {
		System.out.println("click reception before");
		receptionMenu.click();
		System.out.println("click reception");
	}
}
