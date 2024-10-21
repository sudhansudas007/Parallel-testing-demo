package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestClass1 extends DesiredCaps{
    private AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        driver = DesiredCapabilities("12", "emulator-5554", "7777");
    }

    @Test(priority = 1)
    public void testMethod() throws InterruptedException {
       driver.launchApp();
       System.out.println("App launched!!!, This is 1st device");
       Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void login() throws InterruptedException {
        Login obj = new Login();
        obj.LoginwithEmail(driver, "sudhansu4545@setmore.com", "demo@1234");
    }

}