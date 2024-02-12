package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CheckBrowserParameter {
    WebDriver driver;
    @BeforeMethod
    @Parameters("browser")
    public void parameterizedTest(String browser) {

        if (browser.equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options=new FirefoxOptions();
            options.addArguments("--start-maximized");
            driver=new FirefoxDriver(options);
            System.out.println("Browser Started :" + browser);

        } else if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--start-maximized");
            driver=new ChromeDriver(options);
            System.out.println("Browser Started :" + browser);
        }


    }


    @Test
    public void checkOpenBrowser() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(3000);
    }
}
