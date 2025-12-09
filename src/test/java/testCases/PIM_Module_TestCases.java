package testCases;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import baseTest.BaseTest;

public class PIM_Module_TestCases extends BaseTest {
	@Test
	public void PIM_TestCase01() {
		System.out.println("PIM Test Case 01 executed");
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
	}
	

}
