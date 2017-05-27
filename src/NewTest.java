import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.AfterClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class NewTest {
	// Create instance for Appium Driver
	AndroidDriver<WebElement> driver;
	 
		@BeforeClass
		public void Setup() throws MalformedURLException{
			Emulator emulator = new Emulator();
			
			emulator.startEmulator();
			AppiumServerJava appiumServer = new AppiumServerJava();
			appiumServer.startServer();
			
			DesiredCapabilities cap = new DesiredCapabilities();

			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "600");
			cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE , "com.cyberserve.android.atraf");
			cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY , "com.cyberserve.android.atraf.AtrafMain");
			cap.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY , "com.cyberserve.android.atraf.AtrafMain");
	 
			driver = new AndroidDriver<WebElement>( new URL("http://127.0.0.1:4723/wd/hub"), cap);
	 
		}
	 
		@Test
		public void SimpleTest() throws InterruptedException {
			
			Thread.sleep(15000);
			
			
			LogIn login = new LogIn(driver);
			
		//	ExplicitWait(login.mapping._username, 1000);
			
			login.logIn("PersonNewPerson", "qwe123qwe");
			
		}
		
		@AfterClass
		public void TearDown(){
			AppiumServerJava appiumServer = new AppiumServerJava();
			appiumServer.stopServer();
			
			Emulator emulator = new Emulator();	 
			emulator.stopEmulator();
		}
		
		public void ExplicitWait(WebElement element, int duration) {
			(new WebDriverWait(driver, duration)).until(ExpectedConditions.elementToBeClickable(element));
		}
		
		
	}
//TODO: Upload Project to GIT as a new Project V
//TODO: Open test Profile V
//TODO: Mapp all the needed elements
//TODO: LogIn + Assertions V
//TODO: Method that gets inside all the profiles in the grid.
//TODO: Method that check the desired parameters
//TODO: Method that send a message with images if there is a match.

