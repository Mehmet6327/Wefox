package com.wefox.stepDefinitions;



import com.wefox.utilities.Driver;
import io.cucumber.core.gherkin.Scenario;
import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tthis is coming from BEFORE");
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario){
        Driver.closeDriver();
    }



}
