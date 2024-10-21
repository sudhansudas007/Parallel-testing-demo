package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DesiredCaps {
    public AndroidDriver<MobileElement> DesiredCapabilities(String androidVersion, String deviceName, String portNumber) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("appium:newCommandTimeout", 1000);
        caps.setCapability("deviceName", deviceName);
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", androidVersion);
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.adaptavant.setmore");
        caps.setCapability("appActivity", "com.anywhere.container.presentation.ui.MainActivity");
        caps.setCapability("noReset", true);
        AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:"+portNumber+"/"), caps);
        return driver;
    }
}