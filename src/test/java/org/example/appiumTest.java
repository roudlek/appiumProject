package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.junit.jupiter.api.Test;


import java.net.MalformedURLException;
import java.net.URL;

public class appiumTest {
    @Test
        public void startCalculator() throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android"); // optional
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2); // optional
//        options.setDeviceName("emulator-5554");
        options.setApp(System.getProperty("user.dir") + "/apps/Android-MyDemoAppRN.1.3.0.build-244.apk");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        Thread.sleep(5000);




//        DesiredCapabilities caps = new DesiredCapabilities();
////        caps.setCapability("avd","Pixel3a");
//
//        caps.setCapability("deviceName", "Samsung Galaxy S7 edge"); // Replace with your device name or AVD name
//        caps.setCapability("udid","ce0117115a8154800c");
//        caps.setCapability("platformName", "Android");
////        caps.setCapability("platformVersion", "7.0");
//
////        Name: Calculator
////        Package: com.sec.android.app.popupcalculator
////        activity : com.sec.android.app.popupcalculator.Calculator
//
//        caps.setCapability("appPackage", "com.sec.android.app.popupcalculator"); // Replace with your app's package name
//        caps.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator"); // Replace with your app's main activity
//        caps.setCapability("automationName", "Espresso"); // You can use UiAutomator2 or Appium (for older versions)
//        caps.setCapability("–session-override",true);
//
//
//
//
//
//
//        // Create the AndroidDriver instance
//        System.out.println("app started ...");
    }
}
