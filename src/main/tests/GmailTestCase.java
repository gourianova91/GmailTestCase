package main.tests;

import main.java.gmail_pages.GMailPage;
import main.java.gmail_pages.Properties;
import main.java.gmail_pages.GooglePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailTestCase extends BaseTestCase {
    @BeforeTest
    @Override
    public void setUp() {
        super.setUp();
    }

    @Test
    public void testGmail() throws InterruptedException {
        GooglePage google = new GooglePage(driver);
        GMailPage gmail = new GMailPage(driver);
        navigate_to_page(Properties.Base_Url);
        google.mail_click();
        google.enter_email();
        Thread.sleep(3000);
        google.enter_password();
        Thread.sleep(3000);
        google.click_on_gmail();
        Thread.sleep(3000);
        gmail.compose_click();
        Thread.sleep(3000);
        gmail.new_letter();
        Thread.sleep(3000);
        gmail.check_new_mail();
        Thread.sleep(3000);
        gmail.open_new_mail();
        Thread.sleep(3000);
        gmail.check_text_in_mail();
        Thread.sleep(1000);
    }
}
