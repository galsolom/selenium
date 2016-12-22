package WDriver;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public  class ChromeWebDriver extends GenericWebDriver {

	@Override
	public void init(String remoteUrl) throws Exception {
		DesiredCapabilities Capabilities = DesiredCapabilities.chrome();
		
		webdriver = new RemoteWebDriver(new URL(remoteUrl), Capabilities);
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\path\\to\\chrome\\canary");
		
		
		
	}
	
	

}
