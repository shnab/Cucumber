package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//RunWith,  Junit icinde oldugu icin cucumber kullandik. TestNG kullanmadik
@RunWith(Cucumber.class)
@CucumberOptions(
        //Bu notasyonun gorevi feature dosyalari ile stepdefinition dosylarini birlestirmektir
        //features="features folder path",
        //Cuycumber package ile package birbirine bagliyor.
        features= "src/test/resources/features",
        //stepDefinitions package ismiu
        glue="stepDefinitions",
        //boylece packageleri birbirine bagladik
        //bu iki paket altinda kac tane class olursa olsun herhandi bir clasta yazilan her aadim
        //diger classlardaki adimlarla uyusurssa yeni adim olusturmaya gerek kalmaz

        //tags="@istediginiz tag", TEstNG de gordugumuz group gibi calisir
        tags="@wip", //work in progress hangi feature veya senaryoyu calistiracagini bilmesi icin onemli
                    //Birden fazla feature ve Scenario calistirmak istedigimizde
                    // calistirtacagimiz feature ve Scenario lara ortak tag atamamiz ve bu tag i
                        //runner da belirmemiz gerekir

        dryRun=false
                        )

public class Runner {



}
