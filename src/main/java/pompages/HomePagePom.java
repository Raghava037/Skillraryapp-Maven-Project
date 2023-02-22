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
	@FindBy(xpath = "//*[@id=\"front-header\"]/div[3]/header/div/div/div[1]/div[2]/div[2]/form/input[1]")
	private WebElement searchTF;
	@FindBy(xpath = "//*[@id=\"front-header\"]/div[3]/header/div/div/div[1]/div[2]/div[2]")
	private WebElement searchTF2;
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
	public void search()
	{
		searchTF2.click();
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
