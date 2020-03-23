package appium.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePage {
	
	AppiumDriver<MobileElement> driver;
	
	public HomePage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//Wireless New Stadium
	@iOSXCUITFindBy(accessibility = "MR - Wireless New Stadium")
	public MobileElement mrWirelessNewStadium;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='name'])[1]")
	public MobileElement labelMrWirelessNewStadium;
	
	@iOSXCUITFindBy(accessibility = "172.29.6.100")
	public MobileElement apiMrWirelessNewStadium; 
	
	//AP
	@iOSXCUITFindBy(accessibility = "MR - AP")
	public MobileElement mrAp;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='name'])[2]")
	public MobileElement labelMrAp;
	
	@iOSXCUITFindBy(accessibility = "172.29.6.126")
	public MobileElement apiMrAp; 
	
	
	//Wireless AP 1
	@iOSXCUITFindBy(accessibility = "MR - Wireless AP 1")
	public MobileElement mrWirelessAp1;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='name'])[3]")
	public MobileElement labelMrWirelessAp1;
	
	@iOSXCUITFindBy(accessibility = "172.29.6.107")
	public MobileElement apiMrWirelessAp1; 
	
	
	//Wireless other desk
	@iOSXCUITFindBy(accessibility = "MR - Wireless other desk")
	public MobileElement mrWirelessOtherDesk; 
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='name'])[4]")
	public MobileElement labelMrWirelessOtherDesk;
	
	@iOSXCUITFindBy(accessibility = "172.29.6.43")
	public MobileElement apiMrWirelessOtherDesk; 
	
}
