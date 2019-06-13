package stepdefinitions;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BaseUtil{
    private BaseUtil base;

    public Hooks(BaseUtil base)
    {
        this.base = base;
    }

    @Before
    public void initialize()
    {
        WebDriverManager.chromedriver().setup();
        base.driver = new ChromeDriver();

        System.out.println("Driver is initialized.");
    }

    @After
    public void teardown(Scenario scenario)
    {
        System.out.println("Driver will be killed now.");
        base.driver.quit();
    }
}
