package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("user enters librarian username");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user should see the dashboard");
    }

    @When("user enters student username")
    public void user_enters_student_username() {

        System.out.println("user enters student username");
    }
    @When("user enters students password")
    public void user_enters_students_password() {

        System.out.println("user enters students password");
    }


    @When("user enters admin username")
    public void userEntersAdminUsername() {

        System.out.println("user enters admin username");

    }

    @And("user enters admin password")
    public void userEntersAdminPassword() { //feature classından otomatik oluşturursan kısayolla bu şekilde metot ismi yazılır ya da yukarıdaki gibi _ ile yazılmasını istersen runner classından yapılır

        System.out.println("user enters admin password");
    }

    //feature dosyasında yazılan when, and ,then sadece anlamlı bir akış oluşturmak için kullanılır bunun dışında kodun çalıştırılmasına bir etkisi yoktur önemli olan bu kavramlardan sonra yazılan ifadelerin stepdefinitions classında annotation yanında yer alan ifadelerle birebir eşleşmesidir
}
