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


    public WomenCategoryPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void MenuWomen() {menuWomen.click(); }

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

}