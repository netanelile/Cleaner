import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.util.log.Log;

import io.appium.java_client.ScrollsTo;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProfileViewer {
// Goes throe a profile and check maching parameters and assert if they are exists.
// if parameter does not match, user will be blocked

	public ProfileViewer(AndroidDriver<WebElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
	}
	AndroidDriver<WebElement> driver;
	
	@AndroidFindBy(id = "com.cyberserve.android.atraf:id/menuButton")
	public WebElement _backButton;
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"Link\")")
	public WebElement _removeTracks;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"חסום והסתר Link\")")
	public WebElement _block;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"סטטוס:רווק\")")
	public WebElement _status_Single;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"שיער:שטני\")")
	public WebElement _hair_Shateni;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"מבנה גוף:רגיל\")")
	public WebElement _bodyType_Average;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"עיניים:חומות\")")
	public WebElement _EyeColor_brown;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"סטטוס:רווק\")")
	public WebElement _religion_Jewish;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"chat-Red@2x\")")
	public WebElement _messageIcon;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"שיער גוף:קצת\")")
	public WebElement _bodyHair_Some;
	
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"+\")")
	public WebElement _plusIcon;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"חסום\")")
			public WebElement _approuveBlockMessage;
	
	@AndroidFindBy (uiAutomator = "UiSelector().description(\"הוסף פיבוריט Link\")")
	public WebElement _addToFavorits;
	
	@AndroidFindBy (xpath = ("//android.view.View@index='1']"))
	public WebElement _importantIfno;
	
	@AndroidFindBy(xpath = ("//android.view.View[contains(@content-desc,'38')]"))
	public WebElement _userinfo;
	
	public void clickOnUser(int index)throws InterruptedException{
		List <WebElement> usersLis = driver.findElementsByClassName("android.widget.RelativeLayout");
		System.out.println("Clicking on user number " + index);
		usersLis.get(index).click();
		Thread.sleep(1500);
	}
	
	
	public void clickBack(){
		_backButton.click();
	}
	public void scrollToBlockButton(){
		
	}
	
	public void getUserInfo() {
//		List <WebElement> usersLis = driver.findElementsByClassName("android.view.View");
		System.out.println("User Info: " + _userinfo.getAttribute("contentDescription"));
		
		
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
