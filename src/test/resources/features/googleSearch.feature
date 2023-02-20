Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page
  I should be able to search whatever I want and see relevant information

  Scenario: Search page title verification
    When user is on Google search page
    Then user should see title is Google
 #day 16 task1 yapıyoruz

  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types apple and clicks enter
    Then user sees apple in the google title
    #mesela burada google arama kutusunda apple arattık ama eğer başka bişey aratmak istersek
  #her defasında bu senaryoyu kopyala yapıştır yapmak gerekir işte bu yüzden bu işlemi
  #sadece datayı değiştirerek yapmak istersek parameterization yapmak zorundayız aşağıda ki
  #gibi aranacak kelimeyi "" içerisine alırız


  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types "apple" and clicks enter
    Then user sees "apple" in the google title


