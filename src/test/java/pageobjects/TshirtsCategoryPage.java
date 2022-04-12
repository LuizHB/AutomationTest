package pageobjects;

import Utils.BaseActionElement;
import Utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TshirtsCategoryPage extends BaseActionElement {


    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    private WebElement menuTshirts;



    public TshirtsCategoryPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }



    public void MenuTshirts() {
        menuTshirts.click();
    }


}