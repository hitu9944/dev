package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import testBase.TestBase;

public class Login extends TestBase {
	
	public AndroidDriver<WebElement> driver;
	
	@Before
	public void LoginIntit() throws Exception {
		driver=getDriver();
		
		
	}
	@Given("^User is on Myntra Home Page$")
	public void user_is_on_Myntra_Home_Page() throws Exception {
		System.out.println("Application Opens With Home Page");
	    
	}

	@When("^User clicks the Login button and enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_clicks_the_Login_button_and_enters_and(String username, String password) throws Exception {
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc="+'"'+"leftElement"+'"'+"]/android.widget.TextView").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup").click();
		driver.findElementById("com.myntra.android:id/et_email_or_phone").sendKeys(username);
		driver.findElementById("com.myntra.android:id/et_loginregister_password").sendKeys(password);
		driver.findElementById("com.myntra.android:id/btn_loginregister_continue_signin").click();
	}

	@Then("^User Should be able to login$")
	public void user_Should_be_able_to_login() throws Exception {
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup").click();
		String Name=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView").getText();
	    Assert.assertEquals(Name, "Demo");
	}
	
	@After
	public void TearDown() {
		quit();
	}

}
