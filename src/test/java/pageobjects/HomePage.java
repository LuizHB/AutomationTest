package pageobjects;

import Utils.BaseActionElement;
import Utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseActionElement {

    @FindBy(xpath = "//a[contains(text(),'Sign in') and @class=\"login\"]")
    private WebElement buttonSignIn;

    public HomePage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void ButtonSignIn() {
        buttonSignIn.click();
    }
}
