package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class Login {
    public void LoginwithEmail(AndroidDriver<MobileElement> driver, String email, String password) throws InterruptedException {
        driver.findElementByXPath("//android.widget.TextView[@text=\"Continue with Email\"]").click();
        Thread.sleep(2000);
        driver.findElementByAccessibilityId("email_txt").sendKeys(email);
        driver.findElementByAccessibilityId("password_txt").sendKeys(password);
        driver.findElementByAccessibilityId("login_btn");
    }
}