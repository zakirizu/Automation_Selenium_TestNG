package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Login_Page {

	private WebDriver driver;
	
	//Syntax to Create Constructor for the Page Class
	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Synta to Add the WebElement
	@FindBy(xpath="//input[@name='username']")
	private WebElement userName;
	public WebElement getUserName() {
		return userName;
	}
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passWord;
	public WebElement getpassWord() {
		return passWord;
	}
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginBtn;
	public WebElement getloginBtn() {
		return loginBtn;
	}
	
	
}
