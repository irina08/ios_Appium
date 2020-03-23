package appium.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ApPage {

	AppiumDriver<MobileElement> driver;

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
