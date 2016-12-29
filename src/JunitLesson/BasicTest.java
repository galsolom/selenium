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
import WDriver.utils.rm;
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
			assertString("s", "ss");
			log.trace("trace log");
			log.info("info log");
			log.error("error log");
			log.fatal("fatal log");
			log.warn("warn log");
			log.debug("debug log");
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
	public void setup2() throws InterruptedException{
		System.out.println("this is a test");
		Thread.sleep(5000);

	
}
	
	@Test
	public void BugReporting() throws Exception{
		webdriver.openUrl(rm.rmUrl);
		log.info("Bug Report Session Started" + curDate);
		webdriver.getElement(ByT.ID, rm.rmAccessBtnID).click();
		webdriver.getElement(ByT.CLASS, rm.rmPageLgnBtnCls ).click();
		Thread.sleep(2000);
		webdriver.getElement(ByT.ID, rm.rmUserID).sendKeys(rm.rmUserValue);
		webdriver.getElement(ByT.ID, rm.rmPassID).sendKeys(rm.rmPasswordValue);
		webdriver.getElement(ByT.NAME, rm.rmUseLgnBtnName).click();
		webdriver.getElement(ByT.CLASS, rm.rmProjectsBtnCls).click();
		webdriver.getElement(ByT.XPATH, rm.rmFirstProjBtnXP).click();
		webdriver.getElement(ByT.CLASS, rm.rmIssuesBtnCls).click();
		webdriver.getElement(ByT.XPATH, rm.rmNewIssueBtnXP).click();
		//Generating Issue Name + Current Time & Date
		String subjName = rm.rmSubjectContent + curDate;
		// Final string to validate against later.
		 final String subjNameDate = subjName;
		
		webdriver.getElement(ByT.ID, rm.rmSubjectFieldID).sendKeys(subjName);
		webdriver.getElement(ByT.ID, rm.rmDescFieldID).sendKeys(rm.rmDescValue);
		// select priority
		new Select(webdriver.getElement(ByT.ID, rm.rmIssuePriorityLiID)).selectByVisibleText(rm.rmIssuePriorityValue);
		// select assignee
		new Select(webdriver.getElement(ByT.ID, rm.rmIssueAssigneeID)).selectByVisibleText(rm.rmIssueAsigneeValue);
		// select severity
		new Select(webdriver.getElement(ByT.ID, rm.rmSeverityID)).selectByVisibleText(rm.rmSeverityValue);
		// stam
		Thread.sleep(2000);
		new Select(webdriver.getElement(ByT.ID, rm.rmStamFieldID)).selectByVisibleText(rm.rmStamValue);
		Thread.sleep(2000);
		webdriver.getElement(ByT.NAME, rm.rmCreateIssueBtnName).click();
		//asserting subject name with prior subject name entrance
		assertString(subjNameDate, webdriver.getElement(ByT.XPATH, rm.rmFirstIssueLiXP).getText());
	
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

