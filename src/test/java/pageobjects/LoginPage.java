package pageobjects;

import Utils.BaseActionElement;
import Utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseActionElement {

    @FindBy(id = "email")
    private WebElement completarEmail;

    @FindBy(id = "passwd")
    private WebElement completarSenha;

    @FindBy(id = "SubmitLogin")
    private WebElement botaoLogarConta;

    @FindBy(xpath = "//*[@id='login_form']/div/p[1]/a")
    private WebElement botaoEsquecerSenha;

    @FindBy(xpath = "//*[@id='center_column']/div[1]/ol/li")
    private WebElement retornarMensagemErro;

    @FindBy(xpath = "//*[@id='SubmitCreate']")
    private WebElement botaoCriarConta;

    @FindBy(xpath = "//*[@id='email_create']")
    private WebElement completarEmailCadastro;

    public LoginPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void CompletarEmail(String text) {
        completarEmail.sendKeys(text);
    }

    public void CompletarSenha(String text) {
        completarSenha.sendKeys(text);
    }

    public void BotaoLogarConta() {
        botaoLogarConta.click();
    }

    public void BotaoEsquecerSenha() {
        botaoEsquecerSenha.click();
    }

    public String RetornarMensagemErro() {
        return retornarMensagemErro.getText();
    }

    public void BotaoCriarConta() {
        botaoCriarConta.click();
    }

    public void CompletarEmailCadastro(String text) {
        completarEmailCadastro.sendKeys(text);
    }
}
