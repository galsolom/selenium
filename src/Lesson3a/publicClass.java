package Lesson3a;

import org.apache.commons.lang3.RandomStringUtils;

public class publicClass {
//   Integer.parseInt(RandomStringUtils.randomNumeric(2));
	private static final String URL = "http://www.google.co.il";

	public String publicString;

	protected String protString;
// cannot be changed, its a final.
	private final static String privString="aaaa";

	String defaultString;

	public String getPrivString() {
		return this.privString;
	}
//show that to maoz
	//public void setPrivString(String str) {
	//	this.privString = str;
//	}
	
	protected void protVoidSample(){
		String url=URL;
		
	
	}
	
	

}
