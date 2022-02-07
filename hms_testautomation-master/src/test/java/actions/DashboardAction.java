package actions;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.WebConsole;

import driver.EhealthDriver;

public class DashboardAction {
	private static final Log LOG = LogFactory.getLog(WebConsole.class);
	static WebDriver driver;
	
	public static void loadHome() {
		try {
		driver=EhealthDriver.getDriverInstance();
		driver.findElement(By.xpath("/html/body/form/div/div/div[2]/div[2]/a[1]")).click();
		}catch (Exception e) {
		}
	}
	
	public static void loadReception() {
		try {
		driver = EhealthDriver.getDriverInstance();
		Thread.sleep(4000);
		driver.findElement(By.name("reception")).click(); 
		Thread.sleep(4000);
		} catch (Exception e) {
			LOG.error(e);
		}
	}
	
	public static void loadOpClinic() {
		try {
			driver = EhealthDriver.getDriverInstance();
			Thread.sleep(3000);
			driver.findElement(By.name("opd")).click(); 
			Thread.sleep(1000);
			} catch (Exception e) {
				LOG.error(e);
			}
	}
	
	public static void cancelInvestigation() {
		try {
		driver = EhealthDriver.getDriverInstance();
		
		driver.findElement(By.id("A387")).click(); 
		Thread.sleep(1000);
		} catch (Exception e) {
			LOG.error(e);
		}
	}
	
	public static void gotoQuickRegistration() {
		try {
		Thread.sleep(1000);
		driver = EhealthDriver.getDriverInstance();
		driver.findElement(By.id("A2151")).click(); 
		Thread.sleep(1000);
		} catch (Exception e) {
			LOG.error(e);
		}
	}
	
	public static void gotoRevisit() {
		try {
		driver = EhealthDriver.getDriverInstance();
		Thread.sleep(2000);
		DashboardAction.gotoQuickRegistration();
		Thread.sleep(1000);
		driver.findElement(By.id("visitType")).click(); 
		Thread.sleep(1000);
		} catch (Exception e) {
			LOG.error(e);
		}
	}
	
	public static void gotoPatientRegistration() {
		try {
		driver = EhealthDriver.getDriverInstance();
		driver.findElement(By.id("A59")).click(); 
		Thread.sleep(1000);
		} catch (Exception e) {
			LOG.error(e);
		}
	}

	public static void observationDashboard() {
		try {
			driver = EhealthDriver.getDriverInstance();
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.id("A1754"))).perform();

			driver.findElement(By.xpath("//a[text()='Observation Dashboard']")).click();

		} catch (Exception e) {
			LOG.error(e);
		}
	}
	
}
