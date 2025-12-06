package testCases;
import baseTest.BaseTest;
import pages.Admin_Module_Page;
import pages.Login_Page;

import org.testng.annotations.Test;

public class Admin_Module_TestCases extends BaseTest {
	
	@Test
	public void Admin_TC01() throws InterruptedException {
		Login_Page loginPage = new Login_Page(driver);
		Admin_Module_Page adminPage = new Admin_Module_Page(driver);		
		loginPage.getUserName().sendKeys("admin");
		loginPage.getpassWord().sendKeys("admin123");
		Thread.sleep(3000);
		loginPage.getloginBtn().click();
	}
	
	
	
	@Test
	public void Admin_TC02() throws InterruptedException {
		Login_Page loginPage = new Login_Page(driver);
		Admin_Module_Page adminPage = new Admin_Module_Page(driver);		
		loginPage.getUserName().sendKeys("admin");
		loginPage.getpassWord().sendKeys("admin123");
		Thread.sleep(3000);
		loginPage.getloginBtn().click();
	}
	
	

	
	

}
