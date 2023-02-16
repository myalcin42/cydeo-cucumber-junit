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
    @Before(order = 0) //bu şekilde hangi Before önce çalışacak belirleyebiliriz
    public void setupScenario(){

        System.out.println("=====Setting up browser using cucumber @Before");
    }

    @Before (value = "@login", order = 1)//aynı anda 1 den fazla aynı annotation'dan oluşturulabilir Before yanına yazdığımız @login annotasyonunun aynısını login feature da yazdık o yüzden sadece o feature dosyasında çalışacak
    public void setupScenarioForLogins(){

        System.out.println("=====this will only apply to scenarios with @login tag");
    }

    @Before(value = "@db", order = -1)
    public void setupForDatabaseScenarios(){

        System.out.println("=====this will only apply to scenarios with @db tag");
    }

    @After
    public void teardownScenario(){
        System.out.println("========Closing browser using cucumber @After");
        System.out.println("========Scenario ended/ Take screenshot if failed!");
    }

    @BeforeStep //her adımdan önce birkez çalıştırılır user enters librarian username mesela bu adımdan önce çalıştırılır sonraki adıma geçtiğinde tekrar çalıştırılır
    public void setupStep(){

        System.out.println("-------------> applying setup using @BeforeStep");
    }

    @AfterStep //her adımdan sonra birkez çalıştırılır user enters librarian username mesela bu adımdan önce çalıştırılır sonraki adıma geçtiğinde tekrar çalıştırılır
    public void afterStep(){
        System.out.println("------------> applying tearDown using @AfterStep");
    }

}
