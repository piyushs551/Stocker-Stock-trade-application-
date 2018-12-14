package edu.neu.csye7280.stocker.test_cases.login;

import org.openqa.selenium.WebDriver;

import edu.neu.csye7280.stocker.test_cases.TestCase;

public class LoginCorrectUsername extends TestCase {

	
	
	
	public LoginCorrectUsername(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean runTestCase() throws InterruptedException {
		System.out.println("RUNNING LOGIN TEST CASE WITH INCORRECT PASSWORD");
		// success or failure of test cases
		// each test case will be ANDed to this... if one fails the test will come back negative
		boolean successLatch = true;
		
		// get the home page
		openPage("file:///C:\\Users\\k1u2t\\OneDrive\\Documents\\Axure\\HTML\\FinalProjectApp (1)_recovered\\landing_page.html"); //TODO: actual home page path
				

		successLatch = successLatch && clickXpath("loginButton");

		
		successLatch = successLatch && checkPageTitle("Login Email");

		
		successLatch = successLatch && findAndSet("//*[@id=\"u23_input\"]", "niravra@gmail.com");
		Thread.sleep(2000);

		successLatch = successLatch && clickXpath("u24");

		successLatch = successLatch && checkPageTitle("Login Password");
		Thread.sleep(2000);

		successLatch = successLatch && findAndSet("//*[@id=\"u30_input\"]", "ADSHVASHJSVAD");
		Thread.sleep(2000);

		successLatch = successLatch && clickXpath("u31");
		Thread.sleep(2000);

		successLatch = successLatch && checkPageTitle("Home Page");		

		return successLatch;
	}

}
