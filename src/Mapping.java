import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Mapping {
	//private AndroidDriver<WebElement> driver;

	public Mapping(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
		}
//	
//	public AndroidDriver<WebElement> getDriver() {
//		return driver;
//	}
//
//	public void setDriver(AndroidDriver<WebElement> driver) {
//		this.driver = driver;
//	}

	@AndroidFindBy(id = "com.cyberserve.android.atraf:id/userNameEdit")
	public static WebElement _username;
	
	@AndroidFindBy(id = "com.cyberserve.android.atraf:id/passwordEditText")
	public static WebElement _password;
	
	@AndroidFindBy(id = "com.cyberserve.android.atraf:id/loginButton")
	public static WebElement _loginButton;
	
//	@AndroidFindBy(id = "")
//	public static WebElement _;
//	

}
