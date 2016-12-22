package WDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;






   /* Get actual class name to be printed on */
  	public class LoggerTry {
		
  		//static final Logger log = LogManager.getLogger("WDriver.Google");
			static final Logger log = LogManager.getLogger(); 
			public static class Google {
			    public static void main(String[] args) {
			   
			   // 	System.setProperty("log4j2.xml","/Users/svcollege/Documents/workspace/javaCourse/src/WDriver");
					 
				   
				      log.error("asd1"); 
			    	log.debug("asd");
			        
		
		       
			    }
			}
		}