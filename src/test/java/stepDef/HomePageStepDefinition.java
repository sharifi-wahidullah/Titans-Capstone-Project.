package stepDef;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.HomePageObject;
import utilities.WebDriverUtility;

public class HomePageStepDefinition extends Base {

	HomePageObject homePage = new HomePageObject();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {

	}

	@When("User click on Currency")
	public void user_click_on_currency() {
		homePage.clickOnCurrenyOption();
		logger.info("User clicked on currency option");
		WebDriverUtility.hardWait();

	}

	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePage.clickOnEruo();
		logger.info("User clicked on Euro currency");
		WebDriverUtility.hardWait();

	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		Assert.assertTrue(homePage.verifyCurrencyChanged());
		logger.info("User validate Currency changed to Euro");
		WebDriverUtility.hardWait();
		WebDriverUtility.takeScreenShot();

	}

//	homepage 2 User empty shopping cart message displays

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePage.clickOnShoppingCartOption();
		logger.info("User clicked on Shopping Cart Option");
		WebDriverUtility.hardWait();
	}

	@Then("{string} message should display")
	public void message_should_display(String string) {
		Assert.assertTrue(homePage.verifyShoppingCartMessage());
		logger.info("User saw shopping cart message");
		WebDriverUtility.hardWait();
		WebDriverUtility.takeScreenShot();
	}

}
