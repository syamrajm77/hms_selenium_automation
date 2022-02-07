package actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import driver.EhealthDriver;
import model.Login;
import model.Registration;
import model.Revisit;
import pages.RevisitPage;
import util.CommonUtils;

public class RevisitAction {
	private static final Log LOG = LogFactory.getLog(RevisitAction.class);

	WebDriver driver;
	RevisitPage revisitPage;

	public List<Revisit> getRevisitDataFromExcel() {
		List<Revisit> revisitList = new ArrayList<Revisit>();
		try {

			File file = new File(CommonUtils.excelFileUrl);

			FileInputStream inputStream = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(inputStream);
			Sheet sheet = wb.getSheet(CommonUtils.excelRevisitSheetName);

			int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
			DataFormatter formatter = new DataFormatter();
			for (int i = 1; i <= rowCount; i++) {
				int count = 0;
				Revisit revisit = new Revisit();
				revisit.setMobileNo(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				revisit.setDeptId(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				revisit.setSelDoctor(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				revisit.setSelRationCard(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				revisit.setCashReason(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				revisit.setMassCasualityChek(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				
				revisitList.add(revisit);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return revisitList;
	}

	public void submitRevist(Revisit revisit) {
		try {
			driver = EhealthDriver.getDriverInstance();
			revisitPage =new RevisitPage(driver);
			revisitPage.setMobileNo(revisit.getMobileNo());
			revisitPage.clickSearchButton();
			Thread.sleep(10000);
			revisitPage.clickRevisitPage();

			Thread.sleep(1000);
			revisitPage.setDepartmentId(revisit.getDeptId());
			revisitPage.setQuickLoddrs(revisit.getSelDoctor());
			revisitPage.setRationCardType(revisit.getSelRationCard());
			revisitPage.cashReceivedClick();
			Thread.sleep(1000);
			if (revisitPage.cashReceivedSelect()) {
			} else {
				revisitPage.setCashReason(revisit.getCashReason());
			}
			revisitPage.setMassCasualityCheck(revisit.getMassCasualityChek());
			if (revisitPage.massCasualitySelect()) {
				revisitPage.setMassCasualitySelect(revisit.getMassCasualityChek());
			} else {
			}
			Thread.sleep(1000);
			revisitPage.revisitSubmit();

		} catch (Exception e) {
			LOG.error(e);
		}
	}
	
	
}
