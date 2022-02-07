package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class EhealthDriver {

	static WebDriver driver;
	private EhealthDriver() {
		try {
			System.setProperty("webdriver.gecko.driver", "D:\\e_health\\java_setup\\browser_driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			//System.setProperty("WebDriverManager.chromedriver().setup()", "D:\\e_health\\java_setup\\browser_driver\\chromedriver.exe");
			//driver = new ChromeDriver();
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static WebDriver getDriverInstance() {
		if (driver == null) {
			new EhealthDriver();
		}
		return driver;
	}
}
