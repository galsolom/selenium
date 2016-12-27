package WDriver;

import WDriver.utils.rm;

public class utils {

    public static class autoUtils {

        public static final String theInternetUrl = "http://the-internet.herokuapp.com/login";
        public static String sutUrl = "http://www.ikea.co.il";
        public static String passID = "password";
        public static String passCred = "SuperSecretPassword!";
        public static String userID = "username";
        public static String userCred = "tomsmith";
        public static String LoginBtnXP = "//button[@class='radius']";
        public static String OKmsgCS = "div#flash.flash.success";
        
        //www.svcollege.co.il test project
        
        public static String SVCLandingP = "http://www.svcollege.co.il";
        public static String SVUserNtest = "טסט אוטומטי";
        public static String SVEmailtest = "svciqa@gmail.com";
        public static String SVPhonetest = "0526384303";
        public static String SVNameFName = "form_name";
        public static String SVTelFName =  "form_tel";
        public static String SVEmailFName = "form_email";
        public static String SVSendBtnXP = "//*[@id='wpcf7-f5-o1']/form/div[2]/div/fieldset[4]/div/input";
        public static String SVLeadRecCS = "wpcf7-response-output wpcf7-display-none wpcf7-mail-sent-ok";
        

    }
    
    public static class rm{
    	
		public static String rmUrl = "http://localhost:8081";
    	public static String rmAccessBtnID = "bitnami-link";
    	public static String rmPageLgnBtnCls = "login";
    	public static String rmUserID = "username";
    	public static String rmUserValue = "gals";
    	public static String rmPassID = "password";
    	public static String rmPasswordValue = "r123123";
    	public static String rmUseLgnBtnName = "login";
    	public static String rmProjectsBtnCls = "projects";
    	public static String rmFirstProjBtnXP = "//*[@id='projects-index']/ul/li/div/a";
    	public static String rmIssuesBtnCls = "issues";
    	public static String rmNewIssueBtnXP = "//*[@id='content']/div[1]/a";
    	public static String rmSubjectFieldID ="issue_subject";
    	public static String rmSubjectContent = "Automated BugRerport Subj";
    	public static String rmDescFieldID = "issue_description";
    	public static String rmDescValue = "Automated BugReport Desc";
    	public static String rmIssuePriorityLiID = "issue_priority_id";
    	public static String rmIssuePriorityValue = "Immediate";
    	public static String rmIssueAssigneeID = "issue_assigned_to_id";
    	public static String rmIssueAsigneeValue = "Gal Admin";
    	public static String rmSeverityID = "issue_custom_field_values_1";
    	public static String rmSeverityValue = "Very High / Showstopper";
    	public static String rmStamFieldID = "issue_custom_field_values_3";
    	// change the value here on RM
    	public static String rmStamValue = "fliklak critical sapir";
    	public static String rmCreateIssueBtnName = "commit";
    	public static String rmFirstIssueLiXP = "//*[@id='content']/div[3]/div[2]/div/h3";
    
    	
    	
    }

}

