package generalStore;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "SRKemulator-1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.androidsample.generalstore");
		capabilities.setCapability("appActivity", "com.androidsample.generalstore.SplashActivity");

		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);

		// Your test code here
		System.out.println("appium server launched");
		return driver;
		}

	}



