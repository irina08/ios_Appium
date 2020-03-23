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
import appium.utils.CommonConstants;
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
		
		assertTrue(driver.findElementsByXPath(homePage.HOME_NETWORKS_XPATH_LIST).size() > 0,
				"Should have visible 4 networks");
		
		if(homePage.mrWirelessNewStadium.isDisplayed()) {
			assertEquals(homePage.labelMrWirelessNewStadium.getText(), homePage.WR_NEW_STADIUM_LABEL);
			assertEquals(homePage.apiMrWirelessNewStadium.getText(), homePage.WR_NEW_STADIUM_IP);
		}
	
		if(homePage.mrAp.isDisplayed()) {
			assertEquals(homePage.labelMrAp.getText(), homePage.AP_LABEL);
			assertEquals(homePage.apiMrAp.getText(), homePage.AP_IP);
		}
		
		if(homePage.mrWirelessAp1.isDisplayed()) {
			assertEquals(homePage.labelMrWirelessAp1.getText(), homePage.WR_AP1_LABEL);
			assertEquals(homePage.apiMrWirelessAp1.getText(), homePage.WR_AP1_IP);
		}
		
		if(homePage.mrWirelessOtherDesk.isDisplayed()) {
			assertEquals(homePage.labelMrWirelessOtherDesk.getText(), homePage.WR_OTHER_DESK_LABEL);
			assertEquals(homePage.apiMrWirelessOtherDesk.getText(), homePage.WR_OTHER_DESK_IP);
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
		assertEquals(newStadium.mrWirelessNewStadium.getText(), newStadium.WR_NEW_STADIUM_HEADING);
		assertEquals(newStadium.modelValue.getText(), newStadium.WR_NEW_STADIUM_MODEL);
		assertEquals(newStadium.serialValue.getText(), newStadium.WR_NEW_STADIUM_SERIAL);
		assertEquals(newStadium.usageValue.getText(), newStadium.WR_NEW_STADIUM_USAGE);
		assertEquals(newStadium.clientsValue.getText(),newStadium.WR_NEW_STADIUM_CLIENTS);

		driver.findElementByAccessibilityId(CommonConstants.BACK_HOME).click();
		
		assertEquals(driver.findElementByXPath(homePage.HOME_NETWORKS_XPATH).getText(),
				homePage.HOME_AP_TEXT);
	}
	
	@Test
	public void apTest() {

		LoginPage loginFlow = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		ApPage ap = new ApPage(driver);
		
		loginFlow.login(apiKey);
		homePage.mrAp.click();
		
		// Check all values on the "AP" page
		assertEquals(ap.mrAP.getText(), ap.AP_HEADING);
		assertEquals(ap.modelValue.getText(), ap.AP_MODEL);
		assertEquals(ap.serialValue.getText(), ap.AP_SERIAL);
		assertEquals(ap.usageValue.getText(), ap.AP_USAGE);
		assertEquals(ap.clientsValue.getText(), ap.AP_CLIENTS);

		driver.findElementByAccessibilityId(CommonConstants.BACK_HOME).click();
		
		assertEquals(driver.findElementByXPath(homePage.HOME_NETWORKS_XPATH).getText(),
				homePage.HOME_AP_TEXT);
	}
	
	@Test
	public void wirelessAp1Test() {

		LoginPage loginFlow = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		WirelessAp1Page ap1 = new WirelessAp1Page(driver);
		
		loginFlow.login(apiKey);
		homePage.mrWirelessAp1.click();
		
		// Check all values on the "Wireless AP1" page
		assertEquals(ap1.wrAP1.getText(), ap1.WR_AP1_HEADING);
		assertEquals(ap1.modelValue.getText(), ap1.WR_AP1_MODEL);
		assertEquals(ap1.serialValue.getText(), ap1.WR_AP1_SERIAL);
		assertEquals(ap1.usageValue.getText(), ap1.WR_AP1_USAGE);
		assertEquals(ap1.clientsValue.getText(), ap1.WR_AP1_CLIENTS);

		driver.findElementByAccessibilityId(CommonConstants.BACK_HOME).click();
		
		assertEquals(driver.findElementByXPath(homePage.HOME_NETWORKS_XPATH).getText(),
				homePage.HOME_AP_TEXT);
	}
	
	@Test
	public void wirelessOtherDeskTest() {

		LoginPage loginFlow = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		WirelessOtherDeskPage otherDesk = new WirelessOtherDeskPage(driver);
		
		loginFlow.login(apiKey);
		homePage.mrWirelessOtherDesk.click();
		
		// Check all values on the "Wireless Other Desk" page
		assertEquals(otherDesk.mrWrOtherDesk.getText(), otherDesk.WR_OTHER_DESK_HEADING);
		assertEquals(otherDesk.modelValue.getText(), otherDesk.WR_OTHER_DESK_MODEL);
		assertEquals(otherDesk.serialValue.getText(), otherDesk.WR_OTHER_DESK_SERIAL);
		assertEquals(otherDesk.usageValue.getText(), otherDesk.WR_OTHER_DESK_USAGE);
		assertEquals(otherDesk.clientsValue.getText(), otherDesk.WR_OTHER_DESK_CLIENTS);
		
		//return back to the home page
		driver.findElementByAccessibilityId(CommonConstants.BACK_HOME).click();
		
		assertEquals(driver.findElementByXPath(homePage.HOME_NETWORKS_XPATH).getText(),
				homePage.HOME_AP_TEXT);
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
