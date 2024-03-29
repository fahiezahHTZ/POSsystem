package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {

    WebDriver driver;
    public loginpage(WebDriver driver){
        this.driver = driver;
    }

    private final By username = By.xpath("//input[@type='text']");
    private final By pw = By.xpath("//input[@type='password']");
    private final By submitBtn = By.xpath("//button[@type='submit']");

    public void enterUsername(String uname){
        driver.findElement(username).clear();
       driver.findElement(username).sendKeys(uname);
    }
    public void enterPassword(String password){
        driver.findElement(pw).clear();
        driver.findElement(pw).sendKeys(password);
    }
    public void clickOnSubmitBtn(){
        driver.findElement(submitBtn).click();
    }

}
