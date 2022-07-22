package stepDef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.DesktopPageObject;
import utilities.WebDriverUtility;

public class DesktopPageStepDefinition extends Base {

	DesktopPageObject desktop = new DesktopPageObject();

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktop.moveToDesktopOption();
		logger.info("User move to Desktop Option");

	}

	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktop.clickonshowDesktopOption();
		logger.info("User clicked on Show all desktop option");

	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> desktopsElements = desktop.isDesktopItemsPresent();
		for (WebElement element : desktopsElements) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title") + "is present");
		}

		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}

	@And("User click  ADD TO CART option on HP LP3065item")
	public void user_click_add_to_cart_option_on_hp_lp3065item() {

		desktop.clickAddToCartOption();
		logger.info("User clicked on Add to Cart Option");

		WebDriverUtility.hardWait();
	}

	@And("User select quantity {string}")
	public void user_select_quantity(String quant) {
		desktop.slectQuantity(quant);
		logger.info("User selected quantity 1");
		WebDriverUtility.hardWait();
	}

	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktop.clickAddToCartButton();
		logger.info("User clicked on Add to cart Button");
		WebDriverUtility.hardWait();

	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(String mess) {
		Assert.assertTrue(desktop.isDisplyedAddToCartSuccessMessage());
		logger.info("User saw Success message");
		WebDriverUtility.takeScreenShot();
	}

	// Third scenario

	// ADD EOS 5D CAMERA TO CART SCENARIO

	@When("User click ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktop.AddCameraToCart();
		logger.info("user clicked on add to cart");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}

	@And("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktop.userSelectRedColor();
		logger.info("user Selected Red color");
		WebDriverUtility.takeScreenShot();

		WebDriverUtility.hardWait();
		}
	

	@And("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
		WebDriverUtility.takeScreenShot();

	}

	@Then("User should see a success message {string}")
	public void user_should_see_a_success_message2(String string) {
		desktop.goodMessage();
		logger.info("User saw success message");
	}

/// DesktopTab4   ---------------

	@And("User click on Canon EOS5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktop.clickOnCamera();
		logger.info("user clicked on EOS Camera");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
		}
	

	@And("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktop.selectviewLink();
		logger.info("user clicked on view link");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}

	@And("User fill the review information with below information")
	public void user_fill_teh_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> reviewInformation = dataTable.asMaps(String.class, String.class);
		desktop.NameField(reviewInformation.get(0).get("yourname"));
		desktop.reviewField(reviewInformation.get(0).get("yourReview"));
		desktop.selectRatingOption(reviewInformation.get(0).get("Rating"));
		logger.info("user selected the rating");
		WebDriverUtility.takeScreenShot();
		
		WebDriverUtility.hardWait();
	}
	
	@And("User click on ContinueButton")
	public void user_click_on_continueButton() {
		desktop.pleaseClickContinue();
		logger.info("User clicked on continue button");
	
		WebDriverUtility.hardWait();
	}
	
	
	 @Then("User should see a message with {string}")
	 public void user_should_see_a_message_with(String messs) {
		 desktop.showsuccessMessage5d();
		 logger.info("User saw succes message");
		 WebDriverUtility.hardWait();
	 }
	
	
	
	

}
