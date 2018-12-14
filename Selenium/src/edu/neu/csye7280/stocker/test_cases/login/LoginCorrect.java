package edu.neu.csye7280.stocker.test_cases.login;

import org.openqa.selenium.WebDriver;
import edu.neu.csye7280.stocker.test_cases.TestCase;

public class LoginCorrect extends TestCase{

	public LoginCorrect(WebDriver driver) {
		super(driver);
	}

	@Override
	public boolean runTestCase() throws InterruptedException {
		System.out.println("RUNNING LOGIN TEST CASE");
		// success or failure of test cases
		// each test case will be ANDed to this... if one fails the test will come back negative
		boolean successLatch = true;
		
		// get the home page
		openPage("file:///C:\\Users\\k1u2t\\OneDrive\\Documents\\Axure\\HTML\\Stockers_Mobile_App\\landing_page.html"); //TODO: actual home page path
				

		successLatch = successLatch && clickXpath("loginButton");

		
		successLatch = successLatch && checkPageTitle("Login Email");

		Thread.sleep(2000);

		successLatch = successLatch && findAndSet("//*[@id=\"u23_input\"]", "niravra@gmail.com");
		Thread.sleep(2000);

		successLatch = successLatch && clickXpath("u24");

		successLatch = successLatch && checkPageTitle("Login Password");
		Thread.sleep(2000);

		successLatch = successLatch && findAndSet("//*[@id=\"u30_input\"]", "1234");
		Thread.sleep(2000);

		successLatch = successLatch && clickXpath("u31");

		successLatch = successLatch && checkPageTitle("Home Page");		
	

		return successLatch;
	}
	
	
}
