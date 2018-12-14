package edu.neu.csye7280.stocker;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import edu.neu.csye7280.stocker.test_cases.TestCase;
import edu.neu.csye7280.stocker.test_cases.login.LoginCorrect;
import edu.neu.csye7280.stocker.test_cases.login.LoginCorrectUsername;
import edu.neu.csye7280.stocker.test_cases.login.LoginIncorrectUsername;
import edu.neu.csye7280.stocker.test_cases.nav.LinkStockDetail;
import edu.neu.csye7280.stocker.test_cases.nav.SearchStockTest;
import edu.neu.csye7280.stocker.test_cases.signup.SignUpFailure;
import edu.neu.csye7280.stocker.test_cases.signup.SignUpSuccess;

public class SeleniumTester {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Hello (selenium) World!");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\k1u2t\\Desktop\\User Experience\\Selenium\\Exe folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// import the gecko driver for firefox
		// System.setProperty("webdriver.gecko.driver","C:\\Users\\k1u2t\\geckodriver.exe");
		// alternate firefox driver - marionette
		// System.setProperty("webdriver.firefox.marionette",
		// "/data/CSYE7280/geckodriver.exe");
		// Turns out the Gecko driver is the one for me!
		// Use the imported drivers to create firefox driver
		// WebDriver firefoxDriver = new FirefoxDriver();

		// Create arrayList of all of the test cases
		ArrayList<TestCase> testArray = new ArrayList<TestCase>();
		// Add home page test cases
		testArray.add(new LoginCorrect(driver));
//		// Add login page test cases
		testArray.add(new LoginCorrectUsername(driver));
		testArray.add(new LoginIncorrectUsername(driver));
//		// Add signup page test cases
		testArray.add(new SignUpSuccess(driver));
		testArray.add(new SignUpFailure(driver));
//		//Add link between page test cases
		testArray.add(new LinkStockDetail(driver));
		testArray.add(new SearchStockTest(driver));




		// run all of the test cases
		for (TestCase test : testArray) {
			// check for success/failure of test case
			if (test.runTestCase()) {
				System.out.println(test.getClass().getName() + " - SUCCESS");
			} else {
				System.out.println(test.getClass().getName() + " - FAILED ... EXITING");
			}
			// sleep for 5 seconds before next test
			Thread.sleep(2000);
		}
		return;
	}
}
