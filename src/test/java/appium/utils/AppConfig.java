package appium.utils;

public class AppConfig {

	private String platformName;
	private String platformVersion;
	private String deviceName;
	private String app;
	private String appiumServer;
	private String apiKey;
	private String timeout;
	
	public AppConfig() { }

	public AppConfig(String platformName, String platformVersion, String deviceName, 
			String app, String appiumServer) {

		this.platformName = platformName;
		this.platformVersion = platformVersion;
		this.deviceName = deviceName;
		this.app = app;
		this.appiumServer = appiumServer;
	}

	public String getTimeout() {
		return timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getPlatformVersion() {
		return platformVersion;
	}

	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getAppiumServer() {
		return appiumServer;
	}

	public void setAppiumServer(String appiumServer) {
		this.appiumServer = appiumServer;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}	
	
}
