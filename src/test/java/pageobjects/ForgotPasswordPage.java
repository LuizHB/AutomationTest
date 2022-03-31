package pageobjects;

import Utils.BaseActionElement;
import Utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage extends BaseActionElement {

    @FindBy(xpath = "//*[@id='form_forgotpassword']/fieldset/p/button")
    private WebElement buttonForgotPassword;

    @FindBy(xpath = "//*[@id='center_column']/div/p")
    private WebElement returnRecoveryEmailMessage;

    @FindBy(xpath = "//*[@id='email']")
    private WebElement addRecoveryEmail;

    public ForgotPasswordPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void ButtonForgotPassword() {
        buttonForgotPassword.click();
    }
    public String ReturnRecoveryEmailMessage() {
        return returnRecoveryEmailMessage.getText();
    }
    public void AddRecoveryEmail(String text) {
        addRecoveryEmail.sendKeys(text);
    }
}