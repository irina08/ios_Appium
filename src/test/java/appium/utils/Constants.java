package appium.utils;

public interface Constants {

	String CONFIG_FILE_PATH = System.getProperty("user.dir") + "/config.properties";

	String KEYBOARD_SETTING = "connectHardwareKeyboard";
	String AUTOMATION_NAME = "automationName";
	String AUTOMATION_VALUE = "XCUITest";
	String IOS_PLATFORM_NAME = "IOS";
	
	String BACK_HOME = "Wireless AP's";
	
	//Home Page
	String HOME_NETWORKS_XPATH = "//XCUIElementTypeStaticText[@name='4  APs']";
	String HOME_NETWORKS_XPATH_LIST = "//XCUIElementTypeCell";
	String HOME_AP_TEXT = "4  APs";
	String HOME_NONETWORKS_XPATH = "//XCUIElementTypeStaticText[@name='0  APs']";
	String HOME_NOAP_TEXT = "0  APs";
	
	String WR_NEW_STADIUM_LABEL = "Wireless New Stadium";
	String WR_NEW_STADIUM_IP = "172.29.6.100";
	
	String AP_LABEL = "AP";
	String AP_IP = "172.29.6.126";
	
	String WR_AP1_LABEL = "Wireless AP 1";
	String WR_AP1_IP = "172.29.6.107";
	
	String WR_OTHER_DESK_LABEL = "Wireless other desk";
	String WR_OTHER_DESK_IP = "172.29.6.43";
	
	
	// Wireless New Stadium
	String WR_NEW_STADIUM_HEADING = "Wireless New Stadium";
	String WR_NEW_STADIUM_MODEL = "MR34";
	String WR_NEW_STADIUM_SERIAL = "Q2FD-257W-K29Z";
	String WR_NEW_STADIUM_USAGE = "0 KB";
	String WR_NEW_STADIUM_CLIENTS = "1";
	
	
	// AP 
	String AP_HEADING = "AP";
	String AP_MODEL = "MR34";
	String AP_SERIAL = "Q2FD-JVAE-348F";
	String AP_USAGE = "Zero KB";
	String AP_CLIENTS = "0";
	
	
	// Wireless AP1 
	String WR_AP1_HEADING = "Wireless AP 1";
	String WR_AP1_MODEL = "MR34";
	String WR_AP1_SERIAL = "Q2FD-FTZE-5EQ4";
	String WR_AP1_USAGE = "Zero KB";
	String WR_AP1_CLIENTS = "0";
	
	
	// Wireless Other Desk 
	String WR_OTHER_DESK_HEADING = "Wireless other desk";
	String WR_OTHER_DESK_MODEL = "MR34";
	String WR_OTHER_DESK_SERIAL = "Q2FD-TR63-PBC2";
	String WR_OTHER_DESK_USAGE = "Zero KB";
	String WR_OTHER_DESK_CLIENTS = "0";	
}
