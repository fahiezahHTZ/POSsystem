package tests;

import base.BaseTest;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.loginpage;
import utils.PropertyUtils;

import java.io.IOException;

public class loginTest extends BaseTest {


    @Test
    public void validLogin() throws InterruptedException, IOException {
        getDriver().get("https://shop.proxpos.com/login");
        loginpage lp = new loginpage(getDriver());
        Thread.sleep(3000);
        lp.enterUsername(PropertyUtils.propertyLoader().toString());
        lp.enterPassword(PropertyUtils.propertyLoader().toString());
        lp.clickOnSubmitBtn();

        Thread.sleep(3000);
    }

}
