package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by root on 3/29/17.
 */
public class MyAccountPage extends Page {

    @FindBy(css = "a[class='logout']")
    WebElement logoutElement;

    public MyAccountPage(WebDriver driver){
        super(driver, "account", "My Account Page", MyAccountPage.class);
    }
    public void logout(){
        logoutElement.click();
    }
}
