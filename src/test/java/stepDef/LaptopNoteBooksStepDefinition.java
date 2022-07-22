package stepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import core.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopNoteBooksPageObject;
import utilities.WebDriverUtility;

public class LaptopNoteBooksStepDefinition extends Base {

	LaptopNoteBooksPageObject loptop = new LaptopNoteBooksPageObject();

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		loptop.clickOnlopTopNoteBookOption();
		logger.info("User clicked on Loptop NoteBook Option");

		WebDriverUtility.hardWait();
	}

	@And("User click on Show all Laptop &NoteBook option")
	public void user_clickon_show_all_laptop_note_book_option() {
		loptop.clickOnAllLoption();
		logger.info("User clicked on Show All options");

		WebDriverUtility.hardWait();
	}

	// loptop1 Add and remove a Mac book from cart:

	@And("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		loptop.clickOnMackBookOption();
		logger.info("User clicked on MackBook Item");

	}

	// add to cart option left

	@Then("User should see a message2 {string}")
	public void user_should_see_a_message_success(String messs) {
		loptop.userShouldSeeitemAddMessage();
		logger.info("User saw success message");

		WebDriverUtility.hardWait();
	}

	@And("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) {
		Assert.assertTrue(loptop.usershouldseeSuccessMessage());
		logger.info("User saw item to cart message");

		WebDriverUtility.hardWait();
	}

	@And("User click on cart option")
	public void user_click_on_cart_option() {
		loptop.clickOnCartOption();
		logger.info("User clicked on cart option");
		WebDriverUtility.hardWait();
	}

	@And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		loptop.clickOnredXButton();
		logger.info("User clicked on red button");

		WebDriverUtility.hardWait();
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) {
		loptop.showItemRemoved();
		logger.info("User saw success message");

		WebDriverUtility.hardWait();
	}

	// loptop 2 Product comparsion

	@And("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		loptop.clickOnMackBookComparision();
		logger.info("User clicked on MacBook Comparision");
		WebDriverUtility.hardWait();

	}

	@And("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		loptop.clickOnMacBookAiRComparision();
		logger.info("User clicked on MacBook Air Comparision");
		WebDriverUtility.hardWait();

	}

	@Then("User should see a comparision message {string}")
	public void user_should_see_a_comparision_message(String string) {
		Assert.assertTrue(loptop.verifyComparisionMessage());
		logger.info("User saw Comparision success Message");
		WebDriverUtility.hardWait();

	}

	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		loptop.clickOnComparisionLink();
		logger.info("User clicked on comparision link");
		WebDriverUtility.hardWait();

	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		Assert.assertTrue(loptop.verifyChartComarision());
		logger.info("User saw comparision Chart");
		WebDriverUtility.hardWait();
		WebDriverUtility.takeScreenShot();

	}

	// loptop 3 Adding an item to wish list

	@When("User click on heart icon to add Sony VaIO laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		loptop.clickOnWishList();
		logger.info("User clicked on wish list option");
		WebDriverUtility.hardWait();
	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) {
		Assert.assertTrue(loptop.verifyWishlistSuccessMessage());
		logger.info("User saw Wish list Message");
		WebDriverUtility.hardWait();
	}

	// @loptop 4 Scenario: Validate the price of MacBook Pro is 2000

	@When("User click on MacBook Pro item")
	public void user_click_on_mac_book_pro_item() {
		loptop.clickOnMacBookproIcon();
		logger.info("User clicked on MacBook Pro icon");
		WebDriverUtility.hardWait();
		
	}

	@Then("User should see  {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
		Assert.assertTrue(loptop.macBookPriceIsPresent());
		logger.info("User saw MacBook pro price is 2000");
		WebDriverUtility.hardWait();
		WebDriverUtility.takeScreenShot();
	}

}
