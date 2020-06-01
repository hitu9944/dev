package testBase;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {
	
	public static AndroidDriver<WebElement> driver;
	
	public AndroidDriver<WebElement> getDriver() throws Exception {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "ZY22394BZQ");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
		dc.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"\\Utilities\\com.myntra.android.apk");
		dc.setCapability("appPackage", "com.myntra.android");
		dc.setCapability("appActivity", "com.myntra.android.activities.LoginRegisterActivity");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
	
	driver = new AndroidDriver<WebElement>(url,dc);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	return driver;
	}

	public void quit() {
		driver.quit();
	}

}
