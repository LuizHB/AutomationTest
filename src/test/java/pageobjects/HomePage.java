package pageobjects;

import Utils.BaseActionElement;
import Utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseActionElement {

    @FindBy(xpath = "//a[contains(text(),'Sign in') and @class=\"login\"]")
    private WebElement signin;

    public HomePage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickMenuLogin() {
        signin.click();
    }
}
