package stepdef;

import java.util.List;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import utils.SeleniumWebdriver;

public class SearchCarsSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions();

	@Given("^I am on homepage of \"([^\"]*)\" of CarsGuide Website$")
	public void i_am_on_homepage_of_of_CarsGuide_Website(String websiteURL) throws Throwable {
	   SeleniumWebdriver.openPage(websiteURL);
	}

	@When("^I move to the menu$")
	public void i_move_to_the_menu(List<String> list) throws Throwable {
	    String menu = list.get(1);
	    carsGuideHomePageActions.moveToCarsForSaleMenu();
	}

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String searchCars) throws Throwable {
		carsGuideHomePageActions.clickOnSearchCarsMenu();
	}

	@And("^select car brand as \"([^\"]*)\" from car drop down$")
	public void select_car_brand_as_from_car_drop_down(String carBrand) throws Throwable {
		carsSearchPageActions.SelectCarMake(carBrand);
	}

	@And("^select model as \"([^\"]*)\" from model drop down$")
	public void select_model_as_from_model_drop_down(String carModel) throws Throwable {
		carsSearchPageActions.SelectCarModel(carModel);
	}

	@And("^select location as \"([^\"]*)\" from location drop down$")
	public void select_location_as_from_location_drop_down(String location) throws Throwable {
		carsSearchPageActions.SelectLocation(location);
	}

	@And("^select price as \"([^\"]*)\" from price drop down$")
	public void select_price_as_from_price_drop_down(String price) throws Throwable {
		carsSearchPageActions.SelectPrice(price);
	}

	@And("^click on Find_My_Next_Car button$")
	public void click_on_Find_My_Next_Car_button() throws Throwable {
		carsSearchPageActions.SearchCar();
	}

	@Then("^I should see list of search cars$")
	public void i_should_see_list_of_search_cars() throws Throwable {
	
	}

	@And("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String arg1) throws Throwable {
	
	}

	
}
