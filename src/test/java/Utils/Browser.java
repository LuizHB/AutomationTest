package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Browser {

    public static WebDriver driver;

    public static WebDriver getCurrentDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\Documents\\chromedriver_win32\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
            driver.get("http://automationpractice.com/index.php");
        }
        return driver;
    }

    public static void close() {
        getCurrentDriver().quit();
        driver = null;
    }
}
