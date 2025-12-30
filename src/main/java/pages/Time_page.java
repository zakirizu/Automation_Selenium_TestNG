package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Time_page {
	
	WebDriver driver;
	
	public Time_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//Xpath for Time Button	
	@FindBy(xpath="//span[text()='Time']")
	private WebElement timeBtn;	
	public WebElement getTimeBtn() {
		return timeBtn;
	}
	

	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement empNameTextBox;	
	public WebElement getempNameTextBox() {
		return empNameTextBox;
	}
	
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement viewBtn;
	public WebElement getviewBtn() {
		return viewBtn;
	}
	
	
	@FindBy(xpath="//span[text()='Invalid']")
	private WebElement invalidMsg;
	public WebElement getinvalidMsg() {
		return invalidMsg;
	}
	
	
	@FindBy(xpath="//span[text()='Invalid']")
	private WebElement frameOne;
	public WebElement getFrameOne() {
		return frameOne;
	}

}
