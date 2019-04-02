import java.net.MalformedURLException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestA {

	public static RemoteWebDriver driver;
	public static String appURL="https://www.google.com/";
	
	@BeforeClass
	@Parameters("browser")
	public void setUp(String browser) throws MalformedURLException
	
	{
		
		System.out.println("*******************");
		driver = BrowserClass.getDriver(browser);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void testGrid_1()
	
	{
		System.out.println("chrome browser");
		driver.navigate().to(appURL);
		
	}
}
