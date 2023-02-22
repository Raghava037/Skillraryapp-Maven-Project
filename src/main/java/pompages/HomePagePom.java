package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePagePom {

	//Declaration
	@FindBy(xpath="//img[@alt='SkillRary']")	
	private WebElement logo;
	@FindBy(xpath = "//input[@type=\"search\"]")							
	private WebElement searchTF;
	@FindBy(xpath="//input[@value='go']")		
	private WebElement searchButton;
	@FindBy(xpath="//a[text()=' GEARS ']")		
	private WebElement gearsTab;
	@FindBy(xpath="(//a[@target=\"_blank\"])[16]")
	private WebElement demoAppLink;
	
	//Initialization
	public HomePagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getLogo()	{
		return logo;
		}
	
	public void searchFor(String data) {
		searchTF.sendKeys(data);
		searchButton.click();
	}
	
	public void ClickGears() {
		gearsTab.click();
	}
	
	public void ClickSkillrarydemoApp() {
		demoAppLink.click();
	}
}
