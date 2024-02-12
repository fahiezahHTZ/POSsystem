package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OriginalDriverManager {

    WebDriver driver;
/*
    public WebDriver generateDriver(String browser){

        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().cachePath("Drivers").setup();
           ChromeOptions options = new ChromeOptions();
           driver = new ChromeDriver(options);
            driver.manage().window().maximize();

        } else if (browser.equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().cachePath("Drivers").setup();

           FirefoxOptions options = new FirefoxOptions();
           driver = new FirefoxDriver(options);
            driver.manage().window().maximize();
        }
        return driver;
    }

 */
}
