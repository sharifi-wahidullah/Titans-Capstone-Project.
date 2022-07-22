package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LaptopNoteBooksPageObject extends Base {

	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

	// Loptop Background Button

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement lopTopNoteBookTab;

	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement AllLoptopOption;

	public void clickOnlopTopNoteBookOption() {
		lopTopNoteBookTab.click();

	}

	public void clickOnAllLoption() {
		AllLoptopOption.click();
	}

	// Loptop1 Add and Remove a Mac book from Cart

	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement mackBooklink;

	@FindBy(id = "button-cart")
	private WebElement addTocartButton;

	@FindBy(id = "cart-total")
	private WebElement addToCartSuccessMessage;

	@FindBy(xpath = "//*[text()='Success: You have added ']")
	private WebElement itemAddedToCart;

	@FindBy(id = "cart-total")
	private WebElement cartOption;

	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement redXbutton;

	@FindBy(xpath = "//span[text()=' 0 item(s) - $0.00']")
	private WebElement itemRemovedtext;

	public void clickOnMackBookOption() {
		mackBooklink.click();
	}

	public void clickOnAddToCartButton() {
		addTocartButton.click();
	}

	public boolean usershouldseeSuccessMessage() {
		if (addToCartSuccessMessage.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean userShouldSeeitemAddMessage() {
		if (itemAddedToCart.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnCartOption() {
		cartOption.click();
	}

	public void clickOnredXButton() {
		redXbutton.click();
	}

	public boolean showItemRemoved() {
		if (itemRemovedtext.isDisplayed())
			return true;
		else
			return false;
	}

	// loptop 2

	@FindBy(xpath = "(//button[@type='button'])[14]")
	private WebElement bookComarisionIcon;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement bookAirComparisionIcon;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement comparisionMessage;

	@FindBy(id = "compare-total")
	private WebElement comparisionLink;

	@FindBy(xpath = "//h1[text()='Product Comparison']")
	private WebElement chartMessage;

	
	
	
	public void clickOnMackBookComparision() {
		bookComarisionIcon.click();
	}

	public void clickOnMacBookAiRComparision() {
		bookAirComparisionIcon.click();
	}

	public boolean verifyComparisionMessage() {
		comparisionLink.getText();
		if (comparisionLink.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnComparisionLink() {
		comparisionLink.click();

	}

	public boolean verifyChartComarision() {
		chartMessage.getText();
		if (chartMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	
	
	// loptop 3 Adding an item to wish list
	

	@FindBy(xpath="(//button[@type='button'])[23]")
	private WebElement wishlistOption;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement wishListSuccessMessage;
	
	
	
	public void clickOnWishList() {
		wishlistOption.click();
	}

	
	public boolean verifyWishlistSuccessMessage() {
		if (wishListSuccessMessage.isDisplayed())
			return true;
		else 
			return false;
	}





    // loptop 4 Validate the price of MacBook pro is 2000
      

    @FindBy(xpath="//a[text()='MacBook Pro']")
    private WebElement MacBookProIcon;
    
    @FindBy(xpath ="//h2[contains(text(),'$2,000.00')]")
    private WebElement MacBookPrice;
    
    public void clickOnMacBookproIcon() {
    	MacBookProIcon.click();
    }
    
    public boolean macBookPriceIsPresent() {
    	if(MacBookPrice.isDisplayed())
    		return true;
    	else 
    		return false;
    }
    
    



}

