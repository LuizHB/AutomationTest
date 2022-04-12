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

    Random random = new Random();

    @Test
    public void successfulLogin() {
        //Home Page
        homepage.ButtonSignIn();
        //Login Page
        loginpage.AddEmail("luiz@mail.com");
        loginpage.AddPassword("123456");
        loginpage.ButtonLoginAccount();
        womenpage.MenuDresses();
        womenpage.MenuDressesSummer();

    }




}
