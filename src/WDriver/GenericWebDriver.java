package WDriver;
/*
 findElement
findElements by xpath gets array with the elements(compare to list.size to excpected.
switch tab (index)
getcurrentUrl
openUrl
quit
Refresh
DeleteCoockies
addcoockie
scroll
click
sendTexts
dragAndDrop

 */
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class GenericWebDriver implements IWebDriver {

	

	public RemoteWebDriver webdriver;
Actions action;
	public void openUrl(String url) throws Exception {
		webdriver.get(url);
	}

	public WebElement getElement(ByT ByTypes, String value) {

		WebElement element = null;

		WebDriverWait wait = new WebDriverWait(webdriver, 10, 1000);

		
		
		try {
			switch (ByTypes) {
			case ID:
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(value)));
				element = webdriver.findElementById(value);
				break;

			case XPATH:
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));
				element = webdriver.findElementByXPath(value);
				break;

			case NAME:
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(value)));
				element = webdriver.findElementByName(value);
				break;

			case CLASS:
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(value)));
				element = webdriver.findElementByClassName(value);
				break;

			case CSS:
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(value)));
				element = webdriver.findElementByCssSelector(value);
				break;

			default:
				break;
			}
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return element;
		
		

	}
	
	public void quit(){
		webdriver.quit();
	}

}
