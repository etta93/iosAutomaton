package Utility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class Hook {
	public static AppiumDriver<WebElement> driver;
	public static DesiredCapabilities cap;
	
	@Before("@app")
	public static void setup() throws MalformedURLException{
		cap = new DesiredCapabilities();
		cap.setCapability("platformName", "iOS");
		cap.setCapability("deviceName", "iPhone 11 Pro Max");
		cap.setCapability("platformVersion", "13.3");
		cap.setCapability("bundleId", "com.pavlovskyistudio.DoDo");
		driver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	}

	@After("@app")
	public void tearDown() {
		driver.quit();
	}
	
	public static AppiumDriver<WebElement> getDriver() {
		return driver;
	}
}
