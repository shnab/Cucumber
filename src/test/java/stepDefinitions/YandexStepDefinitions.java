package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.YandexPage;
import utilities.ConfigReader;
import utilities.Driver;

public class YandexStepDefinitions {

    YandexPage yandexPage = new YandexPage();

    @Given("kullanici Yandex anasayfasina gider")
    public void kullanici_yandex_anasayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("yandex_url"));
    }

    @When("Yandex iPhone icin arama yapar")
    public void yandex_i_phone_icin_arama_yapar() {
        yandexPage.aramaKutusu.sendKeys("iPhone" + Keys.ENTER);

    }

    @Then("Yandex sonuclarin Iphone icerdigini test eder")
    public void yandex_sonuclarin_iphone_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));
    }

    @When("Yandex tea pot icin arama yapar")
    public void yandex_tea_pot_icin_arama_yapar() {
        yandexPage.aramaKutusu.sendKeys("tea pot" + Keys.ENTER);

    }

    @Then("Yandex sonuclarin tea pot icerdigini test eder")
    public void yandex_sonuclarin_tea_pot_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("tea pot"));
    }

//    @Given("kullanici {string} anasayfasina gider")
//    public void kullaniciAnasayfasinaGider(String sayfaUrl) {
//
//    }
}
