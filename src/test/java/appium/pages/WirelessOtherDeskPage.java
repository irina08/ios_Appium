package appium.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class WirelessOtherDeskPage {

	AppiumDriver<MobileElement> driver;

	public String WR_OTHER_DESK_HEADING = "Wireless other desk";
	public String WR_OTHER_DESK_MODEL = "MR34";
	public String WR_OTHER_DESK_SERIAL = "Q2FD-TR63-PBC2";
	public String WR_OTHER_DESK_USAGE = "Zero KB";
	public String WR_OTHER_DESK_CLIENTS = "0";

	public WirelessOtherDeskPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//@iOSXCUITFindBy(accessibility = "Wireless other desk")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Wireless other desk']")
	public MobileElement mrWrOtherDesk;
	
	@iOSXCUITFindBy(accessibility = "MR34")
	public MobileElement modelValue;
	
	@iOSXCUITFindBy(accessibility = "Q2FD-TR63-PBC2")
	public MobileElement serialValue;
	
	@iOSXCUITFindBy(accessibility = "Zero KB")
	public MobileElement usageValue;
	
	@iOSXCUITFindBy(accessibility = "0")
	public MobileElement clientsValue;	
}

