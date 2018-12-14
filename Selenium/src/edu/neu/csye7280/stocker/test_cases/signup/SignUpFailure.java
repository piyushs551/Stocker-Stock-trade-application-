package edu.neu.csye7280.stocker.test_cases.signup;

import org.openqa.selenium.WebDriver;

import edu.neu.csye7280.stocker.test_cases.TestCase;

public class SignUpFailure extends TestCase {

	public SignUpFailure(WebDriver driver) {
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

		successLatch = successLatch && findAndSet("//*[@id=\"u40_input\"]", "");

		successLatch = successLatch && findAndSet("//*[@id=\"u42_input\"]", "");

		successLatch = successLatch && findAndSet("//*[@id=\"u44_input\"]", "");
		Thread.sleep(2000);

		successLatch = successLatch && findAndSet("//*[@id=\"u46_input\"]", "21232131");
		Thread.sleep(2000);

		successLatch = successLatch && clickXpath("u38");

		successLatch = successLatch && checkPageTitle("Landing Page");

		return successLatch;
	}
}
