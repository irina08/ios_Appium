package appium.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import appium.pages.HomePage;
import appium.pages.LoginPage;
import appium.pages.WirelessAp1Page;
import appium.pages.ApPage;
import appium.pages.WirelessNewStadiumPage;
import appium.pages.WirelessOtherDeskPage;
import appium.utils.AppStart;
import appium.utils.Constants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MerakiDemoTests {

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
	public void HomeTest() {

		LoginPage loginFlow = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		
		loginFlow.login(apiKey);
		
		assertTrue(driver.findElementsByXPath(Constants.HOME_NETWORKS_XPATH_LIST).size() > 0,
				"Should have visible 4 networks");
		
		if(homePage.mrWirelessNewStadium.isDisplayed()) {
			assertEquals(homePage.labelMrWirelessNewStadium.getText(), Constants.WR_NEW_STADIUM_LABEL);
			assertEquals(homePage.apiMrWirelessNewStadium.getText(), Constants.WR_NEW_STADIUM_IP);
		}
	
		if(homePage.mrAp.isDisplayed()) {
			assertEquals(homePage.labelMrAp.getText(), Constants.AP_LABEL);
			assertEquals(homePage.apiMrAp.getText(), Constants.AP_IP);
		}
		
		if(homePage.mrWirelessAp1.isDisplayed()) {
			assertEquals(homePage.labelMrWirelessAp1.getText(), Constants.WR_AP1_LABEL);
			assertEquals(homePage.apiMrWirelessAp1.getText(), Constants.WR_AP1_IP);
		}
		
		if(homePage.mrWirelessOtherDesk.isDisplayed()) {
			assertEquals(homePage.labelMrWirelessOtherDesk.getText(), Constants.WR_OTHER_DESK_LABEL);
			assertEquals(homePage.apiMrWirelessOtherDesk.getText(), Constants.WR_OTHER_DESK_IP);
		}
	}
	
	@Test
	public void mrWirelessNewStadiumTest() {

		LoginPage loginFlow = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		WirelessNewStadiumPage newStadium = new WirelessNewStadiumPage(driver);
		
		loginFlow.login(apiKey);
		homePage.mrWirelessNewStadium.click();
		
		// Check all values on the "MR - Wireless New Stadium" page
		assertEquals(newStadium.mrWirelessNewStadium.getText(), Constants.WR_NEW_STADIUM_HEADING);
		assertEquals(newStadium.modelValue.getText(), Constants.WR_NEW_STADIUM_MODEL);
		assertEquals(newStadium.serialValue.getText(), Constants.WR_NEW_STADIUM_SERIAL);
		assertEquals(newStadium.usageValue.getText(), Constants.WR_NEW_STADIUM_USAGE);
		assertEquals(newStadium.clientsValue.getText(), Constants.WR_NEW_STADIUM_CLIENTS);

		driver.findElementByAccessibilityId(Constants.BACK_HOME).click();
		
		assertEquals(driver.findElementByXPath(Constants.HOME_NETWORKS_XPATH).getText(),
				Constants.HOME_AP_TEXT);
	}
	
	@Test
	public void apTest() {

		LoginPage loginFlow = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		ApPage ap = new ApPage(driver);
		
		loginFlow.login(apiKey);
		homePage.mrAp.click();
		
		// Check all values on the "AP" page
		assertEquals(ap.mrAP.getText(), Constants.AP_HEADING);
		assertEquals(ap.modelValue.getText(), Constants.AP_MODEL);
		assertEquals(ap.serialValue.getText(), Constants.AP_SERIAL);
		assertEquals(ap.usageValue.getText(), Constants.AP_USAGE);
		assertEquals(ap.clientsValue.getText(), Constants.AP_CLIENTS);

		driver.findElementByAccessibilityId(Constants.BACK_HOME).click();
		
		assertEquals(driver.findElementByXPath(Constants.HOME_NETWORKS_XPATH).getText(),
				Constants.HOME_AP_TEXT);
	}
	
	@Test
	public void wirelessAp1Test() {

		LoginPage loginFlow = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		WirelessAp1Page ap1 = new WirelessAp1Page(driver);
		
		loginFlow.login(apiKey);
		homePage.mrWirelessAp1.click();
		
		// Check all values on the "Wireless AP1" page
		assertEquals(ap1.wrAP1.getText(), Constants.WR_AP1_HEADING);
		assertEquals(ap1.modelValue.getText(), Constants.WR_AP1_MODEL);
		assertEquals(ap1.serialValue.getText(), Constants.WR_AP1_SERIAL);
		assertEquals(ap1.usageValue.getText(), Constants.WR_AP1_USAGE);
		assertEquals(ap1.clientsValue.getText(), Constants.WR_AP1_CLIENTS);

		driver.findElementByAccessibilityId(Constants.BACK_HOME).click();
		
		assertEquals(driver.findElementByXPath(Constants.HOME_NETWORKS_XPATH).getText(),
				Constants.HOME_AP_TEXT);
	}
	
	@Test
	public void wirelessOtherDeskTest() {

		LoginPage loginFlow = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		WirelessOtherDeskPage otherDesk = new WirelessOtherDeskPage(driver);
		
		loginFlow.login(apiKey);
		homePage.mrWirelessOtherDesk.click();
		
		// Check all values on the "Wireless Other Desk" page
		assertEquals(otherDesk.mrWrOtherDesk.getText(), Constants.WR_OTHER_DESK_HEADING);
		assertEquals(otherDesk.modelValue.getText(), Constants.WR_OTHER_DESK_MODEL);
		assertEquals(otherDesk.serialValue.getText(), Constants.WR_OTHER_DESK_SERIAL);
		assertEquals(otherDesk.usageValue.getText(), Constants.WR_OTHER_DESK_USAGE);
		assertEquals(otherDesk.clientsValue.getText(), Constants.WR_OTHER_DESK_CLIENTS);
		
		//return back to the home page
		driver.findElementByAccessibilityId(Constants.BACK_HOME).click();
		
		assertEquals(driver.findElementByXPath(Constants.HOME_NETWORKS_XPATH).getText(),
				Constants.HOME_AP_TEXT);
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
