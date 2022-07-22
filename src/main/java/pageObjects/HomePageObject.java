package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class HomePageObject extends Base {

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Currency')]")
	private WebElement currencyOption;

	@FindBy(xpath = "//button[contains(text(),'€ Euro')]")
	private WebElement euroOption;

	@FindBy(xpath = "//button[contains(text(),'£ Pound Sterling')]")
	private WebElement poundOption;

	@FindBy(xpath = "//button[contains(text(),'$ US Dollar')]")
	private WebElement dollarOption;

	@FindBy(xpath = "//strong[contains(text(),'€')]")
	private WebElement currencyChanged;

	public void clickOnCurrenyOption() {
		currencyOption.click();
	}

	public void clickOnEruo() {
		if (!euroOption.equals("€ Euro")) {
			euroOption.click();
		} else if (!poundOption.equals("£ Pound Sterling")) {
			poundOption.click();
		} else {
			dollarOption.click();
		}
	}

	public boolean verifyCurrencyChanged() {
		if (currencyChanged.isDisplayed())
			return true;
		else
			return false;
	}

	// HomePage 2 User empty shopping cart message displays

	@FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
	private WebElement shoppingCartOption;

	@FindBy(xpath = "//*[@id=\"content\"]/p")
	private WebElement ShoppingCartMessage;

	public void clickOnShoppingCartOption() {
		shoppingCartOption.click();
	}

	public boolean verifyShoppingCartMessage() {
    	 if(ShoppingCartMessage.isDisplayed()) 
    		 return true;
    		 else
    			 return false;
    	 }
	}

