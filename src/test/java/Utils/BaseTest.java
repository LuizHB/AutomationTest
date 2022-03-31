package Utils;

import org.junit.After;
import org.junit.Before;

import static Utils.Browser.close;
import static Utils.Browser.getCurrentDriver;

public class BaseTest {
    @Before
    public void startTest() {
        getCurrentDriver();
    }

    @After
    public void finishTest() {
        close();
    }

    public String getCurrentUrl()  {
        return getCurrentDriver().getCurrentUrl();
    }
}
