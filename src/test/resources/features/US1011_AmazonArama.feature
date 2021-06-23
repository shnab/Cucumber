Feature: US1011_Amazon Arama

  @amazonMehmet
  Scenario: TC15_Kullanici Amazonda Mehmet aratir.

    Given kullanici "amazon_url" sayfasina gider
    Then Today's deals sekmesine tiklar
    And Today's deals sayfasinda "Mehmet" icin arama yapar
   Then ilk ilan isminde "Mustafa" gectigini test eder
#    Then ilk ilan isminde "Mustafa" gectigini test eder
#    eger onceki adam fail olursa test orada durur


#    And  sayfayi kapatir
#  Burdaki sayfayi artik Hooks icinde bulunan Driver.close dan dolayi sayfayi kapatacak
#Package icinde herhangi bir classta Close varsa burasi onu kullanip sayfayi kapatacak.
#  yani once kendi sayfasina sonra parent sonra da package bakacak.
#  Cunku cucumber package seviseyinde feature ile baglandi. pACkage icinde bulursa kullanir.