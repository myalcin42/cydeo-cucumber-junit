package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false, //kodu çalıştırmadan ihtiyacımız olan step definiton yani snippets'leri elde etmiş oluruz false dersek kodu çalıştırır ve sonunda snippets'leri belirler
        tags = "@Regression" //tags ifadesi feature dosyasının başına yazdığımız annotation değeri ile aynı olduğunda sadece bu feature dosyası çalıştırılır eğer buraya "librarian" yazarsam(stepdefiniton classında bir senaryonun başına bu tag name koydum) sadece o senaryo çalıştırılır
)
public class CukesRunner {
}
