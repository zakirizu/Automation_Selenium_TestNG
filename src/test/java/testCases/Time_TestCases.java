package testCases;
import baseTest.BaseTest;
import pages.Login_Page;
import pages.Time_page;

import org.testng.annotations.Test;

public class Time_TestCases extends BaseTest {

	@Test
	public void TestCaseToValidateErrorMessageForInvalidEmployee() {
		Login_Page 	login = new Login_Page(driver);
		Time_page 	time = new Time_page(driver);
		login.getUserName().sendKeys("Admin");
		login.getpassWord().sendKeys("admin123");
		login.getloginBtn().click();
		time.getTimeBtn().click();
		time.getempNameTextBox().sendKeys("zakir");
		time.getviewBtn().click();
		if(time.getinvalidMsg().isDisplayed())
		{System.out.println("TEST CASE PASS");}
		else
		{System.out.println("TEST CASE FAIL");}
	}
	
	
	@Test
	public void withValidName() {
		Login_Page 	login = new Login_Page(driver);
		Time_page 	time = new Time_page(driver);
		
		login.getpassWord().sendKeys("Admin");
		login.getpassWord().sendKeys("admin123");
		login.getloginBtn().click();
		
		
	}
	
}
