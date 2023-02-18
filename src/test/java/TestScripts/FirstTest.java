package TestScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_Librarie_chp_4.BaseClass;


public class FirstTest extends BaseClass {
	@Test	
	public void firtstTest() {
		SoftAssert soft=new SoftAssert();
		
		home.clickGears();
		home.clickskillrarydemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
		skillraryDemo.mouseHoverTocourse(web);
		skillraryDemo.clickSeleniumTraining();
		
		soft.assertEquals(selenium.getPageHeader(),"selenium Training" );
		selenium.doubleClickplusButton(web);
		selenium.clickAddToCart();
		web.handleAlert();
		web.explicitwait(time, selenium.getItemAddedMessage());
		web.takeScreenshot();
		soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
		soft.assertAll();
	}

}
