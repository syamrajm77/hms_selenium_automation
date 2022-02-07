package actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import driver.EhealthDriver;
import model.Registration;
import pages.RegistrationPage;
import util.CommonUtils;

public class RegistrationAction {
	private static final Log LOG = LogFactory.getLog(RegistrationAction.class);
@Autowired
private LogoutAction logoutAction;
	WebDriver driver;
	RegistrationPage registrationPage;
    String regPageXpath = "/html/body";
	
	public List<Registration> getRegistrationDataFromExcel() {
		List<Registration> registrationList = new ArrayList<Registration>();
		try {

			File file = new File(CommonUtils.excelFileUrl);

			FileInputStream inputStream = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(inputStream);
			Sheet sheet = wb.getSheet(CommonUtils.excelRegistrationSheetName);

			int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
			DataFormatter formatter = new DataFormatter();
			for (int i = 1; i <= rowCount; i++) {
				// int cellcount = sheet.getRow(i).getLastCellNum();
				int count = 0;
				Registration registration = new Registration();
				registration.setPatientName(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				registration.setAge(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				registration.setGender(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				registration.setHouseName(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				registration.setArea(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				registration.setPhoneNo(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				registration.setDeptId(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				registration.setCashReason(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				registration.setCashreceived(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				registration.setLoddrs(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				registration.setMassCasuality(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				registration.setMonthlyIncome(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				registration.setRationCardtype(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				registration.setScheme(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				registration.setSpecialCategory(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				registration.setUnit(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				registration.setState(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				registration.setDistrict(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));		
				
				registrationList.add(registration);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return registrationList;
	}

	public void newRegistration(Registration registration) {
		try {
			Thread.sleep(1000);
			driver = EhealthDriver.getDriverInstance();
			registrationPage = new RegistrationPage(driver);
			registrationPage.setPatientName(registration.getPatientName());
			Thread.sleep(1000);
			registrationPage.setGender(registration.getGender());
			Thread.sleep(1000);
			registrationPage.setAge(Integer.parseInt(registration.getAge()));
			Thread.sleep(1000);
			registrationPage.setHouseName(registration.getHouseName());
			registrationPage.setArea(registration.getArea());
			registrationPage.setMobileNo(registration.getPhoneNo());
			Thread.sleep(1000);
			registrationPage.setDistrict(registration.getDistrict());
			registrationPage.setState(registration.getState());
			Thread.sleep(1000);
			registrationPage.clickRegPage();
			Thread.sleep(1000);
			registrationPage.setRationCardTypes(registration.getRationCardtype());
			Thread.sleep(1000);
			registrationPage.setScheme(registration.getScheme());
			registrationPage.setSpecialCategory(registration.getSpecialCategory());
			registrationPage.setMonthIncome(registration.getMonthlyIncome());
			Thread.sleep(1000);
			registrationPage.setDepartmentId(registration.getDeptId());
			Thread.sleep(2000);
			registrationPage.setUnit(registration.getUnit());
			Thread.sleep(2000);
			registrationPage.setLoddrs(registration.getLoddrs());
			Thread.sleep(1000);
			registrationPage.cashReceivedClick();
			Thread.sleep(1000);

			if (registrationPage.cashReceivedSelect()) {
				System.out.println("cash recieved staus true");
			} else {
				registrationPage.setCashReason(registration.getCashReason());
			}
			Thread.sleep(2000);
			registrationPage.massCasuality();
			
			Thread.sleep(1000);
			registrationPage.clickSubmit();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			LOG.error(e);
			
		}
	}

	

}
