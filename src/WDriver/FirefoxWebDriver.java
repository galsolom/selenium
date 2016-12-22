package WDriver;

import java.net.URL;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxWebDriver extends GenericWebDriver {

	@Override
	public void init(String remoteUrl) throws Exception {
DesiredCapabilities Capabilities = DesiredCapabilities.firefox();
		
		webdriver = new RemoteWebDriver(new URL(remoteUrl), Capabilities);
		
	}

}
