package WDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import WDriver.utils.autoUtils;

public class TheInternetPO extends BasicPO {
GenericWebDriver webdriver;
public TheInternetPO(GenericWebDriver webDriver){
	this.webdriver = webDriver;

}


public WebElement getUsername(){
	WebElement userElement;
    userElement= webdriver.getElement(ByT.ID, autoUtils.userID);
	
	return userElement;
}




public WebElement getPass(){
	WebElement userPass; 
userPass = webdriver.getElement(ByT.ID, autoUtils.passID);
	
	return userPass;
}
public void SendCred(String Uname, String Upass){
	getUsername().sendKeys(Uname);
	getPass().sendKeys(Upass);
		
	}





public WebElement getLoginBtn(){
	WebElement Loginbtn;
	Loginbtn = webdriver.getElement(ByT.XPATH,autoUtils.LoginBtnXP);
	return Loginbtn;
}


public void ClickLogin(){
	getLoginBtn().click();
}

//Svcollege testing ()'s

public WebElement getUserField(){
	WebElement UserField;
	UserField = webdriver.getElement(ByT.NAME, autoUtils.SVNameFName);
	return UserField;
}

public WebElement getPhoneField(){
	WebElement PhoneField;
	PhoneField = webdriver.getElement(ByT.NAME, autoUtils.SVTelFName);
	return PhoneField;
}

public WebElement getEmailField(){
	WebElement EmailField;
	EmailField = webdriver.getElement(ByT.NAME, autoUtils.SVEmailFName);
	return EmailField;
}
public WebElement getSendBtn(){
	WebElement SendBtn;
	SendBtn = webdriver.getElement(ByT.XPATH, autoUtils.SVSendBtnXP);
	return SendBtn;
}


@Override
public void init(String remoteUrl) throws Exception {

	
}
	
}
