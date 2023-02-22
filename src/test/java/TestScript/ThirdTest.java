package TestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;




public class ThirdTest extends BaseClass
{
	@Test
	public void thirdTest() throws InterruptedException
	{
		SoftAssert soft=new SoftAssert();
		
		Thread.sleep(3000);
		home.searchFor("core java for selenium");
		soft.assertEquals(coreJava.getPageHeader(),"CORE JAVA FOR SELENIUM");
		
		coreJava.clickCoreJavaForSeleniumLink();
		soft.assertEquals(javaVideo.pageHeader(), "Core Java For Selenium Training");
		
		javaVideo.clickclosecookies();
		web.switchToFrame();
		javaVideo.clickPlayButton();
		Thread.sleep(2000);
		javaVideo.clickPauseButton();
		
		web.switchBackFromFrame();
		javaVideo.clickaddwishlist();
		
		soft.assertAll();
		
	}
}
