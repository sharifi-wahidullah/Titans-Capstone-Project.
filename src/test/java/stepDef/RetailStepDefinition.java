package stepDef;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Home;
import pageObjects.RetailPageObject;
import utilities.WebDriverUtility;

public class RetailStepDefinition extends Base {

	RetailPageObject retail = new RetailPageObject();

	@Given("User is on Retail websitee")
	public void user_is_on_retail_websitee() {
		Assert.assertTrue(retail.isEnvironmetnlogopresent());
		logger.info("Test Environment log is Present");

	}

	@When("User click  on MyAccount")
	public void user_click_on_my_account() throws InterruptedException {
		retail.clickOnMyAccount();
		logger.info("User clicked On My Account");
		Thread.sleep(3000);
	}

	@And("User click on Login")
	public void user_click_on_login() throws InterruptedException {
		retail.clickonLoginOPtion();
		logger.info("User clicked on Login option");
		Thread.sleep(2000);
	}

	@And("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String userName, String password) throws InterruptedException {
		retail.enterEmail(userName);
		logger.info("user enter the userName " + userName);
		retail.enterPassword(password);
		logger.info("user enter the password  " + password);
		Thread.sleep(3000);

	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
		retail.clickLogButton();
		logger.info("User clicked on Login button");
		WebDriverUtility.takeScreenShot();
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		Assert.assertTrue(retail.isEnvironmetnlogopresent());
		logger.info("user Successfully loged in to myAccount");
	}

// retailpage1 Scenario

	@When("User click on {string} link")
	public void user_click_on_link(String affilatelink) {
		retail.clickOnlink();
		logger.info("User clicked affilate link");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information_company_website_tax_id_payment_method(
			DataTable dataTable) {
		List<Map<String, String>> editinfo = dataTable.asMaps(String.class, String.class);
		retail.enterCompanyName(editinfo.get(0).get("company"));
		retail.enterWebsiteName(editinfo.get(0).get("website"));
		retail.enterTaxValue(editinfo.get(0).get("taxID"));
		// retail.enterPaymentValue(editinfo.get(0).get("paymentMethod"));
		retail.enterPayeeValue(editinfo.get(0).get("payee Name"));
		logger.info("User filled affiliat form with peronal information");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retail.clickcheckBoxButton();
		logger.info("User select on check box option");

	}

	@And("User click on Continue button")
	public void user_click_on_continue_button() {
		retail.clickContinButton();
		logger.info("User clicked on continue button");

	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		retail.sucessMessagesho();
		logger.info("user saw success message");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

// Rtail 2 scenario

	@When("User click on {string} links")
	public void user_click_on_link1(String affiliatEditlink) {
		retail.clickonaffliatelink();
		logger.info("User clicked on 'Edit your affiliate information' link");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@And("User click on Bank Transfer radio button")
	public void user_click_on_bank_transfar_radio_button() {
		retail.clickontransfarRadioButton();
		logger.info("User clicked on radio button");

	}

	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information_bankName_abaNumber_swiftcode_accountName_accountNumber(
			DataTable dataTable) {
		List<Map<String, String>> information = dataTable.asMaps(String.class, String.class);

		retail.enterBankName(information.get(0).get("bankName"));
		retail.enterAbaNumber(information.get(0).get("abaNumber"));
		retail.enterswiftcode(information.get(0).get("swiftCode"));
		retail.enterAccountName(information.get(0).get("accountName"));
		retail.enterAccountNumber(information.get(0).get("accountNumber"));

		logger.info("User entered bank information");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@When("User click on {string} link12")
	public void user_click_on_link12(String editAccount) {
		retail.clickOnEditAccountLink();
		logger.info("User clicked on editAccount link");
	}

	@And("User modify below information")
	public void user_modify_below_information_firstname_lastName_email_telephone(DataTable dataTable) {
		List<Map<String, String>> editAccountInfo = dataTable.asMaps(String.class, String.class);
		retail.enterEditAccountValues(editAccountInfo.get(0).get("firstname"), editAccountInfo.get(0).get("lastName"),
				editAccountInfo.get(0).get("email"), editAccountInfo.get(0).get("telephone"));
		logger.info("User entered edit account information");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("User click on continue button")
	public void user_click_on_continue_button3() {
		retail.clickOneditContinueButton();
		logger.info("User clicked on Continue button");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	@Then("User should see a messagee {string}")
	public void user_should_see_a_messagee(String string) {
		Assert.assertTrue(retail.isEditAccountInfoSuccessMessagePresent());
		logger.info("success message has been displayed");
		WebDriverUtility.takeScreenShot();

	}

}
