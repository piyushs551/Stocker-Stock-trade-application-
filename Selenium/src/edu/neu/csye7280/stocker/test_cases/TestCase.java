package edu.neu.csye7280.stocker.test_cases;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

abstract public class TestCase {
	// the web driver that will be used here
		private final WebDriver driver;
		
		// Constructor - sets driver
		public TestCase(WebDriver driver) {
			this.driver = driver;
		}
		
		/**
		 * runs the test case in question
		 * @return
		 * @throws InterruptedException 
		 */
		public abstract boolean runTestCase() throws InterruptedException;
		
		protected boolean openPage(String pageUrl) {
			driver.get(pageUrl);
			return true;
		}
		/**
		 * Helper function... find and set a string value
		 * @param elementString
		 * @param setTo
		 * @return
		 */
		protected boolean findAndSet(String elementString, String setTo) {
			WebElement foundElement = driver.findElement(By.xpath(elementString));
			if (foundElement == null)
				return false;
			foundElement.sendKeys(setTo);
			return true;
		}
		
		/**
		 * Helper Function... Set the value of a dropdown box
		 * @param elementString
		 * @param setValue
		 * @return
		 */
		protected boolean setDropdown(String elementString, String setValue) {
			// Get the Birthday (uses dropdowns so have to make 'select'
			WebElement foundElement = driver.findElement(By.xpath(elementString));
			if (foundElement == null)
				return false;
			Select elementSelect = new Select(foundElement);
			elementSelect.selectByValue("1");
			return true;
		}
		
		/**
		 * Helper Function... clicks on an xpath
		 * @param xPath
		 * @return
		 */
		protected boolean clickXpath(String xPath) {
			WebElement foundElement = driver.findElement(By.id(xPath));
			if (foundElement == null)
				return false;
			foundElement.click();
			return true;
		}
		
		/**
		 * Check that the title of the page is as expected
		 * @param checkText
		 * @return
		 */
		protected boolean checkPageTitle(String checkText) {
			return driver.getTitle().equals(checkText);
		}
		
		
		
		/**
		 * navigate back
		 * @return
		 */
		protected boolean goBack() {
			driver.navigate().back();
			return true;
		}
		
		/**
		 * navigate forward
		 * @return
		 */
		protected boolean goForward() {
			driver.navigate().forward();;
			return true;
		}
		
}
