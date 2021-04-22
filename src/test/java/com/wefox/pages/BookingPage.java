package com.wefox.pages;


import com.wefox.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
    public BookingPage() {
        PageFactory.initElements(Driver.get(), this);

    }
    @FindBy(xpath = "//a[@class='btn btn-primary btn-action btn-block']")
    WebElement invoiceButton;
}

