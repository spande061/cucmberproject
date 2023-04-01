package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    @FindBy(xpath="//input[@name='user-name']")
    WebElement username;

    @FindBy(xpath="//input[@id='password']")
    WebElement password;

    @FindBy(xpath="//input[@name='login-button']")
    WebElement login;

    @FindBy(xpath="//button[@id='react-burger-menu-btn']")
    WebElement options;

    @FindBy(xpath="//a[@id='logout_sidebar_link']")
    WebElement logout;




    public LoginPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


    public void username(String Email) {
        //username.clear();
        username.sendKeys(Email);
    }

    public void password(String pass) {
        password.clear();
        password.sendKeys(pass);
    }

    public void login() {
        login.click();
    }

    public void oprtions() {
        options.click();
    }
    public void loginout() {
        logout.click();
    }


}
