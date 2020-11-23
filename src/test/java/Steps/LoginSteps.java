package Steps;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;
public class LoginSteps {

    WebDriver driver;
    LoginPage login;

    @Given("browser is open")
    public void testBrowserIsOpen() {
        System.setProperty("webdriver.chrome.driver", "C://Users/QMoor/Desktop/SeleCucumber.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @And("user is on login page")
    public void testUserIsOnLoginPage() {
        driver.get("https://example.testproject.io/web/");
        login = new LoginPage(driver);
    }
    @When("^user enters (.*) and (.*)$")
    public void testUserEntersUsernameAndPassword(String username, String password) {

        login.enterUserName(username);
        login.enterPassword(password);


    }
    @And("user clicks on login")
    public void testUserClicksOnLogin() {
         login.clickLogin();

    }



    @Then("user is navigated to home page")
    public void testUserIsNavigatedToHomePage() {
        login.checkLogoutIsDisplayed();
        login.closeDriver();


    }


}