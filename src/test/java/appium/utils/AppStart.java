package appium.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppStart {

    private static AppConfig appConfig = new AppConfig();
    private static Properties properties = new Properties();
    private static AppiumDriver<MobileElement> driver;

    static {
		properties = readConfigFile(CommonConstants.CONFIG_FILE_PATH);
		appConfig.setPlatformName(properties.getProperty("platformName"));
		appConfig.setPlatformVersion(properties.getProperty("platformVersion"));
		appConfig.setDeviceName(properties.getProperty("deviceName"));
		appConfig.setApp(properties.getProperty("app"));
		appConfig.setAppiumServer(properties.getProperty("appiumServer"));
		appConfig.setApiKey(properties.getProperty("apiKey"));
		appConfig.setTimeout(properties.getProperty("timeout"));
    }

    public static AppiumDriver<MobileElement> startApp() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, appConfig.getPlatformName());
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, appConfig.getPlatformVersion());
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, appConfig.getDeviceName());
		desiredCapabilities.setCapability(MobileCapabilityType.APP, appConfig.getApp());
		desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, appConfig.getTimeout());
		desiredCapabilities.setCapability(CommonConstants.KEYBOARD_SETTING, false);

		URL url = new URL(appConfig.getAppiumServer());

		if (appConfig.getPlatformName().equalsIgnoreCase(CommonConstants.IOS_PLATFORM_NAME)) {
	    	desiredCapabilities.setCapability(CommonConstants.AUTOMATION_NAME, CommonConstants.AUTOMATION_VALUE);
	    	driver = new IOSDriver<MobileElement>(url, desiredCapabilities);
		}
		driver.manage().timeouts().implicitlyWait(Long.valueOf(appConfig.getTimeout()), TimeUnit.SECONDS);

		return driver;
    }

    public static String getAPiKey() {
	return appConfig.getApiKey();
    }

    public static String getTimeout() {
	return appConfig.getTimeout();
    }
	
    public static Properties readConfigFile(String file) {
		InputStream input = null;
		Properties properties = new Properties();
		try {
	    	input = new FileInputStream(file);
	    	properties.load(input);
		} catch (IOException e) {
	    	e.printStackTrace();
		} finally {
	    	if (input != null) {
				try {
		    		input.close();
				} catch (IOException e) {
		    		e.printStackTrace();
				}
	    	}
		}
		return properties;
    }
}
