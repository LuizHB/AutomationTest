package test;

import Utils.BaseTest;
import org.junit.Test;
import pageobjects.*;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class ShoppingTest extends BaseTest {

    private final LoginPage loginpage = new LoginPage();
    private final HomePage homepage = new HomePage();
    private final WomenCategoryPage womenpage = new WomenCategoryPage();
    private final DressesCategoryPage dressespage = new DressesCategoryPage();
    private final TshirtsCategoryPage tshirtpage = new TshirtsCategoryPage();
    Random random = new Random();

    @Test
    public void successfulBuy() {
        //Home Page
        homepage.ButtonSignIn();
        //Login Page
        loginpage.AddEmail("luiz@mail.com");
        loginpage.AddPassword("123456");
        loginpage.ButtonLoginAccount();
        dressespage.MenuDresses();
        dressespage.MenuDressesSummer();
        dressespage.AddCartThirdSummerDress();
        dressespage.ProceedToCheckoutShoppingPage();
        dressespage.ProceedToCheckoutSummaryPage();
        dressespage.ProceedToCheckoutAddressPage();
        dressespage.BoxTermsAgreement();
        dressespage.ProceedToCheckoutShippingArea();
        dressespage.PayBankWire();
        dressespage.ButtonConfirmOrder();

        assertTrue(dressespage.BoxConfirmation().contains("Your order on My Store is complete."));

    }




}
