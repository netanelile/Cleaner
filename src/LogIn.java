import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LogIn {
	
	//private AndroidDriver<WebElement> driver;

	public LogIn(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	//Mapping mapping = new Mapping();
	
//	public void ExplicitWait(WebElement element, int duration) {
//		(new WebDriverWait(driver, duration)).until(ExpectedConditions.elementToBeClickable(element));
//	}
	
	@AndroidFindBy(id = "com.cyberserve.android.atraf:id/userNameEdit")
	public WebElement _username;
	
	@AndroidFindBy(id = "com.cyberserve.android.atraf:id/passwordEditText")
	public WebElement _password;
	
	@AndroidFindBy(id = "com.cyberserve.android.atraf:id/loginButton")
	public WebElement _loginButton;
	
	@AndroidFindBy(id = "com.cyberserve.android.atraf:drawable/nearme")
	public WebElement _NearByButton;
	
	private void insert_UserName(String username) {
		System.out.println("Add UserName: " + username);
		
		_username.sendKeys(username);

	}
	
	private void insert_UserPassWrd(String password) {
		System.out.println("Add Password: *******");
		
		_password.sendKeys(password);

	}
	
	private void click_LogIn() {
		System.out.println("Click LogIn Button");
		_loginButton.click();
		
	}
	
	private boolean is_Login_ScreenDisplay(){
		System.out.println("Check if Login Screen Is display");
		boolean isDisplayed = false;
		try{
		    if (_username.isDisplayed()){
			    isDisplayed = true;
			    System.out.println("Login Screen Is Display");
		    } // End of IF
		} // End of Try
		catch (Exception e) {
			isDisplayed = false;
			System.out.println("Login Screen Is NOT Display");
		}
		
		return isDisplayed;
	}
	
	private boolean is_NearBy_ScreenDisplay(){
		System.out.println("Check if Main Screen Is display");
		boolean isDisplayed = false;
		try{
		    if (_NearByButton.isDisplayed()){
			    isDisplayed = true;
			    System.out.println("Main Screen Is Display");
		    }//End of if
		}//and of try
		    catch(Exception e) {
			    isDisplayed = false;
			    System.out.println("Main Screen Is NOT Display");
		    } //End of Catch
		
		
		return isDisplayed;
	}
	
	public void logIn(String username, String password){
		System.out.println("Login sequence:");
		if (is_Login_ScreenDisplay()) {
			
			insert_UserName(username);
			insert_UserPassWrd(password);
			click_LogIn();	
			
		} else if (is_NearBy_ScreenDisplay()) {
            System.out.println("User is alrady logged in");
		}
		else{
			System.out.println("Something went wrong! User Is NOT logged in!");
		}
		
	}


}
