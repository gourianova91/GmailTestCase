package main.java.gmail_pages;

public class UIMapGmailPage {
    public static final String ComposeButtonXpath = "//div[contains(text(),'НАПИСАТЬ')]";
    public static final String ToFieldXpath = "//textarea[@name='to']";
    public static final String TextFieldXpath = "//div[@class='Ar Au']/div[@class='Am Al editable LW-avf']";
    public static final String SendButtonXpath = "//div[contains(text(),'Отправить')]";
    public static final String InboxButtonXpath = "//a[@href='https://mail.google.com/mail/u/0/#inbox']";
    public static final String NewMailXpath = "//div[@role='tabpanel']/div/div/table/tbody/tr[1]";
    public static final String BodyMailXpath = "//div[@dir='ltr']";
}
