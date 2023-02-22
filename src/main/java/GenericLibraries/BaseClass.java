package GenericLibraries;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.CoreJavaForSeleniumPage;
import pompages.HomePagePom;
import pompages.SkillraryDemoAppPagePom;
import pompages.TestingPage;
import pompages.ContactUsPage;
import pompages.CoreJavaVedioPage;
import pompages.SeleniumTrainingPagePom;

public class BaseClass {
	protected PropertiesFileUtility property;
	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected HomePagePom home;
	protected SkillraryDemoAppPagePom skillraryDemo;
	protected ContactUsPage contactpage;
	protected TestingPage testing;
	protected CoreJavaForSeleniumPage coreJava;
	protected SeleniumTrainingPagePom selenium;
	protected CoreJavaVedioPage javaVideo;
	protected long time;
	
	//@BeforeSuite
	//@BeforeTest
	@BeforeClass
	       public void classConfiguration()
	       {
		   	 property= new PropertiesFileUtility();
		     excel= new ExcelUtility();
			 web= new WebDriverUtility();
		
		     
		     property.propertiesFileInitialization(IConstantPath.PROPERTIES_FILE_PATH);
		     excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
		     
	       }

	@BeforeMethod
	public void methodConfiguration() 
	{
		time=Long.parseLong(property.featchproperties("timeouts"));
		driver = web.openApplication(property.featchproperties("browser"),time,property.featchproperties("url"));
		home=new HomePagePom(driver);
		skillraryDemo = new SkillraryDemoAppPagePom(driver);
		selenium= new SeleniumTrainingPagePom(driver);
		coreJava=new CoreJavaForSeleniumPage(driver);
		javaVideo= new CoreJavaVedioPage(driver);
		testing=new TestingPage(driver);
		contactpage=new ContactUsPage(driver);
	}

	@AfterMethod
	    public void methodTearDown()
	    {
		   web.quitBrowser();
	    }
	@AfterClass
	     public void classTearDown()
	     {
		   excel.closeExcel();
	     }
       	
	// @AfterTest
	// @AfterSuite
}


	
