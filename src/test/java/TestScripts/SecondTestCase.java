package TestScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_Librarie_chp_4.BaseClass;

public class SecondTestCase extends BaseClass{
	@Test
	
public void secondTest() {
		SoftAssert soft= new SoftAssert();
		home.clickGears();
		home.clickskillrarydemoApp();
		web.handleChildBrowser();
		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
		skillraryDemo.selectCategory(web, 1);
		soft.assertEquals(testing.getPageHeader(),"Testing");
		web.dragAndDropElement(testing.getSeleniumImage(),testing.getCartArea());
		web.scrollToElement(testing.getFacebookIcon());
		testing.clickFacebookIcon();
		
		soft.assertAll();
	}

}
