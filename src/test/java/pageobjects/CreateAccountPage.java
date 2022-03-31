package pageobjects;

import Utils.BaseActionElement;
import Utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends BaseActionElement {

    @FindBy(xpath = "//*[@id='id_gender1']")
    private WebElement buttonMr;

    @FindBy(xpath = "//*[@id='id_gender2']")
    private WebElement buttonMRS;

    @FindBy(xpath = "//*[@id='customer_firstname']")
    private WebElement addFirstName;

    @FindBy(xpath = "//*[@id='customer_lastname']")
    private WebElement addLastName;

    @FindBy(xpath = "//*[@id='passwd']")
    private WebElement addPassword;

    @FindBy(xpath = "//*[@id=\"days\"]")
    private WebElement buttonSelectDay;

    @FindBy(xpath = "//*[@id='months']")
    private WebElement buttonSelectMonth;

    @FindBy(xpath = "//*[@id='years']")
    private WebElement buttonSelectYear;

    @FindBy(xpath = "//*[@id='newsletter']")
    private WebElement boxNewsletter;

    @FindBy(xpath = "//*[@id='optin']")
    private WebElement boxOffers;

    @FindBy(xpath = "//*[@id='company']")
    private WebElement addCompany;

    @FindBy(xpath = "//*[@id='address1']")
    private WebElement addAddress;

    @FindBy(xpath = "//*[@id='city']")
    private WebElement addCity;

    @FindBy(xpath = "//*[@id='id_state']")
    private WebElement buttonSelectState;

    @FindBy(xpath = "//*[@id='phone_mobile']")
    private WebElement addPhoneNumber;

    @FindBy(xpath = "//*[@id='alias']")
    private WebElement addAlias;

    @FindBy(xpath = "//*[@id='submitAccount']")
    private WebElement buttonRegisterAccount;

    @FindBy(xpath = "//*[@id='postcode']")
    private WebElement addZipCode;

    @FindBy(xpath = "//*[@id='postcode']")
    private WebElement returnRegistryMessage;

    public CreateAccountPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void ButtonMR() {
        buttonMr.click();
    }

    public void ButtonMRS() {
        buttonMRS.click();
    }

    public void BoxNewsletter() {
        boxNewsletter.click();
    }

    public void BoxOffers() {
        boxOffers.click();
    }

    public void AddFirstName(String text) {
        addFirstName.sendKeys(text);
    }

    public void AddLastName(String text) {
        addLastName.sendKeys(text);
    }

    public void AddPassword(String text) {
        addPassword.sendKeys(text);
    }

    public void AddCompany(String text) {
        addCompany.sendKeys(text);
    }

    public void AddAddress(String text) {
        addAddress.sendKeys(text);
    }

    public void AddAlias(String text) {
        addAlias.sendKeys(text);
    }

    public void AddPhoneNumber(String text) {
        addPhoneNumber.sendKeys(text);
    }

    public void AddCity(String text) {
        addCity.sendKeys(text);
    }

    public void AddZipCode(String text) {
        addZipCode.sendKeys(text);
    }

    public void SelectState(String text) {
        Select selectObject = new Select(buttonSelectState);
        selectObject.selectByValue(text);
    }

    public void SelectDay(String text) {
        Select selectObject = new Select(buttonSelectDay);
        selectObject.selectByValue(text);
    }

    public void SelectMonth(String text) {
        Select selectObject = new Select(buttonSelectMonth);
        selectObject.selectByValue(text);
    }

    public void SelectYear(String text) {
        Select selectObject = new Select(buttonSelectYear);
        selectObject.selectByValue(text);
    }

    public void ButtonRegisterAccount() {
        buttonRegisterAccount.click();
    }


}