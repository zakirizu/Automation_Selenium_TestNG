package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class CommonMethod {
	private WebDriver driver;	
	//Syntax to Create Constructor for the Page Class
	public CommonMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public static void waitForSeconds(int seconds) {
	    try {
	        Thread.sleep(seconds * 1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	}
	
	
	public void getselectByVisisbleText(WebElement element, String text) {
	    Select sc = new Select(element);
	    sc.selectByVisibleText(text);
	}
	
	
	public void getselectByIndex(WebElement element, int id) {
	    Select sc = new Select(element);
	    sc.selectByIndex(id);
	}
	
	
	public void getselectByValue(WebElement element, String value) {
	    Select sc = new Select(element);
	    sc.selectByValue(value);
	}
	
	public void switchToFrameByIndex(int index) {
	    driver.switchTo().frame(index);
	}
	
	
	public void switchToDefaultContent() {
	    driver.switchTo().defaultContent();
	}
	
	public void switchToFrameByNameOrId(String nameOrId) {
	    driver.switchTo().frame(nameOrId);
	}
	
	public void switchToFrameByWebElement(WebElement frameElement) {
	    driver.switchTo().frame(frameElement);
	}
	
	public void MoveToElement(WebElement element) {
	     Actions actions = new Actions(driver);
	     actions.moveToElement(element).perform();
	
}
}
