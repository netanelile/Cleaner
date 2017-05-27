import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ScrollsTo;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProfileViewer {
// Goes throe a profile and check maching parameters and assert if they are exists.
// if parameter does not match, user will be blocked

	private WebDriver driver;

	public ProfileViewer(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.cyberserve.android.atraf:id/menuButton")
	public WebElement _backButton;
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
	
	public void clickBack(){
		_backButton.click();
	}
	public void scrollToBlockButton(){
		
	}
	
	public void clickBlockButton(){
		
	}
	
	public void approuveBlockMessage(){
		
	}
	
	public void scrollToRemoveTracks(){
		
	}
	public void removeTracks(){
		_removeTracks.click();
		
	}
	
	public void blockUser(){
		scrollToBlockButton();
		clickBlockButton();
		approuveBlockMessage();
		scrollToRemoveTracks();
		removeTracks();
	}
	
	public boolean isHairExists(){
		return true;	
	}
	
	public boolean isBodyTypeExists(){
		return true;	
	}
	public boolean isBodyHairExists(){
		return true;	
	}
	public boolean isEyesExists(){
		return true;	
	}
	
	public boolean isHairMatch(){
		return true;	
	}
	
	public boolean isBodyTypeMatch(){
		return true;	
	}
	public boolean isBodyHairMatch(){
		return true;	
	}
	public boolean isEyesMatch(){
		return true;	
	}
	
	public void clickSendMessage(){
		
	}
	
	public boolean isFavorit(){
		return true;
	}
	
	public void AddFavorit(){
		
	}

}
