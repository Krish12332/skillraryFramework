package TestScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_Librarie_chp_4.BaseClass;

public class ThirdTestCase extends BaseClass{
	@Test
	public void thirdTest() throws InterruptedException {
		SoftAssert soft= new SoftAssert();
		home.searchFor("core java for selenium");
		soft.assertEquals(corejava.getPageHeader(),"CORE JAVA FOR SELENIUM");
		corejava.clickCoreJavaForSeleniumLink();
		soft.assertEquals(javavideo.getPageHeader(), "core java for  selenium Training");
		javavideo.clickclosecookies();
		web.switchToFrame();
		javavideo.clickPlayButton();
		Thread.sleep(2000);
		javavideo.clickPauseButton();
		web.switchBackFromFrame();
		javavideo.clickAddToWhislist();
		soft.assertAll();
	}

}
