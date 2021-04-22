package com.wefox.stepDefinitions;

import com.wefox.pages.BookingPage;
import com.wefox.pages.LoginPage;
import com.wefox.utilities.ConfigurationReader;
import com.wefox.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Booking_StepDefinitions {

    WebDriver driver;
    LoginPage loginPage= new LoginPage();

    @Given("User is on the landing page")
    public void user_is_on_the_landing_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @Given("User is logged in")
    public void user_is_logged_in() {
        loginPage.login(ConfigurationReader.get("Email"),ConfigurationReader.get("Password"));




    }

    @When("User clicks hotel invoice button")
    public void user_clicks_hotel_invoice_button() {
        BookingPage booking= new BookingPage();

    }

    @Then("User should see the booking status")
    public void user_sould_see_the_booking_status() {

    }




}



