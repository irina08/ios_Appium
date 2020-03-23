package appium.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class WirelessNewStadiumPage {

	AppiumDriver<MobileElement> driver;

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
	
	@iOSXCUITFindBy(accessibility = "0 KB")
	public MobileElement usageValue;
	
	@iOSXCUITFindBy(accessibility = "1")
	public MobileElement clientsValue;
		
}
