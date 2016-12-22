package WDriver;

import org.openqa.selenium.WebElement;

public class HomePage {

	private static final String ALL_PRODUCTS = "//li[@class='all-products']";
	GenericWebDriver webDriver;

	public HomePage(GenericWebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public void open() throws Exception {
		webDriver.openUrl(utils.autoUtils.sutUrl);
	}

	public WebElement getAllProductsElement() {
		return webDriver.getElement(ByT.XPATH, ALL_PRODUCTS);
	}
	
	public void clickOnGetAllProducts(){
		getAllProductsElement().click();
	}

}
