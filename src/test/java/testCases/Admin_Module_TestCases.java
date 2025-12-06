package testCases;
import baseTest.BaseTest;
import pages.Admin_Module_Page;
import pages.Login_Page;

import org.testng.annotations.Test;

public class Admin_Module_TestCases extends BaseTest {
	
	@Test
	public void verifyAdminSearchFunctionality() {
		Login_Page loginPage = new Login_Page(driver);
		Admin_Module_Page adminPage = new Admin_Module_Page(driver);		
		loginPage.getUserName().sendKeys("admin");
		loginPage.getpassWord().sendKeys("admin123");
		loginPage.getloginBtn().click();
	}
	
	
	

}
