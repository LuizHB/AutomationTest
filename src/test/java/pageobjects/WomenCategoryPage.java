package pageobjects;

import Utils.BaseActionElement;
import Utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Browser.driver;

public class WomenCategoryPage extends BaseActionElement {

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    private WebElement menuWomen;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    private WebElement menuDresses;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    private WebElement menuTshirts;

    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")
    private WebElement topsMenuWomen;

    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[2]/a")
    private WebElement dressesMenuWomen;

    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[1]/ul/li[1]/a")
    private WebElement tshirtsButtonMenuWomen;

    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[1]/ul/li[2]/a")
    private WebElement blousesButtonMenuWomen;

    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[2]/ul/li[1]/a")
    private WebElement casualDressesButtonMenuWomen;

    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[2]/ul/li[2]/a")
    private WebElement eveningDressesButtonMenuWomen;

    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[2]/ul/li[3]/a")
    private WebElement summerDressesButtonMenuWomen;

    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")
    private WebElement casualDressesMenuDresses;

    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[2]/a")
    private WebElement eveningDressesMenuDresses;

    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[3]/a")
    private WebElement summerDressesMenuDresses;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")
    private WebElement addCartFirstSummerDress;

    @FindBy(xpath ="//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[2]")
    private WebElement moreFirstSummerDress;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]")
    private WebElement addCartSecondSummerDress;

    @FindBy(xpath ="//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[2]")
    private WebElement moreSecondSummerDress;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[1]")
    private WebElement addCartThirdSummerDress;

    @FindBy(xpath ="//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[2]")
    private WebElement moreThirdSummerDress;

    public WomenCategoryPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void MenuWomen() {menuWomen.click(); }

    public void MenuDresses() { menuDresses.click();}

    public void MenuTshirts() {
        menuTshirts.click();
    }

    public void MenuWomenTops() {
        topsMenuWomen.click();
    }
    public void MenuWomenBlouses() {
        blousesButtonMenuWomen.click();
    }
    public void MenuWomenDresses() {
        dressesMenuWomen.click();
    }
    public void MenuWomenCasual() {
        casualDressesButtonMenuWomen.click();
    }
    public void MenuWomenEvening() {
        eveningDressesButtonMenuWomen.click();
    }
    public void MenuWomenSummer() {
        summerDressesButtonMenuWomen.click();
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

}