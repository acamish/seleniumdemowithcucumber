package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Amish on 3/28/2017.
 */
public class HomePage extends Page{

    @FindBy(css = "a[class='login']")
    WebElement loginElement;

    private WebDriver driver;
    public HomePage(WebDriver driver){
        super(driver, "automation", "Automation practice Home Page", HomePage.class);
    }

    public void getLoginPage(){
        loginElement.click();
    }
}
