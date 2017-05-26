import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MessageHandler {

	private WebDriver driver;

	public MessageHandler(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


	@AndroidFindBy (uiAutomator = "UiSelector().description(\"\")")
	public WebElement _;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"\")")
	public WebElement _;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"\")")
	public WebElement _;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"\")")
	public WebElement _;
	

}
