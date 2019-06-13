package stepdefinitions;

import base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPage;

public class LoginSteps extends BaseUtil {
    private BaseUtil base;

    public LoginSteps(BaseUtil base)
    {
        this.base = base;
    }

    @Given("User has already navigated to the login page")
    public void user_has_already_navigated_to_the_login_page() {
        System.out.println("User is at login page.");
        base.driver.get("https://starwars.capsulecrm.com");
    }

    @Given("User enters username as {string}")
    public void user_enters_username_as(String username) {
        LoginPage page = new LoginPage(base.driver);
        System.out.println("User enters the username : "+username);
        //base.driver.findElement(By.id("login:usernameDecorate:username")).sendKeys(username);
        page.setUserName(username);
    }

    @Given("User enters password as {string}")
    public void user_enters_password_as(String password) {
        LoginPage page = new LoginPage(base.driver);
        System.out.println("User enters the password : "+password);
        //base.driver.findElement(By.id("login:passwordDecorate:password")).sendKeys(password);
        page.setPassword(password);
        Assert.assertTrue(true);
    }

    @Given("User clicks login button")
    public void user_clicks_login_button() {
        LoginPage page = new LoginPage(base.driver);
        System.out.println("User clicks the login button.");
        //base.driver.findElement(By.id("login:login")).click();
        page.clickLogin();
    }

    @Then("User reaches the home page")
    public void user_reaches_the_home_page() {
        System.out.println("Verify that user has reached home page.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(base.driver.findElement(By.xpath("//nav[@role='navigation']")).isDisplayed());
        System.out.println("User has reached the home page.");
    }
}
