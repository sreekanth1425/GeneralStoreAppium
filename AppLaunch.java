package generalStore;
//TOAST MESSAGE

////String toastMsg=driver.findElementByXPath("//android.widget.Toast[1]").getAttribute("name");
//try {
//AndroidElement toastMessage = driver.findElementByXPath("//android.widget.Toast[1]");
//String message = toastMessage.getText();
//System.out.println("Toast Message: " + message);
//} catch (Exception e) {
//System.out.println("Toast Message not found");
//}

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.springframework.util.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppLaunch extends Base {

//	public static void main(String[] args) throws MalformedURLException {
//		AndroidDriver<AndroidElement> driver = capabilities();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		System.out.println("app launched");
//		driver.findElementById("android:id/text1").click();
//
//		driver.findElementByAndroidUIAutomator(
//				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Brazil\"))")
//				.click();
//		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("sreekanth");
//		driver.hideKeyboard();
//
//		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
//		System.out.println("entered into products page");
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
//				+ ".resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Nike SFB Jungle\").instance(0))");
//		driver.findElementsByXPath("//android.widget.TextView[@text='ADD TO CART']").get(0).click();
//		driver.findElementsByXPath("//android.widget.TextView[@text='ADD TO CART']").get(0).click();
//		
////		driver.findElementsByXPath("//*[@text='ADD TO CART']").get(1).click();
//		System.out.println("desired products added to cart");
//// go to cart,aun the product prices and assert with displayed total price on screen
//		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
//		String amount1=driver.findElementByXPath("//android.widget.TextView[@text='$116.97']").getText();
//		String amount2=driver.findElementByXPath("//android.widget.TextView[@text='$110.0']").getText();
//		amount1=amount1.substring(1);
//		amount2=amount2.substring(1);
//		double amount1Value=Double.parseDouble(amount1);
//		double amount2Value=Double.parseDouble(amount2);
//		double TotalSum=(amount1Value+amount2Value);
//		String totalPurAmt=driver.findElementById("com.androidsample.generalstore:id/totalAmountLbl").getText();
//		totalPurAmt=totalPurAmt.substring(1);
////		Assert.assertEquals(totalPurAmt,TotalSum);
//		System.out.println(totalPurAmt);
//		System.out.println(TotalSum);
//		}



}
