package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import utils.SeleniumWebdriver;

public class CarsSearchPageActions {

	CarSearchPageLocators carSearchPageLocators = null;
	
	public CarsSearchPageActions()
	{
		this.carSearchPageLocators = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumWebdriver.getDriver(), carSearchPageLocators);
	}
	
	public void SelectCarMake(String carBrand)
	{
		new Select(carSearchPageLocators.carMakeDropdown).selectByVisibleText(carBrand);
	}
	
	public void SelectCarModel(String carModel)
	{
		new Select(carSearchPageLocators.modelDropdown).selectByVisibleText(carModel);
	}
	
	public void SelectLocation(String location)
	{
		new Select(carSearchPageLocators.locationDropdown).selectByVisibleText(location);
	}
	
	public void SelectPrice(String price)
	{
		new Select(carSearchPageLocators.priceDropdown).selectByVisibleText(price);
	}
	
	public void SearchCar()
	{
		carSearchPageLocators.findMyNextCarBtn.click();
	}
}
