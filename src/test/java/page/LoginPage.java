package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Amish on 3/28/2017.
 */
public class LoginPage extends Page{

    @FindBy(id = "email")
    WebElement emailElement;

    @FindBy(id = "passwd")
    WebElement passwordElement;

    @FindBy(name = "login")
    WebElement loginElement;

    public LoginPage(WebDriver driver){
        super(driver, "demoaut", "Login Page", LoginPage.class);
    }

    public void login(String userName, String password){
        emailElement.sendKeys(userName, password);
        loginElement.click();
    }
}
