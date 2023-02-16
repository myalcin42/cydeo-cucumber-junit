@Regression @smoke
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin

  @librarian @employee @wip #work in progress bu annotation senin
    #ya da başka birisinin bu senaryo üzerinde çalıştığını gösterir
    #wip_munir de yazabilirsin mesela
  Scenario: Login as librarian
    Given user is on the library login page
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard
    #şu an bu test senaryosunun step_definition kısmında
  #oluşturulan @Given("user is on the library login page") ifadesinde @Given annotasyonunun
  #kodun çalıştırılması açısından bir önemi yoktur.önemli olan Given user is on the library login
  #page ifadesi ile @Given("user is on the library login page") bu ifadedeki double quote
  #içerisinde bulunan ifadenin aynı olması gerektiğidir
  @student
  Scenario: Login as student

    When user enters student username
    And user enters students password
    Then user should see the dashboard

  @admin @employee
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard

    #this is how we add comments in feature file

