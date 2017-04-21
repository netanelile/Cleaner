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


	@AndroidFindBy(id = "")
	public WebElement _;
	

}
