package edu.neu.csye7280.stocker.test_cases.nav;

import org.openqa.selenium.WebDriver;

import edu.neu.csye7280.stocker.test_cases.TestCase;

public class LinkStockDetail extends TestCase {

	public LinkStockDetail(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean runTestCase() throws InterruptedException {
		System.out.println("RUNNING STOCK DETAIL NAV TEST CASE");
		// success or failure of test cases
		// each test case will be ANDed to this... if one fails the test will come back
		// negative
		boolean successLatch = true;

		// get the home page
		openPage(
				"file:///C:\\Users\\k1u2t\\OneDrive\\Documents\\Axure\\HTML\\Stockers_Mobile_App\\home_page.html"); // TODO:
																																// actual
																															// path

		successLatch = successLatch && clickXpath("u129_text");
		Thread.sleep(2000);

		successLatch = successLatch && checkPageTitle("Stock Detail");

		successLatch = successLatch && clickXpath("u416_img");
		Thread.sleep(2000);
 
		successLatch = successLatch && checkPageTitle("Home Page");

		return successLatch;
	}
}
