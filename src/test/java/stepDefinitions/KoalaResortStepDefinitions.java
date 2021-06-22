package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class KoalaResortStepDefinitions {

    KoalaResortPage koalaResortPage = new KoalaResortPage();

    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
        koalaResortPage.login.click();
    }

    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        koalaResortPage.username.sendKeys(ConfigReader.getProperty("kr_valid_username"));
    }

    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        koalaResortPage.password.sendKeys(ConfigReader.getProperty("kr_valid_password"));
    }

    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        koalaResortPage.loginButton.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertEquals(ConfigReader.
                        getProperty("kr_basarili_giris_url"),
                Driver.getDriver().getCurrentUrl());
    }


    @Then("kullanici username olarak {string} girer")
    public void kullanici_username_olarak_girer(String username) {
        koalaResortPage.username.sendKeys(ConfigReader.getProperty(username));
    }

    @Then("kullanici password olarak {string} girer")
    public void kullanici_password_olarak_girer(String password) {
            koalaResortPage.password.sendKeys(ConfigReader.getProperty(password));
    }

    @Then("sayfaya giris yapamadigini kontrol eder")
    public void sayfaya_giris_yapamadigini_kontrol_eder() {
        Assert.assertTrue(koalaResortPage.loginErrorGirilemedi.isDisplayed());

    }




}
