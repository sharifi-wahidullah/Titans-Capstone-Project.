package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import io.cucumber.java.en.And;

public class Home extends Base{
	

	public Home() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;
	
	// WebElement myAccount = FindWebElementBu.(xpath(dasflakjd));
	
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement loginOption;
	
	@FindBy(id = "input-email")
	private WebElement emailField;
	
	@FindBy(id="input-password")
	private WebElement passwordField;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement homePageLogo;
	
	@FindBy(xpath = "//h2[contains(text(),'My Account')]")
	private WebElement myAccountValidation;
	
	
	
	
	public void clickOnMyAccount() {
		myAccount.click();
	}
	
	public void clickonLoginOption() {
		loginOption.click();
	}
	
	
	public void enterUserNameAndPassword(String emailValue, String passValue) {
		emailField.sendKeys(emailValue);
		passwordField.sendKeys(passValue);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public boolean isTestEnvironmentLogoPresent() {
		if(homePageLogo.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public boolean ismyAccountValidationPresent() {
		if(myAccountValidation.isDisplayed())
			return true;
		else 
			return false;
	}
	
	

}
