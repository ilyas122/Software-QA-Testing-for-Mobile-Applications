import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FoodZillaTest {
	AndroidDriver<AndroidElement> driver;
	@Before
	public void setUp() throws MalformedURLException {
		
		System.out.println("Running Automated Test cases on FOODZILLA AI Mobile Application");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability("platformName", "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "8620a729");
		dc.setCapability("appPackage", "io.foodzilla.app");
        dc.setCapability("appActivity", "io.foodzilla.app.MainActivity");
		dc.setCapability("noReset", "true");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<AndroidElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.TextView[2]").click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]").click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ListView/android.widget.LinearLayout[8]/android.widget.LinearLayout").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void TestCase1() {
		System.out.println("Running TestCase-1");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Chicken (200grams)", actualResult);
        if(actualResult.contains("Chicken")) {
        	System.out.println("1.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("1.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase2() {
		System.out.println("Running TestCase-2");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Bread (50grams)", actualResult);
        if(actualResult.contains("Bread")) {
        	System.out.println("2.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("2.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase3() {
		System.out.println("Running TestCase-3");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Lunch", "Rice (0.1cup)", actualResult);
        if(actualResult.contains("Rice")) {
        	System.out.println("3.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("3.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase4() {
		System.out.println("Running TestCase-4");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Idly (50grams)", actualResult);
        if(actualResult.contains("Idly")) {
        	System.out.println("4.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("4.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase5() {
		System.out.println("Running TestCase-5");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Dinner", "Wheat (50grams)", actualResult);
        if(actualResult.contains("Wheat")) {
        	System.out.println("5.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("5.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase6() {
		System.out.println("Running TestCase-6");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Pakora (50grams)", actualResult);
        if(actualResult.contains("Pakora")) {
        	System.out.println("6.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("6.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase7() {
		System.out.println("Running TestCase-7");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Lunch", "Shrimp (50grams)", actualResult);
        if(actualResult.contains("Shrimp")) {
        	System.out.println("7.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("7.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase8() {
		System.out.println("Running TestCase-8");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("8.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("8.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase9() {
		System.out.println("Running TestCase-9");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("9.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("9.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase10() {
		System.out.println("Running TestCase-10");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Chicken (200grams)", actualResult);
        if(actualResult.contains("Chicken")) {
        	System.out.println("10.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("10.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase11() {
		System.out.println("Running TestCase-11");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Bread (50grams)", actualResult);
        if(actualResult.contains("Bread")) {
        	System.out.println("11.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("11.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase12() {
		System.out.println("Running TestCase-12");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Lunch", "Rice (0.1cup)", actualResult);
        if(actualResult.contains("Rice")) {
        	System.out.println("12.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("12.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase13() {
		System.out.println("Running TestCase-13");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Idly (50grams)", actualResult);
        if(actualResult.contains("Idly")) {
        	System.out.println("13.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("13.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase14() {
		System.out.println("Running TestCase-14");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Dinner", "Wheat (50grams)", actualResult);
        if(actualResult.contains("Wheat")) {
        	System.out.println("14.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("14.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase15() {
		System.out.println("Running TestCase-15");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Pakora (50grams)", actualResult);
        if(actualResult.contains("Pakora")) {
        	System.out.println("15.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("15.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase16() {
		System.out.println("Running TestCase-16");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Lunch", "Shrimp (50grams)", actualResult);
        if(actualResult.contains("Shrimp")) {
        	System.out.println("16.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("16.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase17() {
		System.out.println("Running TestCase-17");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("17.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("17.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase18() {
		System.out.println("Running TestCase-18");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("18.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("18.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase19() {
		System.out.println("Running TestCase-19");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("19.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("19.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase20() {
		System.out.println("Running TestCase-20");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("20.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("20.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase21() {
		System.out.println("Running TestCase-21");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Chicken (200grams)", actualResult);
        if(actualResult.contains("Chicken")) {
        	System.out.println("21.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("21.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase22() {
		System.out.println("Running TestCase-22");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Bread (50grams)", actualResult);
        if(actualResult.contains("Bread")) {
        	System.out.println("22.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("22.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase23() {
		System.out.println("Running TestCase-23");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Lunch", "Rice (0.1cup)", actualResult);
        if(actualResult.contains("Rice")) {
        	System.out.println("23.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("23.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase24() {
		System.out.println("Running TestCase-24");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Idly (50grams)", actualResult);
        if(actualResult.contains("Idly")) {
        	System.out.println("24.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("24.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase25() {
		System.out.println("Running TestCase-25");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Dinner", "Wheat (50grams)", actualResult);
        if(actualResult.contains("Wheat")) {
        	System.out.println("25.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("25.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase26() {
		System.out.println("Running TestCase-26");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Pakora (50grams)", actualResult);
        if(actualResult.contains("Pakora")) {
        	System.out.println("26.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("26.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase27() {
		System.out.println("Running TestCase-27");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Lunch", "Shrimp (50grams)", actualResult);
        if(actualResult.contains("Shrimp")) {
        	System.out.println("27.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("27.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase28() {
		System.out.println("Running TestCase-28");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("28.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("28.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase29() {
		System.out.println("Running TestCase-29");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("29.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("29.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase30() {
		System.out.println("Running TestCase-30");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Chicken (200grams)", actualResult);
        if(actualResult.contains("Chicken")) {
        	System.out.println("30.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("30.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase31() {
		System.out.println("Running TestCase-11");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Bread (50grams)", actualResult);
        if(actualResult.contains("Bread")) {
        	System.out.println("31.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("31.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase32() {
		System.out.println("Running TestCase-32");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Lunch", "Rice (0.1cup)", actualResult);
        if(actualResult.contains("Rice")) {
        	System.out.println("32.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("32.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase33() {
		System.out.println("Running TestCase-33");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Idly (50grams)", actualResult);
        if(actualResult.contains("Idly")) {
        	System.out.println("33.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("33.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase34() {
		System.out.println("Running TestCase-34");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Dinner", "Wheat (50grams)", actualResult);
        if(actualResult.contains("Wheat")) {
        	System.out.println("34.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("34.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase35() {
		System.out.println("Running TestCase-35");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Pakora (50grams)", actualResult);
        if(actualResult.contains("Pakora")) {
        	System.out.println("35.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("35.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase36() {
		System.out.println("Running TestCase-36");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Lunch", "Shrimp (50grams)", actualResult);
        if(actualResult.contains("Shrimp")) {
        	System.out.println("36.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("36.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase37() {
		System.out.println("Running TestCase-37");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("37.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("37.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase38() {
		System.out.println("Running TestCase-38");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("38.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("38.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase39() {
		System.out.println("Running TestCase-39");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("39.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("39.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase40() {
		System.out.println("Running TestCase-40");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("40.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("40.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase41() {
		System.out.println("Running TestCase-41");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Chicken (200grams)", actualResult);
        if(actualResult.contains("Chicken")) {
        	System.out.println("41.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("41.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase42() {
		System.out.println("Running TestCase-42");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Bread (50grams)", actualResult);
        if(actualResult.contains("Bread")) {
        	System.out.println("42.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("42.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase43() {
		System.out.println("Running TestCase-43");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Lunch", "Rice (0.1cup)", actualResult);
        if(actualResult.contains("Rice")) {
        	System.out.println("43.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("43.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase44() {
		System.out.println("Running TestCase-44");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Idly (50grams)", actualResult);
        if(actualResult.contains("Idly")) {
        	System.out.println("44.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("44.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase45() {
		System.out.println("Running TestCase-45");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Dinner", "Wheat (50grams)", actualResult);
        if(actualResult.contains("Wheat")) {
        	System.out.println("45.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("45.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase46() {
		System.out.println("Running TestCase-46");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Pakora (50grams)", actualResult);
        if(actualResult.contains("Pakora")) {
        	System.out.println("46.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("46.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase47() {
		System.out.println("Running TestCase-47");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Lunch", "Shrimp (50grams)", actualResult);
        if(actualResult.contains("Shrimp")) {
        	System.out.println("47.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("47.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase48() {
		System.out.println("Running TestCase-48");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("48.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("48.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase49() {
		System.out.println("Running TestCase-49");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("49.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("49.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase50() {
		System.out.println("Running TestCase-50");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Chicken (200grams)", actualResult);
        if(actualResult.contains("Chicken")) {
        	System.out.println("50.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("50.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase51() {
		System.out.println("Running TestCase-51");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Bread (50grams)", actualResult);
        if(actualResult.contains("Bread")) {
        	System.out.println("51.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("51.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase52() {
		System.out.println("Running TestCase-52");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Lunch", "Rice (0.1cup)", actualResult);
        if(actualResult.contains("Rice")) {
        	System.out.println("52.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("52.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase53() {
		System.out.println("Running TestCase-53");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Idly (50grams)", actualResult);
        if(actualResult.contains("Idly")) {
        	System.out.println("53.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("53.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase54() {
		System.out.println("Running TestCase-54");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Dinner", "Wheat (50grams)", actualResult);
        if(actualResult.contains("Wheat")) {
        	System.out.println("54.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("54.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase55() {
		System.out.println("Running TestCase-55");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Pakora (50grams)", actualResult);
        if(actualResult.contains("Pakora")) {
        	System.out.println("55.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("55.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase56() {
		System.out.println("Running TestCase-56");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Lunch", "Shrimp (50grams)", actualResult);
        if(actualResult.contains("Shrimp")) {
        	System.out.println("56.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("56.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase57() {
		System.out.println("Running TestCase-57");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("57.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("57.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase58() {
		System.out.println("Running TestCase-58");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("58.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("58.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase59() {
		System.out.println("Running TestCase-59");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("59.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("59.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase60() {
		System.out.println("Running TestCase-60");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("60.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("60.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase61() {
		System.out.println("Running TestCase-61");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Chicken (200grams)", actualResult);
        if(actualResult.contains("Chicken")) {
        	System.out.println("61.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("61.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase62() {
		System.out.println("Running TestCase-62");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Bread (50grams)", actualResult);
        if(actualResult.contains("Bread")) {
        	System.out.println("62.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("62.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase63() {
		System.out.println("Running TestCase-63");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Lunch", "Rice (0.1cup)", actualResult);
        if(actualResult.contains("Rice")) {
        	System.out.println("63.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("63.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase64() {
		System.out.println("Running TestCase-64");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Idly (50grams)", actualResult);
        if(actualResult.contains("Idly")) {
        	System.out.println("64.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("64.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase65() {
		System.out.println("Running TestCase-65");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Dinner", "Wheat (50grams)", actualResult);
        if(actualResult.contains("Wheat")) {
        	System.out.println("65.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("65.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase66() {
		System.out.println("Running TestCase-66");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Pakora (50grams)", actualResult);
        if(actualResult.contains("Pakora")) {
        	System.out.println("66.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("66.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase67() {
		System.out.println("Running TestCase-67");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Lunch", "Shrimp (50grams)", actualResult);
        if(actualResult.contains("Shrimp")) {
        	System.out.println("67.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("67.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase68() {
		System.out.println("Running TestCase-68");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("68.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("68.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase69() {
		System.out.println("Running TestCase-69");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("69.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("69.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase70() {
		System.out.println("Running TestCase-70");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Chicken (200grams)", actualResult);
        if(actualResult.contains("Chicken")) {
        	System.out.println("70.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("70.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase71() {
		System.out.println("Running TestCase-71");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Bread (50grams)", actualResult);
        if(actualResult.contains("Bread")) {
        	System.out.println("71.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("71.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase72() {
		System.out.println("Running TestCase-72");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Lunch", "Rice (0.1cup)", actualResult);
        if(actualResult.contains("Rice")) {
        	System.out.println("72.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("72.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase73() {
		System.out.println("Running TestCase-73");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Idly (50grams)", actualResult);
        if(actualResult.contains("Idly")) {
        	System.out.println("73.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("73.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase74() {
		System.out.println("Running TestCase-74");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Dinner", "Wheat (50grams)", actualResult);
        if(actualResult.contains("Wheat")) {
        	System.out.println("74.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("74.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase75() {
		System.out.println("Running TestCase-75");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Pakora (50grams)", actualResult);
        if(actualResult.contains("Pakora")) {
        	System.out.println("75.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("75.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase76() {
		System.out.println("Running TestCase-76");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Lunch", "Shrimp (50grams)", actualResult);
        if(actualResult.contains("Shrimp")) {
        	System.out.println("76.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("76.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase77() {
		System.out.println("Running TestCase-77");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("77.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("77.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase78() {
		System.out.println("Running TestCase-78");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("78.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("78.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase79() {
		System.out.println("Running TestCase-79");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("79.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("79.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase80() {
		System.out.println("Running TestCase-80");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("80.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("80.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase81() {
		System.out.println("Running TestCase-81");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Chicken (200grams)", actualResult);
        if(actualResult.contains("Chicken")) {
        	System.out.println("81.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("81.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase82() {
		System.out.println("Running TestCase-82");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Bread (50grams)", actualResult);
        if(actualResult.contains("Bread")) {
        	System.out.println("82.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("82.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase83() {
		System.out.println("Running TestCase-83");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Lunch", "Rice (0.1cup)", actualResult);
        if(actualResult.contains("Rice")) {
        	System.out.println("83.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("83.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase84() {
		System.out.println("Running TestCase-84");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Idly (50grams)", actualResult);
        if(actualResult.contains("Idly")) {
        	System.out.println("84.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("84.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase85() {
		System.out.println("Running TestCase-85");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Dinner", "Wheat (50grams)", actualResult);
        if(actualResult.contains("Wheat")) {
        	System.out.println("85.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("85.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase86() {
		System.out.println("Running TestCase-86");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Pakora (50grams)", actualResult);
        if(actualResult.contains("Pakora")) {
        	System.out.println("86.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("86.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase87() {
		System.out.println("Running TestCase-87");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Lunch", "Shrimp (50grams)", actualResult);
        if(actualResult.contains("Shrimp")) {
        	System.out.println("87.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("87.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase88() {
		System.out.println("Running TestCase-88");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("88.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("88.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase89() {
		System.out.println("Running TestCase-89");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("89.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("89.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase90() {
		System.out.println("Running TestCase-90");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Chicken (200grams)", actualResult);
        if(actualResult.contains("Chicken")) {
        	System.out.println("90.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("90.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase91() {
		System.out.println("Running TestCase-91");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Bread (50grams)", actualResult);
        if(actualResult.contains("Bread")) {
        	System.out.println("91.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("91.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase92() {
		System.out.println("Running TestCase-92");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Lunch", "Rice (0.1cup)", actualResult);
        if(actualResult.contains("Rice")) {
        	System.out.println("92.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("92.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase93() {
		System.out.println("Running TestCase-93");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Idly (50grams)", actualResult);
        if(actualResult.contains("Idly")) {
        	System.out.println("93.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("93.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase94() {
		System.out.println("Running TestCase-94");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Dinner", "Wheat (50grams)", actualResult);
        if(actualResult.contains("Wheat")) {
        	System.out.println("94.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("94.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase95() {
		System.out.println("Running TestCase-95");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Pakora (50grams)", actualResult);
        if(actualResult.contains("Pakora")) {
        	System.out.println("95.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("95.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase96() {
		System.out.println("Running TestCase-96");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Lunch", "Shrimp (50grams)", actualResult);
        if(actualResult.contains("Shrimp")) {
        	System.out.println("96.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("96.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase97() {
		System.out.println("Running TestCase-97");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("97.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("97.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase98() {
		System.out.println("Running TestCase-98");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("98.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("98.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase99() {
		System.out.println("Running TestCase-99");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("99.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("99.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase100() {
		System.out.println("Running TestCase-100");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("100.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("100.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase101() {
		System.out.println("Running TestCase-101");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Chicken (200grams)", actualResult);
        if(actualResult.contains("Chicken")) {
        	System.out.println("101.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("101.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase102() {
		System.out.println("Running TestCase-102");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Bread (50grams)", actualResult);
        if(actualResult.contains("Bread")) {
        	System.out.println("102.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("102.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase103() {
		System.out.println("Running TestCase-103");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Lunch", "Rice (0.1cup)", actualResult);
        if(actualResult.contains("Rice")) {
        	System.out.println("103.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("103.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase104() {
		System.out.println("Running TestCase-104");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Idly (50grams)", actualResult);
        if(actualResult.contains("Idly")) {
        	System.out.println("104.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("104.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase105() {
		System.out.println("Running TestCase-105");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Dinner", "Wheat (50grams)", actualResult);
        if(actualResult.contains("Wheat")) {
        	System.out.println("105.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("105.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase106() {
		System.out.println("Running TestCase-106");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Pakora (50grams)", actualResult);
        if(actualResult.contains("Pakora")) {
        	System.out.println("106.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("106.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase107() {
		System.out.println("Running TestCase-107");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Lunch", "Shrimp (50grams)", actualResult);
        if(actualResult.contains("Shrimp")) {
        	System.out.println("107.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("107.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase108() {
		System.out.println("Running TestCase-108");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("108.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("108.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase109() {
		System.out.println("Running TestCase-109");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("109.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("109.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase110() {
		System.out.println("Running TestCase-110");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Chicken (200grams)", actualResult);
        if(actualResult.contains("Chicken")) {
        	System.out.println("110.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("110.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase111() {
		System.out.println("Running TestCase-111");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Bread (50grams)", actualResult);
        if(actualResult.contains("Bread")) {
        	System.out.println("111.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("111.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase112() {
		System.out.println("Running TestCase-112");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Lunch", "Rice (0.1cup)", actualResult);
        if(actualResult.contains("Rice")) {
        	System.out.println("112.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("112.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase113() {
		System.out.println("Running TestCase-113");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Idly (50grams)", actualResult);
        if(actualResult.contains("Idly")) {
        	System.out.println("113.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("113.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase114() {
		System.out.println("Running TestCase-114");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Dinner", "Wheat (50grams)", actualResult);
        if(actualResult.contains("Wheat")) {
        	System.out.println("114.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("114.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase115() {
		System.out.println("Running TestCase-115");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Pakora (50grams)", actualResult);
        if(actualResult.contains("Pakora")) {
        	System.out.println("115.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("115.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase116() {
		System.out.println("Running TestCase-116");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Lunch", "Shrimp (50grams)", actualResult);
        if(actualResult.contains("Shrimp")) {
        	System.out.println("116.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("116.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase117() {
		System.out.println("Running TestCase-117");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("117.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("117.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase118() {
		System.out.println("Running TestCase-118");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("118.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("118.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase119() {
		System.out.println("Running TestCase-119");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("119.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("119.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase120() {
		System.out.println("Running TestCase-120");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("120.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("120.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase121() {
		System.out.println("Running TestCase-121");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Chicken (200grams)", actualResult);
        if(actualResult.contains("Chicken")) {
        	System.out.println("121.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("121.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase122() {
		System.out.println("Running TestCase-122");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Bread (50grams)", actualResult);
        if(actualResult.contains("Bread")) {
        	System.out.println("122.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("122.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase123() {
		System.out.println("Running TestCase-123");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Lunch", "Rice (0.1cup)", actualResult);
        if(actualResult.contains("Rice")) {
        	System.out.println("123.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("123.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase124() {
		System.out.println("Running TestCase-124");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Idly (50grams)", actualResult);
        if(actualResult.contains("Idly")) {
        	System.out.println("124.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("124.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase125() {
		System.out.println("Running TestCase-125");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Dinner", "Wheat (50grams)", actualResult);
        if(actualResult.contains("Wheat")) {
        	System.out.println("125.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("125.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase126() {
		System.out.println("Running TestCase-26");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Pakora (50grams)", actualResult);
        if(actualResult.contains("Pakora")) {
        	System.out.println("126.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("126.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase127() {
		System.out.println("Running TestCase-127");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Lunch", "Shrimp (50grams)", actualResult);
        if(actualResult.contains("Shrimp")) {
        	System.out.println("127.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("127.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase128() {
		System.out.println("Running TestCase-128");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("128.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("28.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase129() {
		System.out.println("Running TestCase-129");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("129.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("129.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase130() {
		System.out.println("Running TestCase-130");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Chicken (200grams)", actualResult);
        if(actualResult.contains("Chicken")) {
        	System.out.println("130.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("130.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase131() {
		System.out.println("Running TestCase-131");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Bread (50grams)", actualResult);
        if(actualResult.contains("Bread")) {
        	System.out.println("131.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("131.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase132() {
		System.out.println("Running TestCase-132");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Lunch", "Rice (0.1cup)", actualResult);
        if(actualResult.contains("Rice")) {
        	System.out.println("132.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("132.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase133() {
		System.out.println("Running TestCase-133");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Idly (50grams)", actualResult);
        if(actualResult.contains("Idly")) {
        	System.out.println("133.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("133.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase134() {
		System.out.println("Running TestCase-134");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Dinner", "Wheat (50grams)", actualResult);
        if(actualResult.contains("Wheat")) {
        	System.out.println("134.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("134.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase135() {
		System.out.println("Running TestCase-135");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Pakora (50grams)", actualResult);
        if(actualResult.contains("Pakora")) {
        	System.out.println("135.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("135.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase136() {
		System.out.println("Running TestCase-136");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Lunch", "Shrimp (50grams)", actualResult);
        if(actualResult.contains("Shrimp")) {
        	System.out.println("136.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("136.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase137() {
		System.out.println("Running TestCase-137");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("137.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("137.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase138() {
		System.out.println("Running TestCase-138");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("138.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("138.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase139() {
		System.out.println("Running TestCase-139");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("139.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("139.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase140() {
		System.out.println("Running TestCase-140");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("140.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("140.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase141() {
		System.out.println("Running TestCase-141");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Chicken (200grams)", actualResult);
        if(actualResult.contains("Chicken")) {
        	System.out.println("141.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("141.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase142() {
		System.out.println("Running TestCase-142");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Bread (50grams)", actualResult);
        if(actualResult.contains("Bread")) {
        	System.out.println("142.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("142.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase143() {
		System.out.println("Running TestCase-143");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Lunch", "Rice (0.1cup)", actualResult);
        if(actualResult.contains("Rice")) {
        	System.out.println("143.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("143.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase144() {
		System.out.println("Running TestCase-144");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Idly (50grams)", actualResult);
        if(actualResult.contains("Idly")) {
        	System.out.println("144.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("144.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase145() {
		System.out.println("Running TestCase-145");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Dinner", "Wheat (50grams)", actualResult);
        if(actualResult.contains("Wheat")) {
        	System.out.println("145.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("145.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase146() {
		System.out.println("Running TestCase-146");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Pakora (50grams)", actualResult);
        if(actualResult.contains("Pakora")) {
        	System.out.println("146.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("146.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase147() {
		System.out.println("Running TestCase-147");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Lunch", "Shrimp (50grams)", actualResult);
        if(actualResult.contains("Shrimp")) {
        	System.out.println("147.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("147.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase148() {
		System.out.println("Running TestCase-148");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("148.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("148.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase149() {
		System.out.println("Running TestCase-149");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("149.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("149.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase150() {
		System.out.println("Running TestCase-150");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Chicken (200grams)", actualResult);
        if(actualResult.contains("Chicken")) {
        	System.out.println("150.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("150.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase151() {
		System.out.println("Running TestCase-151");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Bread (50grams)", actualResult);
        if(actualResult.contains("Bread")) {
        	System.out.println("151.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("151.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase152() {
		System.out.println("Running TestCase-152");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Lunch", "Rice (0.1cup)", actualResult);
        if(actualResult.contains("Rice")) {
        	System.out.println("152.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("152.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase153() {
		System.out.println("Running TestCase-153");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Idly (50grams)", actualResult);
        if(actualResult.contains("Idly")) {
        	System.out.println("153.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("153.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase154() {
		System.out.println("Running TestCase-154");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Dinner", "Wheat (50grams)", actualResult);
        if(actualResult.contains("Wheat")) {
        	System.out.println("154.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("154.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase155() {
		System.out.println("Running TestCase-155");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Pakora (50grams)", actualResult);
        if(actualResult.contains("Pakora")) {
        	System.out.println("155.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("155.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase156() {
		System.out.println("Running TestCase-156");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Lunch", "Shrimp (50grams)", actualResult);
        if(actualResult.contains("Shrimp")) {
        	System.out.println("156.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("1156.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase157() {
		System.out.println("Running TestCase-157");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("157.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("157.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase158() {
		System.out.println("Running TestCase-158");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("158.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("158.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase159() {
		System.out.println("Running TestCase-159");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("159.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("159.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase160() {
		System.out.println("Running TestCase-160");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("160.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("160.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase161() {
		System.out.println("Running TestCase-161");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Chicken (200grams)", actualResult);
        if(actualResult.contains("Chicken")) {
        	System.out.println("161.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("161.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase162() {
		System.out.println("Running TestCase-162");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Bread (50grams)", actualResult);
        if(actualResult.contains("Bread")) {
        	System.out.println("162.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("162.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase163() {
		System.out.println("Running TestCase-163");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Lunch", "Rice (0.1cup)", actualResult);
        if(actualResult.contains("Rice")) {
        	System.out.println("163.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("163.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase164() {
		System.out.println("Running TestCase-164");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Idly (50grams)", actualResult);
        if(actualResult.contains("Idly")) {
        	System.out.println("164.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("164.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase165() {
		System.out.println("Running TestCase-165");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Dinner", "Wheat (50grams)", actualResult);
        if(actualResult.contains("Wheat")) {
        	System.out.println("165.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("165.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase166() {
		System.out.println("Running TestCase-166");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Pakora (50grams)", actualResult);
        if(actualResult.contains("Pakora")) {
        	System.out.println("166.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("166.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase167() {
		System.out.println("Running TestCase-167");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Lunch", "Shrimp (50grams)", actualResult);
        if(actualResult.contains("Shrimp")) {
        	System.out.println("167.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("167.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase168() {
		System.out.println("Running TestCase-168");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("168.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("168.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase169() {
		System.out.println("Running TestCase-169");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("169.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("169.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase170() {
		System.out.println("Running TestCase-170");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Chicken (200grams)", actualResult);
        if(actualResult.contains("Chicken")) {
        	System.out.println("170.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("170.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase171() {
		System.out.println("Running TestCase-171");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Bread (50grams)", actualResult);
        if(actualResult.contains("Bread")) {
        	System.out.println("171.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("171.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase172() {
		System.out.println("Running TestCase-172");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Lunch", "Rice (0.1cup)", actualResult);
        if(actualResult.contains("Rice")) {
        	System.out.println("172.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("172.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase173() {
		System.out.println("Running TestCase-173");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Idly (50grams)", actualResult);
        if(actualResult.contains("Idly")) {
        	System.out.println("173.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("173.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase174() {
		System.out.println("Running TestCase-74");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Dinner", "Wheat (50grams)", actualResult);
        if(actualResult.contains("Wheat")) {
        	System.out.println("174.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("174.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase175() {
		System.out.println("Running TestCase-175");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Pakora (50grams)", actualResult);
        if(actualResult.contains("Pakora")) {
        	System.out.println("175.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("175.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase176() {
		System.out.println("Running TestCase-176");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Lunch", "Shrimp (50grams)", actualResult);
        if(actualResult.contains("Shrimp")) {
        	System.out.println("176.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("176.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase177() {
		System.out.println("Running TestCase-177");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("177.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("177.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase178() {
		System.out.println("Running TestCase-178");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("178.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("178.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase179() {
		System.out.println("Running TestCase-179");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("179.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("179.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase180() {
		System.out.println("Running TestCase-180");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("180.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("180.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase181() {
		System.out.println("Running TestCase-181");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Chicken (200grams)", actualResult);
        if(actualResult.contains("Chicken")) {
        	System.out.println("181.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("181.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase182() {
		System.out.println("Running TestCase-182");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Bread (50grams)", actualResult);
        if(actualResult.contains("Bread")) {
        	System.out.println("182.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("182.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase183() {
		System.out.println("Running TestCase-183");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Lunch", "Rice (0.1cup)", actualResult);
        if(actualResult.contains("Rice")) {
        	System.out.println("183.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("183.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase184() {
		System.out.println("Running TestCase-184");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Idly (50grams)", actualResult);
        if(actualResult.contains("Idly")) {
        	System.out.println("184.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("184.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase185() {
		System.out.println("Running TestCase-185");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Dinner", "Wheat (50grams)", actualResult);
        if(actualResult.contains("Wheat")) {
        	System.out.println("185.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("185.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase186() {
		System.out.println("Running TestCase-186");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Pakora (50grams)", actualResult);
        if(actualResult.contains("Pakora")) {
        	System.out.println("186.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("186.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase187() {
		System.out.println("Running TestCase-187");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Lunch", "Shrimp (50grams)", actualResult);
        if(actualResult.contains("Shrimp")) {
        	System.out.println("187.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("187.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase188() {
		System.out.println("Running TestCase-188");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("188.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("188.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase189() {
		System.out.println("Running TestCase-189");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("189.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("189.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase190() {
		System.out.println("Running TestCase-190");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Chicken (200grams)", actualResult);
        if(actualResult.contains("Chicken")) {
        	System.out.println("190.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("190.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase191() {
		System.out.println("Running TestCase-191");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Bread (50grams)", actualResult);
        if(actualResult.contains("Bread")) {
        	System.out.println("191.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("191.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase192() {
		System.out.println("Running TestCase-92");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Lunch", "Rice (0.1cup)", actualResult);
        if(actualResult.contains("Rice")) {
        	System.out.println("192.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("192.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase193() {
		System.out.println("Running TestCase-193");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Idly (50grams)", actualResult);
        if(actualResult.contains("Idly")) {
        	System.out.println("193.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("193.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase194() {
		System.out.println("Running TestCase-194");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Dinner", "Wheat (50grams)", actualResult);
        if(actualResult.contains("Wheat")) {
        	System.out.println("194.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("194.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase195() {
		System.out.println("Running TestCase-195");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Snacks", "Pakora (50grams)", actualResult);
        if(actualResult.contains("Pakora")) {
        	System.out.println("195.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("195.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase196() {
		System.out.println("Running TestCase-196");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Nonveg,Lunch", "Shrimp (50grams)", actualResult);
        if(actualResult.contains("Shrimp")) {
        	System.out.println("196.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("196.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase197() {
		System.out.println("Running TestCase-197");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("197.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("197.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase198() {
		System.out.println("Running TestCase-198");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("198.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("198.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase199() {
		System.out.println("Running TestCase-199");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Dosa (0.1cup)", actualResult);
        if(actualResult.contains("Dosa")) {
        	System.out.println("199.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("199.Test failed");
        }
        driver.closeApp();
	}
	@Test
	public void TestCase200() {
		System.out.println("Running TestCase-200");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView").getText();        
        assertEquals("Indian-Cuisine,Veg,Breakfast", "Broccoli (50grams)", actualResult);
        if(actualResult.contains("Broccoli")) {
        	System.out.println("200.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("200.Test failed");
        }
        driver.closeApp();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	
}
