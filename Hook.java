package or.ho;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	public static WebDriver driver;
	@Before
	public void beforeBG()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balaji Raina\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@After
	public void AfterScinario() {
		driver.quit();
	}
	

}
