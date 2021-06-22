Feature: US1005_Amazon_Scenario_Uitline
  @wiprapor
  Scenario Outline: TC10_Amazon Coklu Arama

    Given kullanici amazon sayfasina gider
    Then "<Meyve>" icin arama yapar
    And sonuclarin "<Meyve>" icerdigini test eder

    Examples:
    |Meyve|
    |elma|
    |armut|
    |kavun|
    |karpuz|
    |kiraz|
    |visne|
