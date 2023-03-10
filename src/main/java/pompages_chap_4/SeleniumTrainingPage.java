package pompages_chap_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Librarie_chp_4.webDriverUtility;

public class SeleniumTrainingPage {

	//Declaration
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageHeader;
	@FindBy(id="add")
	private WebElement plusButton;
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addToCartButton;
	@FindBy(xpath="//div[@id='callout']/span")
	private WebElement itemAddedMessage;
	
	//initialization
	public SeleniumTrainingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getPageHeader() {
		return pageHeader;
	}
	public void doubleClickplusButton(webDriverUtility web) {
	web.doubleClicOnElement(plusButton);
	}
	public void clickAddToCart() {
		addToCartButton.click();
	}
	public WebElement getItemAddedMessage() {
		return itemAddedMessage;
	}
}
	
