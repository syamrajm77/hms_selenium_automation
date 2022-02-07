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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.htmlunit.WebConsole;

import driver.EhealthDriver;
import model.OpConsultaion;
import model.Registration;
import pages.OpConsultationPage;
import pages.OpLitePage;
import pages.RegistrationPage;
import util.CommonUtils;

public class OpLiteAction {
	private static final Log LOG = LogFactory.getLog(WebConsole.class);
	static WebDriver driver;
	static OpLitePage opLitePage;
	static OpConsultationPage opConsultationPage;
	static String counterNo="148";
	
	
	public static void gotoOpLite() {
		try {
		Thread.sleep(4000);
		driver = EhealthDriver.getDriverInstance();
		driver.findElement(By.id("A2152")).click(); 
		Thread.sleep(1000);
		} catch (Exception e) {
			LOG.error(e);
		}
	}
	
	public static void searchOpPatient() {
		try {
			driver = EhealthDriver.getDriverInstance();
			opLitePage=new OpLitePage(driver);
			
			Thread.sleep(2000);
			opLitePage.clickSearchButton();
			
		} catch (Exception e) {
			LOG.error(e);
		}
	}
	public static void selectOpPatient() {
		try {
			driver = EhealthDriver.getDriverInstance();
			opLitePage=new OpLitePage(driver);
			Thread.sleep(3000);
			opLitePage.setOpCounter(counterNo);
			Thread.sleep(3000);
			opLitePage.selectPatient();
			//opLitePage.submitSelPatient();
			Thread.sleep(4000);
			driver.switchTo().alert().accept();
			Thread.sleep(4000);
		} catch (Exception e) {
			LOG.error(e);
		}
	}
	
	public List<OpConsultaion> getOpConsultaionDataFromExcel() {
		System.out.println("getOpConsultaionDataFromExcel**");
		List<OpConsultaion> opConsultaionList = new ArrayList<OpConsultaion>();
		try {

			File file = new File(CommonUtils.excelFileUrl);

			FileInputStream inputStream = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(inputStream);
			Sheet sheet = wb.getSheet(CommonUtils.excelOpLiteSheetName);
			int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
			DataFormatter formatter = new DataFormatter();
			for (int i = 1; i <= rowCount; i++) {
				int count = 0;
				OpConsultaion opConsultaion = new OpConsultaion();
				opConsultaion.setMrNo(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				opConsultaion.setPresentComplaints(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				opConsultaion.setClinicalFindings(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				opConsultaion.setProvisionalDiagnosis(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				opConsultaion.setFinalDiagnosis(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				opConsultaion.setTemperature(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				opConsultaion.setSystolic(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				opConsultaion.setDiastolic(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				opConsultaion.setPulse(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				opConsultaion.setWeight(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				opConsultaion.setHeight(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				opConsultaion.setRespiratoryRate(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				opConsultaion.setBloodGroupValue(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				opConsultaion.setChargeCodeName(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				opConsultaion.setBre(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				opConsultaion.setDrugName(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				opConsultaionList.add(opConsultaion);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return opConsultaionList;
	}
	
	public void opConsultaion(OpConsultaion opConsultaion) {
		try {
			Thread.sleep(1000);
			driver = EhealthDriver.getDriverInstance();
			opConsultationPage = new OpConsultationPage(driver);
			opConsultationPage.setMrNo(opConsultaion.getMrNo());
			opConsultationPage.setClinicalFindings(opConsultaion.getClinicalFindings());
			opConsultationPage.setProvisionalDiagnosis(opConsultaion.getProvisionalDiagnosis());
			opConsultationPage.setFinalDiagnosis(opConsultaion.getFinalDiagnosis());
			opConsultationPage.setTemperature(opConsultaion.getTemperature());
			opConsultationPage.setSystolic(opConsultaion.getSystolic());
			opConsultationPage.setDiastolic(opConsultaion.getDiastolic());
			opConsultationPage.setPulse(opConsultaion.getPulse());
			opConsultationPage.setHeight(opConsultaion.getHeight());
			opConsultationPage.setRespiratoryRate(opConsultaion.getRespiratoryRate());
			opConsultationPage.setBloodGroupValue(opConsultaion.getBloodGroupValue());
			opConsultationPage.setChargeCodeName(opConsultaion.getChargeCodeName());
			opConsultationPage.setBre(opConsultaion.getBre());
			opConsultationPage.setDrugName(opConsultaion.getDrugName());
			Thread.sleep(1000);
			opConsultationPage.clickSurgeryExpanBtn();
			opConsultationPage.clickProcedureExpanBtn();
			opConsultationPage.clickAdviceExpanBtn();
			Thread.sleep(1000);
			opConsultationPage.clickSubmitOp();
			Thread.sleep(1000);
		} catch (Exception e) {
		}

	}
	
	/*
	 * public static void setOpConsultation() { try { driver =
	 * EhealthDriver.getDriverInstance(); opConsultationPage=new
	 * OpConsultationPage(driver); Thread.sleep(2000);
	 * opLitePage.setOpCounter(counterNo);
	 * 
	 * } catch (Exception e) { LOG.error(e); } }
	 */
	
}
