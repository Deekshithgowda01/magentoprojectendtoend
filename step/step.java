package step;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class step {

    public WebDriver driver;
    public WebDriver multibrowserlaunch(String browser)
    {
        if(browser.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
             driver=new ChromeDriver();
            return driver;
        }
        else if (browser.equals("edge"))
        {
            WebDriverManager.edgedriver().setup();
             driver=new EdgeDriver();
            return driver;

        }
        else
        {
            System.out.println("no browser");
        }
        return null;

            }

            public Actions mousehover()
            {
                Actions a=new Actions(driver);
                return a;
            }
            public WebDriverWait explicitwait()
            {
                WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
                return wait;
            }
}
