package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));

    }

    @Given("iPhone icin arama yapar")
    public void i_phone_icin_arama_yapar() {

        amazonPage.searchBox.sendKeys("iPhone" + Keys.ENTER);
    }

    @Then("sonuclarin Iphone icerdigini test eder")
    public void sonuclarin_iphone_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("iPhone"));

    }

    @Given("tea pot icin arama yapar")
    public void tea_pot_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys("tea pot" + Keys.ENTER);
    }

    @Then("sonuclarin tea pot icerdigini test eder")
    public void sonuclarin_tea_pot_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("tea pot"));

    }

    @Given("flower icin arama yapar")
    public void flower_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys("flower" + Keys.ENTER);
    }

    @Then("sonuclarin flower icerdigini test eder")
    public void sonuclarin_flower_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("flower"));

    }

    @Then("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}
