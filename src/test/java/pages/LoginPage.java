package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id="login:usernameDecorate:username")
    WebElement txtUserName;

    @FindBy(id="login:passwordDecorate:password")
    WebElement txtPassword;

    @FindBy(id="login:login")
    WebElement btnLogin;

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password)
    {
        txtUserName.sendKeys(username);
        txtPassword.sendKeys(password);
    }

    public void setUserName(String userName)
    {
        txtUserName.sendKeys(userName);
    }

    public void setPassword(String password)
    {
        txtPassword.sendKeys(password);
    }

    public void clickLogin()
    {
        btnLogin.click();
    }
}
