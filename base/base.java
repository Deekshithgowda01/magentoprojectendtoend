package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class base extends step.step {
    public Properties prop;
    public WebDriver driver;
    public pom po;

    @Test(priority=1)
    public void launch() {
         driver = multibrowserlaunch(prop.getProperty("browser"));
        driver.get(prop.getProperty("url"));

    }

    @BeforeClass
    public void prop() throws IOException {
        FileInputStream fil = new FileInputStream("C:\\Users\\deekshith.gowda\\Favorites\\intelijpractice\\interviewprep\\src\\main\\java\\config.properties");
         prop = new Properties();
        prop.load(fil);

    }
    @Test(priority = 2)
    public void signinapplication()
    {

         po=new pom(driver);
         driver.manage().window().maximize();
         explicitwait().until(ExpectedConditions.elementToBeClickable(po.signin)).click();
        explicitwait().until(ExpectedConditions.visibilityOfElementLocated(po.email)).sendKeys(prop.getProperty("email"));
        driver.findElement(po.password).sendKeys(prop.getProperty("password"));
        po.signin2.click();

    }
   @Test(priority = 3)
    public void ordercloth() throws InterruptedException {
    mousehover().moveToElement(po.men).moveToElement(po.buttom).moveToElement(po.shorts).click().build().perform();
explicitwait().until(ExpectedConditions.visibilityOfElementLocated(po.appoloshort)).click();
explicitwait().until(ExpectedConditions.visibilityOf(po.size)).click();
po.qty.clear();
po.qty.sendKeys(prop.getProperty("qty"));
po.color.click();
po.addcart.click();
Thread.sleep(3000);
po.addcartu.click();
po.viewcart.click();
Assert.assertEquals("Apollo Running Short",explicitwait().until(ExpectedConditions.visibilityOfElementLocated(po.pname)).getText());


    }


}
