package pompages_chap_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaVideoPage {
//Declaration
	@FindBy(xpath="//h1")
	private WebElement pageHeader;
	@FindBy(xpath="//a[text()='X']")
	private WebElement clickcookies;
	@FindBy(xpath="//button[@aria-labl='Play']")
	private WebElement playButton;
	
	@FindBy(xpath="//button[@aria-labl='Pause']")
	private WebElement pauseButton;
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addToWhislistTab;
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement closecookiesIcon;
	
	//Initialization
	public CoreJavaVideoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public String getPageHeader() {
		return pageHeader.getText();
	}
	public void clickOnCookies() {
		 clickcookies.click();
	}
	
	public void clickPlayButton() {
		playButton.click();
	}
	public void clickPauseButton() {
		pauseButton.click();
	}
	public void clickAddToWhislist() {
		addToWhislistTab.click();
	
	}
	public void clickclosecookies() {
		closecookiesIcon.click();
	}
}
