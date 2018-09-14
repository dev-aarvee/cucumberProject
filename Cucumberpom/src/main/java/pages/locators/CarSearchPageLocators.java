package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarSearchPageLocators {
	
	@FindBy(how = How.XPATH, using = "//*[@id='makes']" )
	public WebElement carMakeDropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='models']" )
	public WebElement modelDropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='lcoations']" )
	public WebElement locationDropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='price-max']" )
	public WebElement priceDropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='search-submit']" )
	public WebElement findMyNextCarBtn;

}
