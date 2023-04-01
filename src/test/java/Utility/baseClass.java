package Utility;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pageObject.LoginPage;

import java.util.Properties;

public class baseClass {

    public WebDriver driver;
    public LoginPage lp;
    public static Logger logger;
    public static Properties configpop;
}
