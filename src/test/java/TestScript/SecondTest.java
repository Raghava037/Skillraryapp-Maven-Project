package TestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;
import pompages.SkillraryDemoAppPagePom;

public class SecondTest extends BaseClass
{
	@Test
	public void secondTest()
	{
		SoftAssert soft=new SoftAssert();
		home.ClickGears();
		home.ClickSkillrarydemoApp();
		web.handlechildBrowser();
		
		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
		
		skillraryDemo.selectCategory(web, 1);
		soft.assertEquals(testing.getPageHeader(),"Testing");
		
		web.dragAnddropElement(testing.getSeleniumImage(), testing.getCartArea());
		web.scrollToElement(testing.getFacebookIcon());
		testing.clickFacebookIcon();
		soft.assertAll();
		
	}

}
