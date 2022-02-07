package actions;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver.EhealthDriver;

public class LogoutAction {

	private static final Log LOG = LogFactory.getLog(LoginAction.class);
	WebDriver driver;
	
	public void logout() {
		try {
			driver = EhealthDriver.getDriverInstance();
			Thread.sleep(3000);
			driver.findElement(By.className("logout-icon")).click();
		} catch (Exception e) {
			LOG.error(e);
		}
	}
}
