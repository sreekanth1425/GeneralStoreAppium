// comment1
package generalStore;

import java.net.MalformedURLException;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.TapOptions.tapOptions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class practice extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("application launched");
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("female");
		driver.hideKeyboard();
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Brazil\"))")
				.click();
		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		System.out.println("entered into products page");
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"PG 3\").instance(0))");
		Thread.sleep(3000);
		driver.findElementsByXPath("//android.widget.TextView[@text='ADD TO CART']").get(0).click();
		driver.findElementsByXPath("//android.widget.TextView[@text='ADD TO CART']").get(0).click();
		System.out.println("products added to cart");
		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		Thread.sleep(3000);
		/*
		 * String amt1 =
		 * driver.findElementsById("com.androidsample.generalstore:id/productPrice").get
		 * (0).getText(); String amt2 =
		 * driver.findElementsById("com.androidsample.generalstore:id/productPrice").get
		 * (1).getText(); System.out.println(amt1); System.out.println(amt2); Double
		 * amt1Val= getAmount(amt1); Double amt2Val=getAmount(amt2); double
		 * sumOfProductsValue = amt1Val + amt2Val;
		 */
//		driver.findElementsById("com.androidsample.generalstore:id/productPrice")
		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();
		double sumOfProductsValue = 0;
		for (int i = 0; i < count; i++) {
			String amt = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(i).getText();
			double amtVal = getAmount(amt);
			sumOfProductsValue = sumOfProductsValue + amtVal;
		}
		System.out.println(sumOfProductsValue);

		String actualAmt = driver.findElementById("com.androidsample.generalstore:id/totalAmountLbl").getText();

		Double ActualAmtValue = getAmount(actualAmt);
		System.out.println(ActualAmtValue);
		/*
		 * amt1=amt1.substring(1); amt2=amt2.substring(1); double amt1Val =
		 * Double.parseDouble(amt1); double amt2Val = Double.parseDouble(amt2);
		 * actualAmt = actualAmt.substring(1); double ActualAmtValue =
		 * Double.parseDouble(actualAmt);
		 */
		Assert.assertEquals(ActualAmtValue, sumOfProductsValue);
		if (ActualAmtValue != sumOfProductsValue) {
			System.out.println("test failed");
		} else {
			System.out.println("test success");
		}

//		mobile gestures,moving to web view
		AndroidElement checkBox = driver.findElementByClassName("android.widget.CheckBox");
		TouchAction tc = new TouchAction(driver);
		tc.tap(tapOptions().withElement(element(checkBox))).perform();
		driver.findElementByClassName("android.widget.Button").click();
		Thread.sleep(7000);
		Set<String> contexts = driver.getContextHandles();
		for (String contextName : contexts) {
			System.out.println(contextName);
		}
//		CHROMEDRIVER ISSUE IS PENDING
//		driver.context("WEBVIEW_com.androidsample.generalstore");
//		driver.findElementByName("q").sendKeys("hello srk");
//		driver.findElementByName("q").sendKeys(Keys.ENTER);
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		System.out.println("job done successfully");
	}

	public static double getAmount(String value) {
		value = value.substring(1);
		double amtValue = Double.parseDouble(value);
		return amtValue;

	}

}
