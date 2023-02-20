@Regression @smoke @login
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the library login page
    #Background tıpkı @BeforeMethod gibi çalışır her test senaryosundan önce önkoşul
  #olarak çalıştırılmak istenen durumlar buraya yazılır.O yüzden aşağıda test senaryolarının
  #içerisine yazdığımız bu ifadeyi yani Given user is on the library login page ifadesini
  #sileceğiz background sadece aynı feature içerisinde bulunan senaryolar için geçerlidir

  @librarian @employee #@wip "work in progress" bu annotation senin
    #ya da başka birisinin bu senaryo üzerinde çalıştığını gösterir
    #wip_munir de yazabilirsin mesela
  Scenario: Login as librarian
   # Given user is on the library login page yukarıda Background içerisine yazdığımız için
     # burada tekrar yazmaya gerek kalmadı
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
    #(Given user is on the library login page) yukarıda Background içerisine yazdığımız için
    # burada tekrar yazmaya gerek kalmadı
    #bu ifadeyi bir önceki test casede oluşturduğumuz için tekrar step_definiton da
    #tanımlamamıza gerek yok. step-definiton da aynı snippeti tekrar oluşturursak hata verir
    #çünkü "user is on the library login page" bu ifadenin aynısını arayıp çalıştıracağı
    #için birden fazla olursa hata verir.
    When user enters student username
    And user enters students password
    Then user should see the dashboard

  @admin @employee
  Scenario: Login as admin
   #Given user is on the library login page yukarıda Background içerisine yazdığımız için
   # burada tekrar yazmaya gerek kalmadı
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard

    #this is how we add comments in feature file

