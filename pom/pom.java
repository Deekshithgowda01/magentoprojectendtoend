package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom {

public WebDriver driver;

    public pom(WebDriver driver)
    {

        PageFactory.initElements(driver,this);
    }



    public   By signin= By.cssSelector(".panel.header>ul>li:nth-child(2)>a");

    public By email =By.cssSelector("input[name='login[username]']");

    public By password=By.cssSelector("input[name='login[password]']");

    @FindBy(css = "#send2")
    public WebElement signin2;
    @FindBy(css = ".navigation>ul>li:nth-child(3)>a")
    public WebElement men;
    @FindBy(css = ".navigation>ul>li:nth-child(3)>ul>li:nth-child(2)")
    public WebElement buttom;
    @FindBy(css = ".navigation>ul>li:nth-child(3)>ul>li:nth-child(2)>ul>li:nth-child(2)>a")
    public WebElement shorts;


    public By appoloshort=By.cssSelector(".product.details.product-item-details>strong>a[href='https://magento.softwaretestingboard.com/apollo-running-short.html']");

    @FindBy(css = "#option-label-size-143-item-175")
    public WebElement size;

    @FindBy(css = "#qty")
    public WebElement qty;
    @FindBy(css = "#product-addtocart-button")
    public WebElement addcart;

    @FindBy(css = "#option-label-color-93-item-49")
    public WebElement color;
    @FindBy(css = ".action.showcart")
    public WebElement addcartu;

    @FindBy(css = ".action.viewcart>span")
    public WebElement viewcart;

    public By pname=By.xpath("(//a[.='Apollo Running Short'])[2]");










}
