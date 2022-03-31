import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.setProperty;
import static org.junit.Assert.assertTrue;

public class AutomationSample {
    @Test
    public void successfulLogin() {
        //webdriver call
        setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement buttonSignIn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        buttonSignIn.click();

        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));
        WebElement forgotPassword = driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));

        email.sendKeys("luiz@mail.com");
        password.sendKeys("123456");

        WebElement loginButton = driver.findElement(By.id("SubmitLogin"));
        loginButton.click();
        //Test to check if it's logged in
        assertTrue(driver.getCurrentUrl().contains("/index.php?controller=my-account"));
        driver.quit();
    }

    @Test
    public void identificarEmailVazio() {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        WebElement signinBotao = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        signinBotao.click();

        WebElement email = driver.findElement(By.id("email"));
        WebElement senha = driver.findElement(By.id("passwd"));

        email.sendKeys("");

        WebElement logarBotao = driver.findElement(By.id("SubmitLogin"));
        logarBotao.click();

        WebElement mensagem = driver.findElement(By.xpath("//*[@id='center_column']/div[1]/ol/li"));
        //email vazio
        assertTrue("Email vazio", mensagem.getText().contains("An email address required."));

        driver.quit();
    }

    @Test
    public void identificarSenhaVazia() {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        WebElement signinBotao = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        signinBotao.click();

        WebElement email = driver.findElement(By.id("email"));
        WebElement senha = driver.findElement(By.id("passwd"));

        email.sendKeys("luiz@mail.com");
        senha.sendKeys("");

        WebElement logarBotao = driver.findElement(By.id("SubmitLogin"));
        logarBotao.click();

        WebElement mensagem = driver.findElement(By.xpath("//*[@id='center_column']/div[1]/ol/li"));
        //senha vazio
        assertTrue("Senha vazia", mensagem.getText().contains("Password is required."));

        driver.quit();
    }

    @Test
    public void identificarEmailErrado() {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        WebElement signinBotao = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        signinBotao.click();

        WebElement email = driver.findElement(By.id("email"));
        WebElement senha = driver.findElement(By.id("passwd"));

        email.sendKeys("lus@ail.com");
        senha.sendKeys("123456");

        WebElement logarBotao = driver.findElement(By.id("SubmitLogin"));
        logarBotao.click();

        WebElement mensagem = driver.findElement(By.xpath("//*[@id='center_column']/div[1]/ol/li"));
        //email errado
        assertTrue("email errado", mensagem.getText().contains("Authentication failed."));
        driver.quit();
    }

    @Test
    public void identificarSenhaErrada() {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        WebElement signinBotao = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        signinBotao.click();

        WebElement email = driver.findElement(By.id("email"));
        WebElement senha = driver.findElement(By.id("passwd"));

        email.sendKeys("luiz@mail.com");
        senha.sendKeys("1255555");

        WebElement logarBotao = driver.findElement(By.id("SubmitLogin"));
        logarBotao.click();

        WebElement mensagem = driver.findElement(By.xpath("//*[@id='center_column']/div[1]/ol/li"));
        // senha errada
        assertTrue("senha errada", mensagem.getText().contains("Authentication failed."));
        driver.quit();
    }

    @Test
    public void esquecerSenha() {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        WebElement signinBotao = driver.findElement(By.xpath("//*[@id='login_form']/div/p[1]/a"));
        signinBotao.click();

        WebElement esquecerSenha = driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
        esquecerSenha.click();

        WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
        email.sendKeys("luiz@mail.com");

        WebElement botaoRetrieve = driver.findElement(By.xpath("//*[@id='form_forgotpassword']/fieldset/p/button"));
        botaoRetrieve.click();

        WebElement mensagem = driver.findElement(By.xpath("//*[@id='center_column']/div/p"));
        //esqueceu senha
        assertTrue("Esqueceu a senha", mensagem.getText().contains("A confirmation email has been sent to your address: luiz@mail.com"));
        driver.quit();
    }
}
