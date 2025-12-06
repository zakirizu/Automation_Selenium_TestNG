package testCases;
import baseTest.BaseTest;
import pages.Login_Page;
import pages.Time_page;
import utils.ExcelFileReader;

import java.io.IOException;
import java.util.HashMap;
import org.testng.annotations.Test;

public class Time_TestCases extends BaseTest {
	
	HashMap<String,String> testData = null;

	@Test
	public void Time_TestCase01() throws IOException {
		testData = ExcelFileReader.readDatafromExcelSheet("TIME", "Time_TestCase01");
		Login_Page 	login = new Login_Page(driver);
		Time_page 	time = new Time_page(driver);
		login.getUserName().sendKeys(testData.get("userName"));
		login.getpassWord().sendKeys(testData.get("passWord"));
		login.getloginBtn().click();
		time.getTimeBtn().click();
		time.getempNameTextBox().sendKeys(testData.get("empName"));
		time.getviewBtn().click();
		if(time.getinvalidMsg().isDisplayed())
		{System.out.println("TEST CASE PASS");}
		else
		{System.out.println("TEST CASE FAIL");}
	}
	
	
	@Test
	public void Time_TestCase02() {
		Login_Page 	login = new Login_Page(driver);
		Time_page 	time = new Time_page(driver);
		
		login.getpassWord().sendKeys("Admin");
		login.getpassWord().sendKeys("admin123");
		login.getloginBtn().click();
		
		
	}
	
}
