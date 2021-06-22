
#  buraya @tip yazarsak feature seviyesinde calistirabiliriz
#@tip
Feature: US1001_amazon_arama
#  class gibi dusunecegiz.
#  user story olarak dusunelim

#  ister feature ister scenario seviyesinbde calistirabilirz.
#  Test metodu gibi dusunecegiz

#  @wip  ==>#  working in progress//eger kapatmazsak bu notasyon nerde olursa bunlar birleikte calisir yoksa
  Scenario: TC01_AmazonAramaYapma


    Given kullanici amazon sayfasina gider
    And iPhone icin arama yapar
    Then sonuclarin iPhone icerdigini test eder

    Given kullanici amazon sayfasina gider
    And tea pot icin arama yapar
    Then sonuclarin tea pot icerdigini test eder

    Given kullanici amazon sayfasina gider
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder
    Then sayfayi kapatir

