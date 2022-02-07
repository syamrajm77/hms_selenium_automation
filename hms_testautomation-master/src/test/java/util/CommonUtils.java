package util;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.htmlunit.WebConsole;

import driver.EhealthDriver;

public class CommonUtils {
	private static final Log LOG = LogFactory.getLog(WebConsole.class);
	static WebDriver driver;

	//private static String applicationUrl = "https://uat.ehealth.kerala.gov.in/hms/";
	private static String applicationUrl = "http://localhost:8081/hms/";
	public static String excelFileUrl = "E:\\selenium_excel\\hms_excel.xlsx";
	public static String excelRegistrationSheetName = "REGISTRATION";
	public static String excelLoginSheetName = "LOGIN";
	public static String excelRevisitSheetName = "REVISIT";
	public static String excelOpLiteSheetName = "OPLITE";
	public static void loadHomePage() {
		try {
			driver = EhealthDriver.getDriverInstance();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			driver.get(applicationUrl);
		} catch (Exception e) {
			LOG.error(e);
		}

	}

}
