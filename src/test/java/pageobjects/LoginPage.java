package pageobjects;

import Utils.BaseActionElement;
import Utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseActionElement {

    @FindBy(id = "email")
    private WebElement addEmail;

    @FindBy(id = "passwd")
    private WebElement addPassword;

    @FindBy(id = "SubmitLogin")
    private WebElement buttonLoginAccount;

    @FindBy(xpath = "//*[@id='login_form']/div/p[1]/a")
    private WebElement buttonForgotPassword;

    @FindBy(xpath = "//*[@id='center_column']/div[1]/ol/li")
    private WebElement returnErrorMessage;

    @FindBy(xpath = "//*[@id='SubmitCreate']")
    private WebElement buttonCreateAccount;

    @FindBy(xpath = "//*[@id='email_create']")
    private WebElement addResgistryEmail;

    public LoginPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void AddEmail(String text) {
        addEmail.sendKeys(text);
    }

    public void AddPassword(String text) {
        addPassword.sendKeys(text);
    }

    public void ButtonLoginAccount() {
        buttonLoginAccount.click();
    }

    public void ButtonForgotPassword() {
        buttonForgotPassword.click();
    }

    public String ReturnErrorMessage() {
        return returnErrorMessage.getText();
    }

    public void ButtonCreateAccount() {
        buttonCreateAccount.click();
    }

    public void AddResgistryEmail(String text) {
        addResgistryEmail.sendKeys(text);
    }
}
