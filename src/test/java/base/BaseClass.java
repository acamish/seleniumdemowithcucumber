package base;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Amish on 3/28/2017.
 */
public class BaseClass {

    protected WebDriver driver;

    public WebDriver initializeDriver(){
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();

        return driver;
    }

    public void tearDown(){
        driver.quit();
    }
}
