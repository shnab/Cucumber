Feature: US1001_amazon_arama
#  class gibi dusunecegiz.

#  ister feature ister scenario seviyesinbde calistirabilirz.
#  Test metodu gibi dusunecegiz
  @wip
  Scenario: TC01_AmazonAramaYapma


    Given kullanici amazon sayfasina gider
    And iPhone icin arama yapar
    Then sonuclarin Iphone icerdigini test eder

    Given kullanici amazon sayfasina gider
    And tea pot icin arama yapar
    Then sonuclarin tea pot icerdigini test eder

    Given kullanici amazon sayfasina gider
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder
    Then sayfayi kapatir

