package appium.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class WirelessNewStadiumPage {

	AppiumDriver<MobileElement> driver;

	public String WR_NEW_STADIUM_HEADING = "Wireless New Stadium";
	public String WR_NEW_STADIUM_MODEL = "MR34";
	public String WR_NEW_STADIUM_SERIAL = "Q2FD-257W-K29Z";
	public String WR_NEW_STADIUM_USAGE = "Zero KB";
	public String WR_NEW_STADIUM_CLIENTS = "0";

	public WirelessNewStadiumPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Wireless New Stadium']")
	public MobileElement mrWirelessNewStadium;

	@iOSXCUITFindBy(accessibility ="MR34")
	public MobileElement modelValue;
	
	@iOSXCUITFindBy(accessibility = "Q2FD-257W-K29Z")
	public MobileElement serialValue;
	
	@iOSXCUITFindBy(accessibility = "Zero KB")
	public MobileElement usageValue;
	
	@iOSXCUITFindBy(accessibility = "0")
	public MobileElement clientsValue;
}
