package base;

import Constants.DriverType;
import factory.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {

    protected WebDriver driver;

    private void setDriver(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver getDriver(){
        return driver;
    }

    @BeforeTest
    @Parameters("browser")
    public void setUp(@Optional String browser)
    {
        if(browser==null) {
            browser = "CHROME";
        }

        setDriver(DriverManagerFactory.getManager(DriverType.valueOf(browser)).createDriver());
        /*
        OriginalDriverManager dr = new OriginalDriverManager();
       setDriver(dr.generateDriver(browser));

         */
    }

    @AfterTest
    public void tearDown(){
       getDriver().quit();
    }




}
