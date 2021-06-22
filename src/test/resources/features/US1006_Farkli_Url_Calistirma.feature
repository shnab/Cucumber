Feature: US1006_Farkli URL Calistirma

  @rapor
  Scenario Outline: TC11_Url_Arama

    Given kullanici "<sayfaUrl>" sayfasina gider
#   Given kullanici "yandex_url" anasayfasina gider



    Examples:
    |sayfaUrl|
    |amazon_url|
    |yandex_url|
    |facebook_url|
