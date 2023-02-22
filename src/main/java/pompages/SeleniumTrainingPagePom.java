package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibraries.WebDriverUtility;


public class SeleniumTrainingPagePom {

	//Declaration
	@FindBy (xpath ="//h1[@class='page-header']")		
	private WebElement pageHeader;
	@FindBy (id="add")									private WebElement plusButton;
	@FindBy (xpath ="//button[text()=' Add to Cart']")	private WebElement addToCartButton;
	@FindBy (xpath ="//div[@id='callout']/span")		private WebElement itemAddedMessage;

	//Initialization
	public  SeleniumTrainingPagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	public void doubleClickPlusButton(WebDriverUtility web)	{
		web.doubleclickonElement(plusButton);
	}
	
	public void clickAddToCart() {
		addToCartButton.click();
	}
	
	public WebElement getItemAddedMessage() {
		return itemAddedMessage;	
	}
}
