package com.wefox.pages;


import com.wefox.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage { public LoginPage(){
    PageFactory.initElements(Driver.get(), this);
}

    @FindBy(xpath="//input[@name='email']]")
    public WebElement email;


    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;


    @FindBy(xpath ="//button[@class='btn btn-primary btn-lg btn-block loginbtn']")
    public WebElement loginButton;


    public void login(String mail, String Password) {
        email.sendKeys(mail);
        password.sendKeys(Password);
        loginButton.click();

    }



}

