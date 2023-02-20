package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user types {word} and clicks enter")
    public void user_types_and_clicks_enter2(String searchKeyword) {
        googleSearchPage.searchBox.sendKeys(searchKeyword + Keys.ENTER);
        //tek kelime olursa {word} de kullanılabilir parameterize etmek için
    }

    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String searchKeyword) { //feature dosyasında "apple" yazdığımız için metodu bu şekilde oluşturdu "parameterization" yaptı yani
        googleSearchPage.searchBox.sendKeys(searchKeyword + Keys.ENTER);

    }
    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String string) {

        String expectedTitle = string + " - Google'da Ara"; //burada feature dosyasındaki işlemi dinamik yaptığımız için kodu dinamik hale getirdik
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title is not as expected", expectedTitle, actualTitle);
    }

    @When("user types apple and clicks enter")
    public void user_types_apple_and_clicks_enter() {

        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }
    @Then("user sees apple in the google title")
    public void user_sees_apple_in_the_google_title() {

        String expectedTitle = "apple - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();

        //Junit assertion accepts first arg as expected, second arg as actual but in TestNg it is opposite ve assertion fail olursa yazdıraqcağımız mesajı testng de sona yazarken junitde başa yazarız
        Assert.assertEquals("Title is not as expected", expectedTitle, actualTitle);
       // ya da Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {

        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);


    }


}
