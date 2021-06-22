

#@wip
Feature: US1002_Amazon Background Kullanma

#  bu bir kpmnut degil, on bilgi. Bundan sonra yazilcak sey background olarak calisacak
# sayfa burada bir kere acildi, tekrar tekrar acmaya gerek kalmiyor bpylece
  Background: sayfayi acma
    Given kullanici amazon sayfasina gider

    @ali @veli
  Scenario: TC02_IPhone arama
    And iPhone icin arama yapar
    Then sonuclarin iPhone icerdigini test eder

    @smoke @miniregression
    Scenario: TC03_Tea pot arama testi
#      Given kullanici amazon sayfasina gider
      And tea pot icin arama yapar
      Then sonuclarin tea pot icerdigini test eder

      @smoke
    Scenario: TC04_Flower arama testi
#      Given kullanici amazon sayfasina gider
      And flower icin arama yapar
      Then sonuclarin flower icerdigini test eder
      And sayfayi kapatir