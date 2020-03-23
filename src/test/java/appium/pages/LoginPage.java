package appium.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage {

	AppiumDriver<MobileElement> driver;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='apiKeyTxt']")
	public MobileElement apiKeyInput;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Go']")
	public MobileElement goBtn;

	public LoginPage(AppiumDriver<MobileElement> driver) {
		
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void login(String apiKey) {

		apiKeyInput.clear();
		apiKeyInput.sendKeys(apiKey);
		driver.hideKeyboard();
		goBtn.click();
	}
}
