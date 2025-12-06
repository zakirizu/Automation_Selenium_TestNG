package baseTest;
import org.testng.annotations.BeforeMethod;
import utils.PropertyFileReader;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BaseTest {
	
	public WebDriver driver;
	String browser = PropertyFileReader.getProperty("browser");
	String url = PropertyFileReader.getProperty("qa_url");
	
	@BeforeMethod
	public void setUp() {
		if(browser.equalsIgnoreCase("chrome")) {
			// Initialize ChromeDriver
			System.out.println("BaseTest: Initializing ChromeDriver.");
			driver = new ChromeDriver();
		} 
		else if(browser.equalsIgnoreCase("firefox")) {
			// Initialize FirefoxDriver
			System.out.println("BaseTest: Initializing FirefoxDriver.");
			driver = new FirefoxDriver();
		} 
		
		else if(browser.equalsIgnoreCase("edge")) {
			// Initialize FirefoxDriver
			System.out.println("BaseTest: Initializing FirefoxDriver.");
			driver = new EdgeDriver();
		} 
		
		else {
			System.out.println("BaseTest: Unsupported browser specified in properties file.");
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		System.out.println("BaseTest: Setting up the test environment.");
	}
	
	
	@AfterMethod
	public void tearDown() {
		System.out.println("BaseTest: Tearing down the test environment.");
		driver.quit();
	}
	

}
