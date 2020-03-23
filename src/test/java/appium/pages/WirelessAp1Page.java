package appium.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class WirelessAp1Page {

	AppiumDriver<MobileElement> driver;

	public String WR_AP1_HEADING = "Wireless AP 1";
	public String WR_AP1_MODEL = "MR34";
	public String WR_AP1_SERIAL = "Q2FD-FTZE-5EQ4";
	public String WR_AP1_USAGE = "Zero KB";
	public String WR_AP1_CLIENTS = "0";

	public WirelessAp1Page(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Wireless AP 1']")
	public MobileElement wrAP1;

	@iOSXCUITFindBy(accessibility = "MR34")
	public MobileElement modelValue;
	
	@iOSXCUITFindBy(accessibility = "Q2FD-FTZE-5EQ4")
	public MobileElement serialValue;
	
	@iOSXCUITFindBy(accessibility = "Zero KB")
	public MobileElement usageValue;
	
	@iOSXCUITFindBy(accessibility = "0")
	public MobileElement clientsValue;	
}
