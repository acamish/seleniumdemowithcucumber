package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Amish on 3/28/2017.
 */
public class Page {

    WebDriver driver;

    public  Page(WebDriver driver, String relativeURL, String urlMessage, Object object){
        this.driver = driver;
        if(!driver.getCurrentUrl().contains(relativeURL)){
            throw new IllegalArgumentException("Not on " + urlMessage + " Current page is: " + driver.getCurrentUrl());
        }
        PageFactory.initElements(driver, object);
    }
}
