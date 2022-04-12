package pageobjects;

import Utils.BaseActionElement;
import Utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressesCategoryPage extends BaseActionElement {

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    private WebElement menuDresses;

    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")
    private WebElement casualDressesMenuDresses;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]")
    private WebElement addCartFirstCasualDress;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]")
    private WebElement moreFirstCasualDress;

    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[2]/a")
    private WebElement eveningDressesMenuDresses;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]")
    private WebElement addCartFirstEveningDress;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]")
    private WebElement moreFirstEveningDress;

    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[3]/a")
    private WebElement summerDressesMenuDresses;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")
    private WebElement addCartFirstSummerDress;

    @FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[2]")
    private WebElement moreFirstSummerDress;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]")
    private WebElement addCartSecondSummerDress;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[2]")
    private WebElement moreSecondSummerDress;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[1]")
    private WebElement addCartThirdSummerDress;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[2]")
    private WebElement moreThirdSummerDress;

    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/span")
    private WebElement continueShopping;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    private WebElement proceedToCheckout;

    public DressesCategoryPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void MenuDresses() {
        menuDresses.click();
    }

    public void MenuDressesCasual() {
        casualDressesMenuDresses.click();
    }

    public void MenuDressesEvening() {
        eveningDressesMenuDresses.click();
    }

    public void MenuDressesSummer() {
        summerDressesMenuDresses.click();
    }

    public void AddCartFirstCasualDress() {
        addCartFirstCasualDress.click();
    }

    public void AddCartFirstEveningDress() {
        addCartFirstEveningDress.click();
    }

    public void AddCartFirstSummerDress() {
        addCartFirstSummerDress.click();
    }

    public void AddCartSecondSummerDress() {
        addCartSecondSummerDress.click();
    }

    public void AddCartThirdSummerDress() {
        addCartThirdSummerDress.click();
    }

    public void MoreFirstCasualDress() {
        moreFirstCasualDress.click();
    }

    public void MoreFirstEveningDress() {
        moreFirstEveningDress.click();
    }

    public void MoreFirstSummerDress() {
        moreFirstSummerDress.click();
    }

    public void MoreSecondSummerDress() {
        moreSecondSummerDress.click();
    }

    public void MoreThirdSummerDress() {
        moreThirdSummerDress.click();
    }


}