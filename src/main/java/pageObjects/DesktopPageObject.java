package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopPageObject extends Base {

	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	// Backgound Scenarios

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement DesktopsOption;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showDesktopOption;

	public void moveToDesktopOption() {
		WebDriverUtility.moveToElement(DesktopsOption);
	}

	public void clickonshowDesktopOption() {
		showDesktopOption.click();
	}

	// desktopPagetab1 first scenario

	@FindBy(tagName = "img")
	private List<WebElement> desktopItems;

	public List<WebElement> isDesktopItemsPresent() {
		List<WebElement> deskItems = desktopItems;
		return deskItems;

	}

// User add HP LP 3065  from Desktops tab to the cart Scenario

	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement addToCartoption;

	@FindBy(id = "input-quantity")
	private WebElement quantityField;

	@FindBy(id = "button-cart")
	private WebElement addTocartButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement addToCartSuccessMessage;

	public void clickAddToCartOption() {
		addToCartoption.click();
	}

	public void slectQuantity(String quantity) {
		quantityField.clear();
		quantityField.sendKeys(quantity);

	}

	public void clickAddToCartButton() {
		addTocartButton.click();
	}

	public boolean isDisplyedAddToCartSuccessMessage() {
		if (addToCartSuccessMessage.isDisplayed())
			return true;
		else
			return false;

	}

	// 3: Scenario: User add Canon EOS 5D from Desktops tab to the cart

	@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div[2]/div/div[2]/div[2]/button[1]")
	private WebElement CanonCamera;

	@FindBy(id = "input-option226")
	private WebElement colorOption;

//	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/select/option[2]")
//	private WebElement redColor;
//
//	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/select/option[3]")
//	private WebElement blueColor;
//
//	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/select/option[4]")
//	private WebElement greenColor;

	@FindBy(id = "button-cart")
	private WebElement AddToCart;

	@FindBy(xpath = "//*[@id=\"product-product\"]/div[1]")
	private WebElement goodSuccessMessage;

	public void AddCameraToCart() {
		CanonCamera.click();
	}

	public void userSelectRedColor() {
		Select color = new Select(colorOption);
		color.selectByVisibleText("Red");
	}

	public void cartButton() {
		AddToCart.click();
	}

	public boolean goodMessage() {
		if (goodSuccessMessage.isDisplayed()) {
			return true;
		} else
			return false;

	}

	// desktoptab4 Scenario: User add a review to Canon EOS 5D item inDesktops tab

	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement EOSCanonCamera;

	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement reviewLink;

	@FindBy(id = "input-name")
	private WebElement yourName;

	@FindBy(id = "input-review")
	private WebElement yourRiview;

	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> RatingButton;

	@FindBy(id = "button-review")
	private WebElement continueButtonClick;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage5d;

	public void clickOnCamera() {
		EOSCanonCamera.click();
	}

	public void selectviewLink() {
		reviewLink.click();
	}

	public void NameField(String NameValue) {
		yourName.sendKeys(NameValue);
	}

	public void reviewField(String reviewValue) {
		yourRiview.sendKeys(reviewValue);
	}

	public void selectRatingOption(String RatingValue) {
		List<WebElement> ratingOptoin = RatingButton;
		for (WebElement element : ratingOptoin) {
			if (element.getAttribute("value").equalsIgnoreCase(RatingValue.trim())) {
				element.click();
				break;
			}
		}
	}

	public void pleaseClickContinue() {
		continueButtonClick.click();
	}

	public boolean showsuccessMessage5d() {
		if (successMessage5d.isDisplayed())
			return true;
		else
			return false;
	}

}
