package stepDefinations;

import Utility.baseClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pageObject.LoginPage;
import pageObject.snapdeal;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class step11 extends baseClass {

    public WebDriver driver;
    public LoginPage lp;

    public snapdeal sp;

    @Before
    public void setup() throws IOException {
        configpop = new Properties() ;
        FileInputStream configProfile = new FileInputStream("config.properties");
        configpop.load(configProfile);


        logger= Logger.getLogger("cucumber");// added logger
        PropertyConfigurator.configure("log4j.properties");// Added logger

        String br = configpop.getProperty("browser");
        if(br.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver",configpop.getProperty("chromepath"));
            driver = new ChromeDriver();

        }else if(br.equals("edge")) {
            System.setProperty("webdriver.edge.driver", ".//drivers//msedgedriver.exe");
            driver = new EdgeDriver();
        }

    }



    @Given("User Launch Chrome browser")

    public void user_launch_chrome_browser () {
        lp = new LoginPage(driver);


        logger.info("*** broweser launchec****");
    }

    @When("User open URL {string}")
    public void user_open_url (String url){
        driver.get(url);

        logger.info("***url opened****");

    }

    @When("user enters Email as {string} and pass {string}")
    public void user_enters_email_as_and_pass (String Email, String pass){
        lp.username(Email);
        lp.password(pass);
        logger.info("*** username & password entered****");

    }

    @When("click on login")
    public void click_on_login () {
        lp.login();

        logger.info("*** logged in succesfully****");
    }

//	    @Then("page title should be {string}")
//	    public void page_title_should_be2(String title) {
//	        if (driver.getPageSource().contains("Login was unsuccessful")) {
//	            driver.close();
//	            Assert.assertTrue(false);
//	        } else {
//	            Assert.assertEquals(title, driver.getTitle());
    //
//	        }
//	    }

//	    @When("user click on Log out link")
//	    public void user_click_on_log_out_link() throws InterruptedException {
//	        lp.loginout();
//	        Thread.sleep(3000);
//	    }

    @When("click on oprtions")
    public void click_on_oprtions() throws InterruptedException {
        lp.oprtions();
        Thread.sleep(3000);
        logger.info("*** clicked on optoions****");
    }
    @When("click on logout")
    public void click_on_logout() {
        lp.loginout();
        logger.info("*** logout****");
    }
    @Then("click on close browser")
    public void click_on_close_browser() {
        driver.quit();
        logger.info("*** broweser closed****");
    }

//	     @Then("click on create new user")
//	 	public void click_on_create_new_user() throws InterruptedException {
//	 	   Thread.sleep(2000);
//
//	 		ru.newuser();
//	 	}


    @Given("when user enter the url\"https:\\/\\/www.snapdeal.com\\/\"")
    public void when_user_enter_the_url_https_www_snapdeal_com(String url) {
        sp= new snapdeal(driver);
        sp.geturl(url);
    }
    @Then("user should navigate to the snapdeal home page")
    public void user_should_navigate_to_the_snapdeal_home_page() {
        sp.homepage();
    }
    @Then("search the shirt in the serch box")
    public void search_the_shirt_in_the_serch_box() {
        sp.serch();
    }
    @Then("select the shirt")
    public void select_the_shirt() {
        sp.selectshirt();
    }
    @Then("click on buy now CTA")
    public void click_on_buy_now_cta() {

    }



}
