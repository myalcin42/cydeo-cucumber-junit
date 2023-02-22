Feature: Examples of Cucumber data table implementations

  Scenario: List of fruits I like
    Then user should see fruits I like
    #eğer bir tek data değil de çoklu data testi yapmak istersek aşağıdaki gibi
        # oluşturabiliriz ve bu kodu çalıştırınca oluşacak snippet
    #@Then("user should see fruits I like")
    #    public void user_should_see_fruits_i_like(List<String> fruits) {
    #
    #    } bu metot olacak ve arguman olarak List<String> fruits girdiğimiz zaman otomatik olarak
    #burada girdiğimiz meyveler List içerisine eklenecek başka bişey yapmaya gerek yok
    #bu işlem DataTables olarak adlandırılır

      | kiwi        |
      | banana      |
      | cucumber    |
      | orange      |
      | mango       |
      | grape       |
      | pomegranate |
    #to beautify yani hizaya sokmak pipes above
  #control + alt + L


    #17.gün task 6 yı yapıyoruz
  @wip
  Scenario: User should be able to see all 12 months in months dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |