package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {
	
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	

	
	//Backgournd Scenario
	
	@FindBy(xpath="//span[(text()= 'My Account')]")
	private WebElement myAccount;
	
	
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginOption;

	
	@FindBy(id = "input-email")
	private WebElement emailInput;
	
	@FindBy(id= "input-password")
	private WebElement passwordInput;
	
	@FindBy(xpath ="//input[@value='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[text()='TEST ENVIRONMENT']")
	private WebElement logo;
	
	
	@FindBy(xpath ="//h2[text()='My Account']")
	private WebElement MyAccountValidation;
	
	public void clickOnMyAccount() {
		myAccount.click();
	}
	

	public void  clickonLoginOPtion() {
		loginOption.click();
	}
	
	public void enterEmail(String emailValue) {
		emailInput.sendKeys(emailValue);
	}
	
	public void enterPassword(String passwordValue) {
		passwordInput.sendKeys(passwordValue);
	}
	
	
	public void clickLogButton() {
		loginButton.click();
	}
	
	
	public boolean isEnvironmetnlogopresent() {
		if(logo.isDisplayed())
			return true;
		else 
			return false;
	}
	
	
	public boolean userlogedin() {
		if(MyAccountValidation.isDisplayed())
			return true;
		else 
			return false;
		
	}
	
	
	
	
	
	
	
	
	//  retailpage 1 Scenario
	
	

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/ul[3]/li[1]/a[1]")
	private WebElement link;


	
			
			
	@FindBy(id = "input-company")
	private WebElement companyField;



	@FindBy(id = "input-website")
	private WebElement websiteField;



	@FindBy(id = "input-tax")
	private WebElement taxfield;



	@FindBy(xpath = "(//label/input[@name='payment'])[1]")
	private WebElement paymentOption;




	@FindBy(id = "input-cheque")
	private WebElement chequeOption;

	@FindBy(xpath="(//div[@class='radio'])[2]") 
	private WebElement payPalOption;
	
	
//	@FindBy(xpath="//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/fieldset[2]/div[2]/div[1]/div[3]")   
//	private WebElement bankTransfarOption;
	
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement banktransferOption;

	
	@FindBy(id = "input-cheque")
	private WebElement payeeOption;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkboxfield;



	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueOption;


	
	
	
	@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement successMessage;
	
	

	public void clickOnlink() {
	link.click();
	}


	
	public void enterCompanyName(String companyValue){
	companyField.sendKeys(companyValue);
	}



	public void enterWebsiteName(String websiteAddress){
	websiteField.sendKeys(websiteAddress);
	}



	public void enterTaxValue(String taxValue){
	taxfield.sendKeys(taxValue);
	}



	public void paymentMethod() {
	paymentOption.click();
	}
//	
//	public void enterPaymentValue(String paymentOption){
//	if(paymentOption.trim().equalsIgnoreCase("chequeOPtion")) {
//		chequeOption.click();
//		}else if(paymentOption.trim().equalsIgnoreCase("payPal")) {
//			payPalOption.click();
//			
//		}else bankTransfarOption.click();}
		
	
	public void enterPayeeValue(String payeeValue){
		payeeOption.sendKeys(payeeValue);
	}
	
	
	public void clickcheckBoxButton(){
	checkboxfield.click();;
	}
	
	
	public void clickContinButton() {
	continueOption.click();	
	}
	
	
	

	public boolean sucessMessagesho() {
	if(successMessage.isDisplayed()) {
	return true;
	}else
	return false;
	}


	



// @retailPage2 (Edit affiliate information) Scenario

    @FindBy(xpath="//a[contains(text(),'Edit your account information')]")
    private WebElement affliateEditlink;
	
    
    
    @FindBy(id="input-bank-name")
    private WebElement bankNameField;
    
    @FindBy(id="input-bank-branch-number")
    private WebElement abaNumberField;
    
    @FindBy(id="input-bank-swift-code")
    private WebElement SwiftcodeField;
    
    @FindBy(id="input-bank-account-name")
    private WebElement accountNameField;
    
    @FindBy(id="input-bank-account-number")
    private WebElement accountNumberField;
    
    
    
    
    public void clickonaffliatelink() {
    	affliateEditlink.click();
    }
   
    
    public void clickontransfarRadioButton() {
    banktransferOption.click();
    }
    
    
   
    
    
    public void enterBankName(String bankname) {
    	bankNameField.sendKeys(bankname);
    }
    
	public void enterAbaNumber(String abaNumber) {
		abaNumberField.sendKeys(abaNumber);
	}
	
	
	public void enterswiftcode(String swiftcode) {
		SwiftcodeField.sendKeys(swiftcode);
	}
	
	
	public void enterAccountName(String accountnamevalue) {
		accountNameField.sendKeys(accountnamevalue);
	}
	
	
	
	public void enterAccountNumber(String accountnumbervalue) {
		accountNumberField.sendKeys(accountnumbervalue);
	}

	
	
	
	
	
	

// @retailpage3 scenario or Edit your account Information
	
	
	@FindBy(xpath="//a[text()='Edit your account information']")
	private WebElement editeAccountLink;
	
	
	@FindBy(id="input-firstname")
	private WebElement editeFirstName;
	
	@FindBy(id="input-lastname")
	private WebElement editLastName;
	
	@FindBy(id="input-email")
	private WebElement editEmail;
	
	@FindBy(id="input-telephone")
	private WebElement editTelePhone;
	
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement editContinueButton;
	
	@FindBy(xpath = "//*[@id='account-account']/div[1]")
	private WebElement successMessageEditAccountInfo;
	
	
	public void clickOnEditAccountLink() {
		editeAccountLink.click();
	}
	
	
	public void enterEditAccountValues(String firstName, String lastName,String email,String telephone) {
		editeFirstName.sendKeys(firstName);
		editLastName.sendKeys(lastName);
		editEmail.sendKeys(email);
		editTelePhone.sendKeys(telephone);
	}
	
	public void clickOneditContinueButton() {
		editContinueButton.click();
	}
	
	

	public boolean isEditAccountInfoSuccessMessagePresent() {
	if (successMessageEditAccountInfo.isDisplayed()) {
	return true;
	} else {
	return false;
	}
	
}}

	
	

