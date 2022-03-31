package test;

import Utils.BaseTest;
import org.junit.Test;
import pageobjects.CreateAccountPage;
import pageobjects.ForgotPasswordPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class LoginTest extends BaseTest {
    private final CreateAccountPage createaccount = new CreateAccountPage();
    private final LoginPage loginpage = new LoginPage();
    private final HomePage homepage = new HomePage();
    private final ForgotPasswordPage forgotpassword = new ForgotPasswordPage();
    Random random = new Random();

    @Test
    public void successfulLogin() {
        //Home Page
        homepage.ButtonSignIn();
        //Login Page
        loginpage.AddEmail("luiz@mail.com");
        loginpage.AddPassword("123456");
        loginpage.ButtonLoginAccount();
        assertTrue(getCurrentUrl().contains("/index.php?controller=my-account"));
    }

    @Test
    public void identificarEmailVazio() {
        //Home Page
        homepage.ButtonSignIn();
        //Login Page
        loginpage.AddEmail("");
        loginpage.ButtonLoginAccount();
        assertTrue(loginpage.ReturnErrorMessage().contains("An email address required."));
    }

    @Test
    public void identificarSenhaVazia() {
        //Home Page
        homepage.ButtonSignIn();
        //Login Page
        loginpage.AddEmail("luiz@mail.com");
        loginpage.AddPassword("");
        loginpage.ButtonLoginAccount();
        assertTrue(loginpage.ReturnErrorMessage().contains("Password is required."));
    }

    @Test
    public void identificarEmailErrado() {
        //Home Page
        homepage.ButtonSignIn();
        //Login Page
        loginpage.AddEmail("lus@ail.com");
        loginpage.AddPassword("123456");
        loginpage.ButtonLoginAccount();
        assertTrue(loginpage.ReturnErrorMessage().contains("Authentication failed."));
    }

    @Test
    public void identificarSenhaErrada() {
        //Home Page
        homepage.ButtonSignIn();
        //Login Page
        loginpage.AddEmail("luiz@mail.com");
        loginpage.AddPassword("125555");
        loginpage.ButtonLoginAccount();
        assertTrue(loginpage.ReturnErrorMessage().contains("Authentication failed."));
    }

    @Test
    public void esquecerSenha() {
        //Home Page
        homepage.ButtonSignIn();
        //Login Page
        loginpage.ButtonForgotPassword();
        //Tela recuperar senha
        forgotpassword.AddRecoveryEmail("luiz@mail.com");
        forgotpassword.ButtonForgotPassword();
        assertTrue(forgotpassword.ReturnRecoveryEmailMessage().contains("A confirmation email has been sent to your address: luiz@mail.com"));
    }

    @Test
    public void criarCadastro() {
        //Home Page
        homepage.ButtonSignIn();
        //Login Page
        String emailTeste = "teste" + random.nextInt() + "@mail.com";
        loginpage.AddResgistryEmail(emailTeste);
        loginpage.ButtonCreateAccount();
        //Registry Page
        createaccount.ButtonMR();
        createaccount.AddFirstName("Master");
        createaccount.AddLastName("Blast");
        createaccount.AddPassword("123456");
        createaccount.SelectDay("1");
        createaccount.SelectMonth("5");
        createaccount.SelectYear("1998");
        createaccount.BoxNewsletter();
        createaccount.BoxOffers();
        createaccount.AddCompany("Qualquer");
        createaccount.AddAddress("Rua Sd 43");
        createaccount.SelectState("4");
        createaccount.AddCity("Santa Lucia");
        createaccount.AddZipCode("55535");
        createaccount.AddPhoneNumber("4562258862");
        createaccount.AddAlias("End1");
        createaccount.ButtonRegisterAccount();

        assertTrue(getCurrentUrl().contains("/index.php?controller=my-account"));
    }
}
