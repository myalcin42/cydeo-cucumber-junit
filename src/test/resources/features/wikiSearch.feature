Feature: Wikipedia search functionality and verifications

  #WSF-45234 sample ticket number

  Scenario: Wikipedia Search Functionality Title Verification
  Given User is on Wikipedia home page
  When User types "Steve Jobs" in the wiki search box
  And User clicks wiki search button
  Then User sees "Steve Jobs" is in the wiki title
    #sadece bu senaryoyu çalıştırmak istersek yanındaki çalıştır
  #düğmesini kullanabiliriz ama cukesrunner da daha kapsamlı bir
  #test koşusu yaptırılır

  Scenario: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees Steve Jobs is in the main header