package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    protected WebDriver driver;
    LoginPage login;

    private By txt_username = By.id("name");
    private By txt_password = By.id("password");
    private By btn_login = By.id("login");
    private By btn_logout = By.id("logout");

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    public void enterUserName(String userName) {
        driver.findElement(txt_username).sendKeys(userName);


    }

    public void enterPassword(String password) {
        driver.findElement(txt_username).sendKeys(password);

    }

    public void clickLogin() {
        driver.findElement(btn_login).click();
    }

    public void clickLogout() {
        driver.findElement(btn_logout).click();
    }

    public void checkLogoutIsDisplayed(){
        driver.close();
    }
    public void closeDriver(){
        driver.close();
    }
}


