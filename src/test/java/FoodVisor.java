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

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FoodVisor {
	AndroidDriver<AndroidElement> driver;
	@Before
	public void setUp() throws MalformedURLException {
		
		System.out.println("Running Automated Test cases on FOODVISOR AI Mobile Application");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability("platformName", "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "R5CTA0VRF1P");
		dc.setCapability("appPackage", "io.foodvisor.foodvisor");
        dc.setCapability("appActivity", "io.foodvisor.foodvisor.app.main.MainActivity");
		dc.setCapability("noReset", "true");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<AndroidElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Journal\"]/android.widget.FrameLayout/android.widget.ImageView").click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.Button").click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Photo\"]/android.widget.TextView").click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElementByXPath("").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	
	@Test
	public void TestCase1() {
		System.out.println("Running TestCase-1");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
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
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks", "Burrito", actualResult);
        if(actualResult.contains("Burrito")) {
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
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks", "Toastadas", actualResult);
        if(actualResult.contains("Toastadas")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase4() {
		System.out.println("Running TestCase-4");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks", "Tamales", actualResult);
        if(actualResult.contains("Tamales")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	
	@Test
	public void TestCase5() {
		System.out.println("Running TestCase-5");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas,Chilaquiles", "Chilaquiles", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase6() {
		System.out.println("Running TestCase-6");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase7() {
		System.out.println("Running TestCase-7");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase8() {
		System.out.println("Running TestCase-8");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	
	@Test
	public void TestCase9() {
		System.out.println("Running TestCase-9");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	
	@Test
	public void TestCase10() {
		System.out.println("Running TestCase-10");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase11() {
		System.out.println("Running TestCase-11");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase12() {
		System.out.println("Running TestCase-12");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase13() {
		System.out.println("Running TestCase-13");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase14() {
		System.out.println("Running TestCase-14");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase15() {
		System.out.println("Running TestCase-15");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase16() {
		System.out.println("Running TestCase-16");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase17() {
		System.out.println("Running TestCase-17");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase18() {
		System.out.println("Running TestCase-18");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase19() {
		System.out.println("Running TestCase-19");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase20() {
		System.out.println("Running TestCase-20");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase21() {
		System.out.println("Running TestCase-21");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase22() {
		System.out.println("Running TestCase-22");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase23() {
		System.out.println("Running TestCase-23");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase24() {
		System.out.println("Running TestCase-24");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	@Test
	public void TestCase25() {
		System.out.println("Running TestCase-25");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	@Test
	public void TestCase26() {
		System.out.println("Running TestCase-26");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	@Test
	public void TestCase27() {
		System.out.println("Running TestCase-27");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}

	@Test
	public void TestCase28() {
		System.out.println("Running TestCase-28");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase29() {
		System.out.println("Running TestCase-29");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase30() {
		System.out.println("Running TestCase-30");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}		
	
	@Test
	public void TestCase31() {
		System.out.println("Running TestCase-31");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase32() {
		System.out.println("Running TestCase-32");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase33() {
		System.out.println("Running TestCase-33");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase34() {
		System.out.println("Running TestCase-34");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase35() {
		System.out.println("Running TestCase-35");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase36() {
		System.out.println("Running TestCase-36");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	@Test
	public void TestCase37() {
		System.out.println("Running TestCase-37");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	@Test
	public void TestCase38() {
		System.out.println("Running TestCase-38");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase39() {
		System.out.println("Running TestCase-39");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase40() {
		System.out.println("Running TestCase-40");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase41() {
		System.out.println("Running TestCase-41");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase42() {
		System.out.println("Running TestCase-42");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase43() {
		System.out.println("Running TestCase-43");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase44() {
		System.out.println("Running TestCase-44");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase45() {
		System.out.println("Running TestCase-45");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase46() {
		System.out.println("Running TestCase-46");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	
	@Test
	public void TestCase47() {
		System.out.println("Running TestCase-47");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase48() {
		System.out.println("Running TestCase-48");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase49() {
		System.out.println("Running TestCase-49");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase50() {
		System.out.println("Running TestCase-50");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}

	@Test
	public void TestCase51() {
		System.out.println("Running TestCase-51");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase52() {
		System.out.println("Running TestCase-52");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase53() {
		System.out.println("Running TestCase-53");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	


	@Test
	public void TestCase54() {
		System.out.println("Running TestCase-54");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase55() {
		System.out.println("Running TestCase-55");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	


	@Test
	public void TestCase56() {
		System.out.println("Running TestCase-56");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase57() {
		System.out.println("Running TestCase-57");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase58() {
		System.out.println("Running TestCase-58");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase59() {
		System.out.println("Running TestCase-59");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase60() {
		System.out.println("Running TestCase-60");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	

@Test
	public void TestCase61() {
		System.out.println("Running TestCase-61");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("1.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("1.Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase62() {
		System.out.println("Running TestCase-62");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("1.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("1.Test failed");
        }
        driver.closeApp();
	}
	
	
	
	@Test
	public void TestCase63() {
		System.out.println("Running TestCase-63");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("2.Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("2.Test failed");
        }
        driver.closeApp();
	}
	
	
	
	@Test
	public void TestCase64() {
		System.out.println("Running TestCase-64");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase65() {
		System.out.println("Running TestCase-65");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	
	@Test
	public void TestCase66() {
		System.out.println("Running TestCase-66");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase67() {
		System.out.println("Running TestCase-67");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase68() {
		System.out.println("Running TestCase-68");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase69() {
		System.out.println("Running TestCase-69");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	
	@Test
	public void TestCase70() {
		System.out.println("Running TestCase-70");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	
	@Test
	public void TestCase71() {
		System.out.println("Running TestCase-71");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase72() {
		System.out.println("Running TestCase-72");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase73() {
		System.out.println("Running TestCase-73");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase74() {
		System.out.println("Running TestCase-74");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase75() {
		System.out.println("Running TestCase-75");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase76() {
		System.out.println("Running TestCase-76");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase77() {
		System.out.println("Running TestCase-77");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase78() {
		System.out.println("Running TestCase-78");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase79() {
		System.out.println("Running TestCase-79");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase80() {
		System.out.println("Running TestCase-80");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase81() {
		System.out.println("Running TestCase-81");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase82() {
		System.out.println("Running TestCase-82");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase83() {
		System.out.println("Running TestCase-83");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase84() {
		System.out.println("Running TestCase-84");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase85() {
		System.out.println("Running TestCase-85");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	@Test
	public void TestCase86() {
		System.out.println("Running TestCase-86");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	@Test
	public void TestCase87() {
		System.out.println("Running TestCase-87");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	@Test
	public void TestCase88() {
		System.out.println("Running TestCase-88");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}

	@Test
	public void TestCase89() {
		System.out.println("Running TestCase-89");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase90() {
		System.out.println("Running TestCase-90");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase91() {
		System.out.println("Running TestCase-91");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}		
	
	@Test
	public void TestCase92() {
		System.out.println("Running TestCase-92");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase93() {
		System.out.println("Running TestCase-93");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase94() {
		System.out.println("Running TestCase-94");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase95() {
		System.out.println("Running TestCase-95");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase96() {
		System.out.println("Running TestCase-96");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase97() {
		System.out.println("Running TestCase-97");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	@Test
	public void TestCase98() {
		System.out.println("Running TestCase-98");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase99() {
		System.out.println("Running TestCase-99");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase100() {
		System.out.println("Running TestCase-100");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase101() {
		System.out.println("Running TestCase-101");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase102() {
		System.out.println("Running TestCase-102");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase103() {
		System.out.println("Running TestCase-103");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase104() {
		System.out.println("Running TestCase-104");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase105() {
		System.out.println("Running TestCase-105");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase106() {
		System.out.println("Running TestCase-106");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	
	@Test
	public void TestCase107() {
		System.out.println("Running TestCase-107");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase108() {
		System.out.println("Running TestCase-108");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase109() {
		System.out.println("Running TestCase-109");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase110() {
		System.out.println("Running TestCase-110");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}

	@Test
	public void TestCase111() {
		System.out.println("Running TestCase-111");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase112() {
		System.out.println("Running TestCase-112");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase113() {
		System.out.println("Running TestCase-113");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	


	@Test
	public void TestCase114() {
		System.out.println("Running TestCase-114");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase115() {
		System.out.println("Running TestCase-115");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	


	@Test
	public void TestCase116() {
		System.out.println("Running TestCase-116");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase117() {
		System.out.println("Running TestCase-117");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase118() {
		System.out.println("Running TestCase-118");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase119() {
		System.out.println("Running TestCase-119");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase120() {
		System.out.println("Running TestCase-120");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}

		
	@Test
	public void TestCase121() {
		System.out.println("Running TestCase-121");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase122() {
		System.out.println("Running TestCase-122");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase123() {
		System.out.println("Running TestCase-123");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	
	@Test
	public void TestCase124() {
		System.out.println("Running TestCase-124");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	@Test
	public void TestCase125() {
		System.out.println("Running TestCase-125");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	@Test
	public void TestCase126() {
		System.out.println("Running TestCase-126");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	@Test
	public void TestCase127() {
		System.out.println("Running TestCase-127");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}

	@Test
	public void TestCase128() {
		System.out.println("Running TestCase-128");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase129() {
		System.out.println("Running TestCase-129");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase130() {
		System.out.println("Running TestCase-130");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}		
	
	@Test
	public void TestCase131() {
		System.out.println("Running TestCase-131");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase132() {
		System.out.println("Running TestCase-132");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase133() {
		System.out.println("Running TestCase-133");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase134() {
		System.out.println("Running TestCase-134");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase135() {
		System.out.println("Running TestCase-135");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase136() {
		System.out.println("Running TestCase-136");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	@Test
	public void TestCase137() {
		System.out.println("Running TestCase-137");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}
	
	@Test
	public void TestCase138() {
		System.out.println("Running TestCase-138");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase139() {
		System.out.println("Running TestCase-139");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase140() {
		System.out.println("Running TestCase-140");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase141() {
		System.out.println("Running TestCase-141");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase142() {
		System.out.println("Running TestCase-142");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase143() {
		System.out.println("Running TestCase-143");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase144() {
		System.out.println("Running TestCase-144");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase145() {
		System.out.println("Running TestCase-145");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase146() {
		System.out.println("Running TestCase-146");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	
	@Test
	public void TestCase147() {
		System.out.println("Running TestCase-147");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase148() {
		System.out.println("Running TestCase-148");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
	@Test
	public void TestCase149() {
		System.out.println("Running TestCase-149");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase150() {
		System.out.println("Running TestCase-150");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}

	@Test
	public void TestCase151() {
		System.out.println("Running TestCase-151");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase152() {
		System.out.println("Running TestCase-152");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase153() {
		System.out.println("Running TestCase-153");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	


	@Test
	public void TestCase154() {
		System.out.println("Running TestCase-154");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase155() {
		System.out.println("Running TestCase-155");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	


	@Test
	public void TestCase156() {
		System.out.println("Running TestCase-156");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase157() {
		System.out.println("Running TestCase-157");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase158() {
		System.out.println("Running TestCase-158");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase159() {
		System.out.println("Running TestCase-159");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	

	@Test
	public void TestCase160() {
		System.out.println("Running TestCase-160");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String actualResult = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View").getText();        
        assertEquals("Mexican-Cuisine,veg,Snacks,Burrito,Tacos,Toastadas", "Tacos", actualResult);
        if(actualResult.contains("Tacos")) {
        	System.out.println("Test passed. Actual Result is:\n"+ actualResult);
        }else{
        	System.out.println("Test failed");
        }
        driver.closeApp();
	}	
	
}
