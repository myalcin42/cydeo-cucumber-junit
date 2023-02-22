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
    Then User sees "Steve Jobs" is in the main header


  Scenario: Wikipedia Search Functionality Image Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the image header

  @scenarioOutline #scenario outline ya da scenario template aşağıdaki formatta yapılır
    #html tablosu gibi oluşturulur ve farklı datalar bu şekilde test edilir
  Scenario Outline: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header

    Examples: search values we are going to be using in this scenario is as below
      |searchValue|expectedTitle|expectedMainHeader|
      |Steve Jobs |Steve Jobs   |Steve Jobs        |
      |Chuck Norris|Chuck Norris|Chuck Norris      |
      |Marie Curie |Marie Curie |Marie Curie       |
    #bu table altına başka bir table eklemek de mümkün mesela bu table başına @soccerplayers
  #denilir yeni oluşturduğunun başına @scientists denildiği zaman belirttiğin tagden hangisini
  #girersen o tage ait veriler test edilir