package testCases;
import baseTest.BaseTest;
import pages.Admin_Module_Page;
import pages.Login_Page;
import utils.ExcelFileReader;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Admin_Module_TestCases extends BaseTest {
	
	@Test
	public void Admin_TC01() throws InterruptedException, IOException {
		HashMap<String, String> testData = ExcelFileReader.readDatafromExcelSheet("Admin", "Admin_TC01");
		
		Login_Page loginPage = new Login_Page(driver);
		Admin_Module_Page adminPage = new Admin_Module_Page(driver);	
		//loginPage.getUserName("Admin");
		loginPage.getUserName().sendKeys(testData.get("loginUser"));
		loginPage.getpassWord().sendKeys(testData.get("loginPassWord"));
		loginPage.getloginBtn().click();		
		adminPage.getadminBtn().click();
		adminPage.getaddBtn().click();
		adminPage.getempName().sendKeys(testData.get("empName"));
		
		//---Write the code to enter below
		
		

	}
	
	
	
	@Test
	public void Admin_TC02() throws InterruptedException, IOException {
	HashMap<String, String> testData = ExcelFileReader.readDatafromExcelSheet("Admin", "Admin_TC02");
		
		Login_Page loginPage = new Login_Page(driver);
		Admin_Module_Page adminPage = new Admin_Module_Page(driver);	
		//loginPage.getUserName("Admin");
		loginPage.getUserName().sendKeys(testData.get("loginUser"));
		loginPage.getpassWord().sendKeys(testData.get("loginPassWord"));
		loginPage.getloginBtn().click();
		
		adminPage.getadminBtn().click();
		adminPage.getUserName().sendKeys(testData.get("userName"));
	}
	
	@Test
	public void Admin_TC03() throws InterruptedException, IOException {
	HashMap<String, String> testData = ExcelFileReader.readDatafromExcelSheet("Admin", "Admin_TC02");
		
		Login_Page loginPage = new Login_Page(driver);
		Admin_Module_Page adminPage = new Admin_Module_Page(driver);	
		//loginPage.getUserName("Admin");
		loginPage.getUserName().sendKeys(testData.get("loginUser"));
		loginPage.getpassWord().sendKeys(testData.get("loginPassWord"));
		loginPage.getloginBtn().click();
		driver.findElement(By.xpath("tes"));
		adminPage.getadminBtn().click();
		adminPage.getUserName().sendKeys(testData.get("userName"));
	}
	

	
	

}
