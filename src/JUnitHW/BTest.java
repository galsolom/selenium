package JUnitHW;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.*;
import org.junit.rules.TestName;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

//Create a base test class. 
//The base test class should hold a user object with first name, last name, user id and address, phone
//In the setup, new user object is created with random data
// Create these tests:
//Check if first name is not null.
//Check if last name length is bigger then  4 chars
//Check that phone number contains area code
public class BTest {
	  @Rule
	  public	TestName name = new TestName();
	      @Rule
	      public TestWatcher testWatcher = new TestWatcher(){
	      	@Override
	      	protected void starting(Description description) {
	      	      System.out.println("Starting test: " + description.getMethodName());
	      	   }
	      };

	public  User User1;
	@Before
	public  void setUp(){
	User1 = new User(null, null, 0, null, " ");

	User1.setFname(RandomStringUtils.randomAlphabetic(5));
	User1.setLname(RandomStringUtils.randomAlphabetic(5));
	User1.setUserID(Integer.valueOf(RandomStringUtils.randomNumeric(7)));
	User1.setPhone(RandomStringUtils.randomNumeric(7));
	User1.setAddress(RandomStringUtils.randomAlphabetic(8));
	
	}
	@Test
	public void FnameCheck(){
			
	if(User1.getFname().isEmpty()){
	}
	else{
		
		System.out.println("First Name is not Null");
	}
	}
	
	
	
	@Test
	public void LnameCheck(){
	if(User1.getLname().length()>4){
		System.out.println("Last name is bigger than 4 letters");
	}
	else{
		System.out.println("4 Or smaller");
		
	}
	
	}
	@Test
	public void areaCheck(){
		if(User1.getPhone().startsWith("0")){
			System.out.println("Contains area code");
	}
		else{
			System.out.println("Code not starting with a 0");
		}
}
	
	@Test
	public void maozT(){
		String x=User1.getPhone().substring(0, 1);
		if((x=="03")||(x=="04")){
			
		}
	}
	@After
	public void tearDown(){
		
	}
}

