package TestScript;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;



public class FourthTest extends BaseClass {

	@Test
	public void firstTest()
	{
		SoftAssert soft=new SoftAssert();
		home.ClickGears();
		home.ClickSkillrarydemoApp();
		web.handlechildBrowser();
	
		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
		
		web.scrollToElement(skillraryDemo.contact());
		skillraryDemo.clickContactUs();
		
		soft.assertTrue(contactpage.getpageHeader().isDisplayed());
		List<String> data=excel.fetchDataFromExcel("sheet1");
		contactpage.submitDetails(data.get(0), data.get(1), data.get(2), data.get(3));
		
		soft.assertAll();
		
		
	}
}
