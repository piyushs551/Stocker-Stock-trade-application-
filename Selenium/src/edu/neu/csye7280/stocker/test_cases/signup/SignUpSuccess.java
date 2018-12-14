package edu.neu.csye7280.stocker.test_cases.signup;

import org.openqa.selenium.WebDriver;

import edu.neu.csye7280.stocker.test_cases.TestCase;

public class SignUpSuccess extends TestCase {

	public SignUpSuccess(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean runTestCase() throws InterruptedException {
		System.out.println("RUNNING SIGNUP TEST CASE");
		// success or failure of test cases
		// each test case will be ANDed to this... if one fails the test will come back
		// negative
		boolean successLatch = true;

		// get the home page
		openPage("file:///C:\\Users\\k1u2t\\OneDrive\\Documents\\Axure\\HTML\\Stockers_Mobile_App\\signup_page.html"); // TODO:
																														// actual
																														// home
																														// page
																														// path

		successLatch = successLatch && checkPageTitle("SignUp Page");

		successLatch = successLatch && findAndSet("//*[@id=\"u37_input\"]", "Kaustubh C");
		Thread.sleep(2000);

		successLatch = successLatch && findAndSet("//*[@id=\"u40_input\"]", "Kaustubh@gmail.com");
		Thread.sleep(2000);

		successLatch = successLatch && findAndSet("//*[@id=\"u42_input\"]", "1234");

		successLatch = successLatch && findAndSet("//*[@id=\"u44_input\"]", "1234");
		Thread.sleep(2000);

		successLatch = successLatch && findAndSet("//*[@id=\"u46_input\"]", "21232131");
		Thread.sleep(2000);

		successLatch = successLatch && clickXpath("u38");

		successLatch = successLatch && checkPageTitle("Landing Page");
		
successLatch = successLatch && clickXpath("loginButton");

		
		successLatch = successLatch && checkPageTitle("Login Email");

		
		successLatch = successLatch && findAndSet("//*[@id=\"u23_input\"]", "Kaustubh@gmail.com");
		Thread.sleep(2000);

		successLatch = successLatch && clickXpath("u24");

		successLatch = successLatch && checkPageTitle("Login Password");

		successLatch = successLatch && findAndSet("//*[@id=\"u30_input\"]", "1234");
		Thread.sleep(2000);

		successLatch = successLatch && clickXpath("u31");

		successLatch = successLatch && checkPageTitle("Home Page");		

		return successLatch;
	}
}
