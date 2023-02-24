package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt"
        }, //bu şekilde test sounçlarını rapor haline getirebilirsin
        //rerun ifadesi failed olan test senaryolarını tekrar koşturmak için yazılır
        //target klasörü altında rerun.txt dosyası oluşturulur bu plugin sayesinde ve failed olan durumlar buraya not edilir bu dosyadaki failed olan durumları tekrar koşturmak için runners paketi içerisinde yeni bir runner class oluşturulur
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false, //kodu çalıştırmadan ihtiyacımız olan step definiton yani snippets'leri elde etmiş oluruz false dersek kodu çalıştırır ve sonunda snippets'leri belirler true dersek browser açarak kodu çalıştırır
        tags = "@femaleScientists"  //tags ifadesi feature dosyasının başına yazdığımız annotation değeri ile aynı olduğunda sadece bu feature dosyası çalıştırılır eğer buraya "librarian" yazarsam(stepdefiniton classında bir senaryonun başına bu tag name koydum) sadece o senaryo çalıştırılır
)
public class CukesRunner {
}
