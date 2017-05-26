import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProfileViewer {

	private WebDriver driver;

	public ProfileViewer(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


	@AndroidFindBy (uiAutomator = "UiSelector().description(\"Link\")")
	public WebElement _removeTracks;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"Hide & Block Link\")")
	public WebElement _block;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"Status:Single\")")
	public WebElement _status_Single;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"Hair:black\")")
	public WebElement _hair_Black;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"Body Type:Average\")")
	public WebElement _bodyType_Average;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"Eye color:brown\")")
	public WebElement _EyeColor_brown;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"Religion:Jewish\")")
	public WebElement _religion_Jewish;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"chat-Red@2x\")")
	public WebElement _messageIcon;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"Body Hair:None\")")
	public WebElement _bodyHair_None;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"Body Type:Defined\")")
	public WebElement _bodyType_Defined;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"+\")")
	public WebElement _plusIcon;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"\")")
	public WebElement _;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"\")")
	public WebElement _;
	

}
