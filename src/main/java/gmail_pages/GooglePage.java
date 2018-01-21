package main.java.gmail_pages;

import main.tests.BaseTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage extends BasePage {
    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void mail_click(){
        BaseTestCase.driver.findElement(By.xpath(UIMapGooglePage.SignInButtonXpath)).click();
    }
    public void enter_email(){
        BaseTestCase.driver.findElement(By.xpath(UIMapGooglePage.EmailFieldXpath)).sendKeys("g6Y7S7em8Uiu7y@gmail.com");
        BaseTestCase.driver.findElement(By.xpath(UIMapGooglePage.IdentifierNextButtonXpath)).click();
    }
    public void enter_password(){
        BaseTestCase.driver.findElement(By.xpath(UIMapGooglePage.PasswordFieldXpath)).sendKeys("");
        BaseTestCase.driver.findElement(By.xpath(UIMapGooglePage.PasswordNextButtonXpath)).click();
    }
    public void click_on_gmail(){
        BaseTestCase.driver.findElement(By.xpath(UIMapGooglePage.GMailButtonXpath)).click();
    }
}
