package org.example;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppointmentCreate {
    public void createAppointment(AndroidDriver<MobileElement> driver, String email, String password) throws InterruptedException {
        driver.findElementByAccessibilityId("Calendar").click();
        driver.findElementById("com.adaptavant.setmore:id/fab").click();
        driver.findElementById("com.adaptavant.setmore:id/txt_create_service").click();
        driver.findElementById("(//android.view.ViewGroup[@index=\"0\"])[2]").click();
        driver.findElementById("(//android.widget.TextView)[25]").click();
        driver.findElementByAccessibilityId("Add Guest Icon").click();
        driver.findElementByXPath("//android.widget.TextView[@text=\"Full name\"]//following-sibling::android.view.View").sendKeys(generateRandomName());
        driver.findElementByXPath("//android.widget.TextView[@text=\"Save\"]").click();
        driver.findElementByXPath("//android.widget.TextView[@text=\"Create\"]").click();
    }

    //create a function to generate a random name
    public String generateRandomName() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int index = (int)(alphabet.length() * Math.random());
            sb.append(alphabet.charAt(index));
        }
        return sb.toString();
    }
}
