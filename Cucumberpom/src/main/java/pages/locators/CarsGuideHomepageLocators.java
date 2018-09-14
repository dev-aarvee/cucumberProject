package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomepageLocators {

	@FindBy(how = How.LINK_TEXT, using = "Cars For Sale" )
	public WebElement carsForSaleLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Sell My Car" )
	public WebElement sellMyCarsLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Car Reviews" )
	public WebElement carReviewsLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Cars Search" )
	public WebElement carsSearchLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Used Cars Search" )
	public WebElement usedCarsSearchLink;
	
	
}
