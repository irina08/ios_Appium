package appium.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ApPage {

	AppiumDriver<MobileElement> driver;

	public String AP_HEADING = "AP";
	public String AP_MODEL = "MR34";
	public String AP_SERIAL = "Q2FD-JVAE-348F";
	public String AP_USAGE = "Zero KB";
	public String AP_CLIENTS = "0";

	public ApPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='AP']")
	public MobileElement mrAP;

	@iOSXCUITFindBy(accessibility = "MR34")
	public MobileElement modelValue;
	
	@iOSXCUITFindBy(accessibility = "Q2FD-JVAE-348F")
	public MobileElement serialValue;
	
	@iOSXCUITFindBy(accessibility = "Zero KB")
	public MobileElement usageValue;
	
	@iOSXCUITFindBy(accessibility = "0")
	public MobileElement clientsValue;
}
