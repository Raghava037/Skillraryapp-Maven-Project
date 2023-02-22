package TestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;



public class FirstTest extends BaseClass {
	@Test
	public void firstTest() {
		SoftAssert soft = new SoftAssert();
		home.ClickGears();
		home.ClickSkillrarydemoApp();
		web.handlechildBrowser();

		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());

		skillraryDemo.mouseHoverToCourse(web);
		skillraryDemo.clickSeleniumTraining();

		soft.assertEquals(selenium.getPageHeader(), "Selenium Training");
		selenium.doubleClickPlusButton(web);
		selenium.clickAddToCart();
		web.handleAlert();
		web.explicitwait(time, selenium.getItemAddedMessage());
		web.takescreenshot();
		soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());

		soft.assertAll();

	}

}