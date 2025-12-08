package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Admin_Module_Page {
	
	private WebDriver driver;
	
	public Admin_Module_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//Xpath for Time Button	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement adminBtn;	
	public WebElement getadminBtn() {
		return adminBtn;
	}
	
//Xpath for Add Button	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addBtn;	
	public WebElement getaddBtn() {
		return addBtn;
	}
	
	
			
			//Xpath for Add Button	
				@FindBy(xpath="(//input[@class=\"oxd-input oxd-input--active\"])[2]")
				private WebElement userName;	
				public WebElement getUserName() {
					return userName ;
				}	
	
	//Xpath for Add Button	
		@FindBy(xpath="//input[@placeholder='Type for hints...']")
		private WebElement empName;	
		public WebElement getempName() {
			return empName;
		}
	

}
