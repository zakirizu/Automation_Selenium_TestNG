package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Admin_Module_Page {
	
	private WebDriver driver;
	
	public Admin_Module_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id="searchSystemUser_userName")
	WebElement usernameField;
	
	
	
	
	

}
