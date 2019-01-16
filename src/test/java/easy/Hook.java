package easy;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	static WebDriver driver;
	@Before
	public static void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\My Pc\\eclipse-abi95\\Assignment\\driver\\chromedriver.exe");
	  driver=new ChromeDriver();

	}
	
	@After
	public static void afterMethod() {
		

	}
	

}
