package appium.tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import appium.pages.LoginPage;
import appium.utils.AppStart;
import appium.utils.Constants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class LoginTests {

	AppiumDriver<MobileElement> driver = null;

	String apiKey = AppStart.getAPiKey();

	@BeforeClass
	public void beforeClass() {
		try {
			driver = AppStart.startApp();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	@Test
	public void positiveLoginTest() {

		LoginPage loginFlow = new LoginPage(driver);
		loginFlow.login(apiKey);

		assertEquals(driver.findElementByXPath(Constants.HOME_NETWORKS_XPATH).getText(),
				Constants.HOME_AP_TEXT);
	}

	@Test
	public void emptyApiKeyLoginTest() {
		LoginPage loginFlow = new LoginPage(driver);
		loginFlow.login("");

		assertEquals(Constants.HOME_NOAP_TEXT, 
				driver.findElementByXPath(Constants.HOME_NONETWORKS_XPATH).getText());
	}

	@Test
	public void invlaidApiKeyLoginTest() {
		LoginPage loginFlow = new LoginPage(driver);
		loginFlow.login("qwpqwpq123qwp");

		assertEquals(Constants.HOME_NOAP_TEXT, 
				driver.findElementByXPath(Constants.HOME_NONETWORKS_XPATH).getText());
	}

	@AfterMethod
	public void tearDownAfterMethod() {
		driver.closeApp();
		driver.launchApp();
	}

	@AfterClass
	public void tearDownAfterClass() throws IOException {
		driver.closeApp();
		driver.quit();
	}
}
