package actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver.EhealthDriver;
import model.Login;
import pages.LoginPage;
import util.CommonUtils;

public class LoginAction {
	private static final Log LOG = LogFactory.getLog(LoginAction.class);
	WebDriver driver;
	LoginPage loginPage;

	public void login(String userName,String password,String hospitalId,String deptId) {
		try {
			
			driver = EhealthDriver.getDriverInstance();
			loginPage = new LoginPage(driver);
			loginPage.setUserName(userName);
			loginPage.setPasswrod(password);
			loginPage.clickMain();
			Thread.sleep(2000);
			loginPage.setHospitalId(hospitalId);
			Thread.sleep(2000);
			loginPage.clickMain();
			loginPage.setDeptId(deptId);
			loginPage.clickSubmit();
			Thread.sleep(5000);
			driver.switchTo().alert().accept();
			Thread.sleep(5000);
		} catch (Exception e) {
			LOG.error(e);
		}
	}

	public void login() {
		List<Login> login=getLoginDetailsFromExcel();
		try {
			
			driver = EhealthDriver.getDriverInstance();
			loginPage = new LoginPage(driver);
			loginPage.setUserName(login.get(0).getUserName());
			loginPage.setPasswrod(login.get(0).getPassword());
			loginPage.clickMain();
			Thread.sleep(2000);
			loginPage.setHospitalId(login.get(0).getHospitalId());
			Thread.sleep(2000);
			loginPage.clickMain();
			loginPage.setDeptId(login.get(0).getDeptId());
			loginPage.clickSubmit();
			Thread.sleep(5000);
			driver.switchTo().alert().accept();
			Thread.sleep(5000);
		} catch (Exception e) {
			LOG.error(e);
		}
	}
	public void loginAlertAccept() {
		try {
			driver = EhealthDriver.getDriverInstance();
			String mainWindow = driver.getWindowHandle();

			Thread.sleep(3000);
			Set<String> windowHandles = driver.getWindowHandles();

			for (String windows : windowHandles) {
				if (!mainWindow.equals(windows)) {
					driver.switchTo().window(windows);
					driver.findElement(By.name("Ignore")).click();

				}
			}
			driver.switchTo().window(mainWindow);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public List<Login> getLoginDetailsFromExcel() {
		List<Login> loginDet=new ArrayList<Login>();
		 try {
			File file = new File(CommonUtils.excelFileUrl);
			FileInputStream inputStream = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(inputStream);
			Sheet sheet = wb.getSheet(CommonUtils.excelLoginSheetName);

			int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
			DataFormatter formatter = new DataFormatter();
			for (int i = 1; i <= rowCount; i++) {
				Login login=new Login();
				int count=0;
				login.setUserName(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				login.setPassword(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				login.setHospitalId(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				login.setDeptId(formatter.formatCellValue(sheet.getRow(i).getCell(count++)));
				loginDet.add(login);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return loginDet;
	}
}
