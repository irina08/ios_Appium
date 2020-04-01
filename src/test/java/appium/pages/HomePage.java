package appium.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePage {
	
	AppiumDriver<MobileElement> driver;

	public static String HOME_NETWORKS_XPATH = "//XCUIElementTypeStaticText[@name='4  APs']";
	public static String HOME_NETWORKS_XPATH_LIST = "//XCUIElementTypeCell";
	public static String HOME_AP_TEXT = "4  APs";
	public static String HOME_NONETWORKS_XPATH = "//XCUIElementTypeStaticText[@name='0  APs']";
	public static String HOME_NOAP_TEXT = "0  APs";


	public String WR_NEW_STADIUM_LABEL = "Wireless New Stadium";
	public String WR_NEW_STADIUM_IP = "172.29.6.100";

	public String AP_LABEL = "AP";
	public String AP_IP = "172.29.4.96";

	public String WR_AP1_LABEL = "Wireless AP 1";
	public String WR_AP1_IP = "172.29.6.107";

	public String WR_OTHER_DESK_LABEL = "Wireless other desk";
	public String WR_OTHER_DESK_IP = "172.29.6.43";

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
	
	@iOSXCUITFindBy(accessibility = "172.29.4.96")
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
