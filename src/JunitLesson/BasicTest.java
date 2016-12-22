package JunitLesson;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.*;
import org.openqa.selenium.support.ui.Select;
import org.junit.rules.TestName;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import WDriver.ByT;
import WDriver.ChromeWebDriver;
import WDriver.GenericWebDriver;
import WDriver.LoggerTry;
import WDriver.FirefoxWebDriver;
import WDriver.Pages;
import WDriver.utils;
import WDriver.utils.autoUtils;

public class BasicTest {
public GenericWebDriver webdriver;
public String methodN;
public static Logger log = LogManager.getLogger();




//asserting method
public void assertString(String expected, String actual){
	if(expected.equals(actual)==false){
		System.out.println(expected + "  <--- does not match --->  " + actual);
		errorFound = true;
	}
	
}






	boolean errorFound = false;
	public Pages pages;
	

    @Rule
    public TestWatcher testWatcher = new TestWatcher(){
    	
    	@Override
    	public void starting(Description description) {
    		 methodN = description.getMethodName();
    	      System.out.println("Method Running: " + methodN);
    	   }
    };
    
    
    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    Date dateobj = new Date();
    String curDate = (df.format(dateobj));
		
		@Before
		public void Start() throws Exception{
			
			webdriver = new ChromeWebDriver();
			webdriver.init("http://10.0.0.12:4444/wd/hub");
			// tring Testname = name.getMethodName();
			
			pages = new Pages(webdriver);
			 
    }
		
		
		@Test
		public void tryX(){
			assertString("s", "s");
			log.info("asdxxx");
			log.error("errorduh");
		}
@Test
public void testOpenBrowser() throws Exception{
	webdriver.openUrl("http://www.reddit.com");
	webdriver.getElement(ByT.ID, "header-img");
	
}
	
	
	@Test
	public void LoginTest() throws Exception{
	webdriver.openUrl(autoUtils.theInternetUrl);
		pages.internetPO.SendCred(autoUtils.userCred,autoUtils.passCred);
		pages.internetPO.ClickLogin();
		Thread.sleep(5000);
		
		
	}

	@Test public void SVCSanity() throws Exception{
		webdriver.openUrl(autoUtils.SVCLandingP);
		
	}
	
	// @Ignore to ignore a test.
	@Test
	public void KnisaLeatar() throws InterruptedException{
		System.out.println("this is a test");
		 Thread.sleep(5000);
		assertString("1111111","1111111");
	
}
	
	@Test
	public void LeadIns() throws Exception{
		webdriver.openUrl(autoUtils.SVCLandingP);
		pages.internetPO.getEmailField().sendKeys(autoUtils.SVEmailtest);
		pages.internetPO.getPhoneField().sendKeys(autoUtils.SVPhonetest);
		pages.internetPO.getUserField().sendKeys(autoUtils.SVUserNtest);
		pages.internetPO.getSendBtn().click();
		Thread.sleep(10000);
		webdriver.getElement(ByT.CLASS, autoUtils.SVLeadRecCS).isDisplayed();
	}
	
	
	
	
	@Test
	public void setup2() throws InterruptedException{
		System.out.println("this is a test");
		Thread.sleep(5000);

	
}
	@Test
	public void BugReporting() throws Exception{
		webdriver.openUrl("http://localhost:8080");
		webdriver.getElement(ByT.ID, "bitnami-link").click();
		webdriver.getElement(ByT.CLASS, "login").click();
		Thread.sleep(2000);
		webdriver.getElement(ByT.ID, "username").sendKeys("gals");
		webdriver.getElement(ByT.ID, "password").sendKeys("r123123");
		webdriver.getElement(ByT.NAME, "login").click();
		webdriver.getElement(ByT.CLASS, "projects").click();
		webdriver.getElement(ByT.XPATH, "//*[@id='projects-index']/ul/li/div/a").click();
		webdriver.getElement(ByT.CLASS, "issues").click();
		webdriver.getElement(ByT.XPATH, "//*[@id='content']/div[1]/a").click();
		String subjName = "Automated BR subject" + curDate;
		 final String subjNameDate = subjName;
		
		webdriver.getElement(ByT.ID, "issue_subject").sendKeys(subjName);
		webdriver.getElement(ByT.ID, "issue_description").sendKeys("Automated BR description");
		// select priority
		new Select(webdriver.getElement(ByT.ID, "issue_priority_id")).selectByVisibleText("Immediate");
		// select assignee
		new Select(webdriver.getElement(ByT.ID, "issue_assigned_to_id")).selectByVisibleText("Gal Admin");
		// select severity
		new Select(webdriver.getElement(ByT.ID, "issue_custom_field_values_1")).selectByVisibleText("Very High / Showstopper");
		// stam
		Thread.sleep(2000);
		new Select(webdriver.getElement(ByT.ID, "issue_custom_field_values_3")).selectByVisibleText("fliklak critical sapir");
		Thread.sleep(2000);
		webdriver.getElement(ByT.NAME, "commit").click();
		//asserting subject
		assertString(subjNameDate, webdriver.getElement(ByT.XPATH, "//*[@id='content']/div[3]/div[2]/div/h3").getText());
	
		Thread.sleep(5000);
		
		
	}
	@Test
	public void setup3() throws InterruptedException{
		System.out.println("this is a test");
		Thread.sleep(5000);

}
	@Test
	public void setup4() throws InterruptedException{
		System.out.println("this is a test");
		Thread.sleep(5000);

}
	@After
	public void tearDown(){
		
		webdriver.quit();
		
	if(errorFound){
		
		System.out.println(methodN+" has failed");
	
	     Assert.fail();
	}
	
	else
	{
		
		System.out.println("Test " +methodN+" Success");
		System.out.println("The test finished at "+ curDate);
	}
	
	}


	public boolean doIt() {
		// TODO Auto-generated method stub
		return false;
	}
}

