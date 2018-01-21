package main.java.gmail_pages;

import main.tests.BaseTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class GMailPage extends BasePage {

    public GMailPage(WebDriver driver) {
        super(driver);
    }

    public void compose_click(){
        BaseTestCase.driver.findElement(By.xpath(UIMapGmailPage.ComposeButtonXpath)).click();
    }

    public void new_letter(){
        BaseTestCase.driver.findElement(By.xpath(UIMapGmailPage.ToFieldXpath)).sendKeys("g6Y7S7em8Uiu7y@gmail.com");
        BaseTestCase.driver.findElement(By.xpath(UIMapGmailPage.TextFieldXpath)).sendKeys("Hello, world!");
        BaseTestCase.driver.findElement(By.xpath(UIMapGmailPage.SendButtonXpath)).click();
    }

    public void check_new_mail(){
        BaseTestCase.driver.findElement(By.xpath(UIMapGmailPage.InboxButtonXpath)).click();
    }

    public void open_new_mail(){
        BaseTestCase.driver.findElement(By.xpath(UIMapGmailPage.NewMailXpath)).click();
    }

    public String getEmailbody(){
        List<WebElement> elements = driver.findElements(By.xpath(UIMapGmailPage.BodyMailXpath));
        WebElement emailBodyElement = null;
        for (WebElement element: elements) {
            if (element.isDisplayed()) {
                emailBodyElement = element;
                break;
            }
        }
        if (emailBodyElement == null) {
            return "";
        }
        return emailBodyElement.getText();
    }

    public void check_text_in_mail(){
        String emailbody = getEmailbody();
        Assert.assertEquals(emailbody, "Hello, world!");
    }
}
