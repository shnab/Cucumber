#@wip
Feature: US1003_Yandex Arama

  Background: kullanici Yandex anasayfasina gider
   Given kullanici Yandex anasayfasina gider

    Scenario: TC05_IPhone arama
      When Yandex iPhone icin arama yapar
      Then Yandex sonuclarin Iphone icerdigini test eder

      Scenario:  TC06_tea pot arama
        When Yandex tea pot icin arama yapar
        Then Yandex sonuclarin tea pot icerdigini test eder
        And sayfayi kapatir

# 1- feature dosyasi olusturup, insan olarak yapacagim adimlari yaziyorum
# 2- Eksik step definition'lari elde etmek icin, testimizi calistiriyoruz
    # eger Feature dosyasindan calistirirsak calisan adimlari run eder ve eksik kalan adimlari bize verir
    # eger varolan adimlari calistirmadan direk eksik stepleri versin istiyorsak
    # runner'a gidip dryRun'i true yapariz, eksik stepleri aldiktan sonra yeniden false yapariz
# 3- eksik step'leri kopyalayip, stepDefinition class'ina yapistiririz
# 4- stepleri calistiracak Java kodlarimizi method'larin icine yazariz
# 5- Locate ihtiyacimiz olursa page class'i olusturur, gerekli locate'leri yapariz
      # step definition class'inda birden fazla method'da page objesini kullanacagim icin
      # page objesini class level'da (instance) olustururum