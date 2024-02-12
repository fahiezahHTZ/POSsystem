package tests;

import base.BaseTest;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.loginpage;

public class loginTest extends BaseTest {


    @Test
    public void validLogin() throws InterruptedException {
        getDriver().get("https://shop.proxpos.com/login");
        loginpage lp = new loginpage(getDriver());
        Thread.sleep(3000);
        lp.enterUsername();
        lp.enterPassword();
        lp.clickOnSubmitBtn();

        Thread.sleep(3000);
    }

}
