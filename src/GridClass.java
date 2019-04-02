import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridClass {

	static RemoteWebDriver driver;
	
	public static void main(String[] args) throws MalformedURLException {
		
		GridClass grid=new GridClass();
		grid.gridSample();
	}
	
		public void gridSample() throws MalformedURLException {
				
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WIN10);
			driver=new RemoteWebDriver(new URL("http://192.168.24.36:4444/wd/hub"),capabilities);
			driver.get("https://dzone.com/articles/selenium-grid-tutorial-setup-and-example-of-cross");
			
			/* Hub configuration 
			 * java -jar selenium-server-standalone-3.141.59.jar -port 4444 -role hub
			 *  
			 *  Node configuration:Remote machine 
			 *  Goto the Drive where selenium server resides and execute below command
			 *  java -Dwebdriver.gecko.driver="C:\Selenium\chromedriver_win32\chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role node 
			 *  -hub  http://192.168.24.36:4444/grid/register -port 5567
			 *  
			 *  
			 *  */
			
		}



	

}
