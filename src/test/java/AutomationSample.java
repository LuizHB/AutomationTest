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
    public void identifyBlankEmail() {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        WebElement buttonSignIn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        buttonSignIn.click();

        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));

        email.sendKeys("");

        WebElement loginButton = driver.findElement(By.id("SubmitLogin"));
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.xpath("//*[@id='center_column']/div[1]/ol/li"));
        //Test to check if email is blank
        assertTrue("Blank Email!", errorMessage.getText().contains("An email address required."));

        driver.quit();
    }

    @Test
    public void identifyBlankPassword() {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        WebElement buttonSignIn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        buttonSignIn.click();

        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));

        email.sendKeys("luiz@mail.com");
        password.sendKeys("");

        WebElement loginButton = driver.findElement(By.id("SubmitLogin"));
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.xpath("//*[@id='center_column']/div[1]/ol/li"));
        //Test to check if password is blank
        assertTrue("Blank Password!", errorMessage.getText().contains("Password is required."));

        driver.quit();
    }

    @Test
    public void identifyWrongEmail() {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        WebElement buttonSignIn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        buttonSignIn.click();

        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));

        email.sendKeys("lus@ail.com");
        password.sendKeys("123456");

        WebElement loginButton = driver.findElement(By.id("SubmitLogin"));
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.xpath("//*[@id='center_column']/div[1]/ol/li"));
        //Test to check if email is wrong
        assertTrue("Wrong Email!", errorMessage.getText().contains("Authentication failed."));
        driver.quit();
    }

    @Test
    public void identifyWrongPassword() {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        WebElement buttonSignIn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        buttonSignIn.click();

        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));

        email.sendKeys("luiz@mail.com");
        password.sendKeys("1255555");

        WebElement loginButton = driver.findElement(By.id("SubmitLogin"));
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.xpath("//*[@id='center_column']/div[1]/ol/li"));
        //Test to check if password is wrong
        assertTrue("Wrong Password!", errorMessage.getText().contains("Authentication failed."));
        driver.quit();
    }

    @Test
    public void forgotPassword() {
        setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        WebElement buttonSignIn = driver.findElement(By.xpath("//*[@id='login_form']/div/p[1]/a"));
        buttonSignIn.click();

        WebElement esquecerSenha = driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
        esquecerSenha.click();

        WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
        email.sendKeys("luiz@mail.com");

        WebElement buttonForgotPassword = driver.findElement(By.xpath("//*[@id='form_forgotpassword']/fieldset/p/button"));
        buttonForgotPassword.click();

        WebElement errorMessage = driver.findElement(By.xpath("//*[@id='center_column']/div/p"));
        //Testo to check if forgotten password gets sent to email
        assertTrue("Forgot Password!", errorMessage.getText().contains("A confirmation email has been sent to your address: luiz@mail.com"));
        driver.quit();
    }
}
