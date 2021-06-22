Feature:US1008_Koala Resort Negatif Login

  @koalaResortNegatifLogin
  Scenario: TC11 kullanici gecersiz bilgilerle giris yapamaz


    Given kullanici "kr_url" sayfasina gider
    Then Log in yazisina tiklar
    And kullanici username olarak "kr_gecersiz_username" girer
    And kullanici password olarak "kr_gecersiz_password" girer
    And Login butonuna basar
    Then sayfaya giris yapamadigini kontrol eder
    And sayfayi kapatir

