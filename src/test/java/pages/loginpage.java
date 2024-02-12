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

    public void enterUsername(){
        driver.findElement(username).clear();
       driver.findElement(username).sendKeys("admin");
    }
    public void enterPassword(){
        driver.findElement(pw).clear();
        driver.findElement(pw).sendKeys("12345678");
    }
    public void clickOnSubmitBtn(){
        driver.findElement(submitBtn).click();
    }

}
