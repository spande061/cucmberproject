package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class snapdeal {

    public WebDriver driver;

    @FindBy(xpath = "//span[@class='topHooks fastestDel lfloat fastestDelivery']")
    WebElement homepage;

    @FindBy(xpath = "//input[@id='inputValEnter']")
    WebElement Search;

   @FindBy(xpath = "//button[@class='searchformButton col-xs-4 rippleGrey']")
   WebElement serchclick;

    @FindBy(xpath = "(//a[@class='dp-widget-link noUdLine hashAdded'])[1]")
    WebElement clickShirt;



    public snapdeal(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void geturl(String url){
        driver.get(url);
    }
    public void homepage(){

        String HoomePgae=homepage.getText();
        Assert.assertEquals(HoomePgae,"clickShirt");
    }

    public void serch(){
        Search.click();
        Search.sendKeys("Shrits");
        serchclick.click();
    }

    public void selectshirt(){
        clickShirt.click();
    }

}

