package pageobjects;

import Utils.BaseActionElement;
import Utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage extends BaseActionElement {

    @FindBy(xpath = "//*[@id='form_forgotpassword']/fieldset/p/button")
    private WebElement botaoRecuperarSenha;

    @FindBy(xpath = "//*[@id='center_column']/div/p")
    private WebElement retornarMensagemRecuperarEmail;

    @FindBy(xpath = "//*[@id='email']")
    private WebElement digitarEmailRecuperacao;

    public ForgotPasswordPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void BotaoRecuperarSenha() {
        botaoRecuperarSenha.click();
    }
    public String RetornarMensagemRecuperarEmail() {
        return retornarMensagemRecuperarEmail.getText();
    }
    public void CompletarEmail(String text) {
        digitarEmailRecuperacao.sendKeys(text);
    }
}