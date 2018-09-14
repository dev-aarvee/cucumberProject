package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomepageLocators;
import utils.SeleniumWebdriver;

public class CarsGuideHomePageActions {
	
	CarsGuideHomepageLocators carsGuideHomepageLocators = null;
	
	public CarsGuideHomePageActions()
	{
		this.carsGuideHomepageLocators = new CarsGuideHomepageLocators();
		PageFactory.initElements(SeleniumWebdriver.getDriver(), carsGuideHomepageLocators);
	}
	
	public void moveToCarsForSaleMenu()
	{
		new Actions(SeleniumWebdriver.getDriver()).moveToElement(carsGuideHomepageLocators.carsForSaleLink);
	}
	
	public void clickOnSearchCarsMenu()
	{
		carsGuideHomepageLocators.carsSearchLink.click();
	}
	
	public void clickOnUsedCarsSearchMenu()
	{
		carsGuideHomepageLocators.usedCarsSearchLink.click();
	}
}
