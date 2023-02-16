package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

/*
In the class we will be able to pass pre & post conditions to each scenario and each step
 */
public class Hooks {
    //Hooks bütün feature dosyalarında bulunan senaryoları etkiler ve specify etmediğin sürece burada yazdığın Before ve After içerisinde bulunan ifadeler çalıştırılır Background ise sadece belirttiğin feature dosyası içerisinde gereklidir
    //import from io.cucumber.java not from junit
    @Before
    public void setupScenario(){

        System.out.println("=====Setting up browser using cucumber @Before");
    }

    @After
    public void teardownScenario(){
        System.out.println("========Closing browser using cucumber @After");
        System.out.println("========Scenario ended/ Take screenshot if failed!");
    }

    @BeforeStep
    public void setupStep(){

        System.out.println("-------------> applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("------------> applying tearDown using @AfterStep");
    }

}
