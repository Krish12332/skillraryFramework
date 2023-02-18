package pompages_chap_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//Declaration
	@FindBy(xpath="//img[@alt='skillRary']")
	private WebElement logo;
	@FindBy(name="q")
	private WebElement searchTF;
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchButton;
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement GearTab;
	@FindBy(xpath="//ul[contains(@class,'dropdown-menu')]/descendant::a[text()=' skillRary Demo APP']")
    private WebElement demoAppLink;

//Initialization
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

//utilization
public WebElement getLogo() {
	return logo;
}
public void searchFor(String data) {
	searchTF.sendKeys(data);
	
}
public void clickSearchButton() {
	searchButton.click();
}
public void clickGears() {
	GearTab.click();
}
public void clickskillrarydemoApp() {
	demoAppLink.click();
}
}