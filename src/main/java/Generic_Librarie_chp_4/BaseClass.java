package Generic_Librarie_chp_4;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages_chap_4.ContactUsPage;
import pompages_chap_4.CoreJavaForSeleniumPage;
import pompages_chap_4.CoreJavaVideoPage;
import pompages_chap_4.HomePage;
import pompages_chap_4.SeleniumTrainingPage;
import pompages_chap_4.SkillraryDemoAppPage;
import pompages_chap_4.TestingPage;

public class BaseClass {
	protected propertiesFileutility property;
	protected Excelutility excel;
	protected webDriverUtility web;
	protected WebDriver driver;
	protected HomePage home;
	protected SkillraryDemoAppPage skillraryDemo;
	protected SeleniumTrainingPage selenium;
	protected TestingPage testing;
	protected CoreJavaForSeleniumPage corejava;
	protected CoreJavaVideoPage javavideo;
	protected ContactUsPage contact;
	protected long time;
	
//@BeforeSuite
//@BeforeTest
@BeforeClass
public void classConfiguration() {
	 property= new propertiesFileutility();
     excel= new Excelutility();
     web=new webDriverUtility();
     
     property.propertyFileInitialization(IConstantPath.PROPERTIES_FILE_PATH);
     excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
    
}
@BeforeMethod
public void methodConfiguration() {
 time=Long.parseLong(property.fetchproper("timeouts"));
driver=web.openApplication(property.fetchproper("BROWSER"),
		property.fetchproper("URL"), time);

home= new HomePage(driver);
Assert.assertTrue(home.getLogo().isDisplayed());
skillraryDemo= new SkillraryDemoAppPage(driver);
selenium= new SeleniumTrainingPage(driver);
corejava= new CoreJavaForSeleniumPage(driver);
javavideo=new CoreJavaVideoPage(driver);
testing=new TestingPage(driver);
contact=new ContactUsPage(driver);
}
@AfterMethod
public void methodTearDown() {
	web.quitBrowser();
	
}
@AfterClass
public void classTearDown() {
	excel.closeExcel();
}
//@AfterTest
//@AfterSuite
}
