#Autor Carlos

Feature: Create new user
  As a user, I want create a user in the paltform Utest.com

  @scenario1
  Scenario: Create new user at the platform for testing
    Given that Carlos wants create a new user in the platform
    When he fill all inputs in the platform
      | strName | strLastName | strEmail                  | strMonth | strDay | strYear | strLanguage | strCity | strCodePostal | strCountry | strComputer | strVersionComputer | strLanguageComputer  | strMobile | strModelMobile | strOperatingSystem |
      | Carlos  | Buitrago    | carlobuitragoc5@gmail.com | October  | 22     | 1979    | Spanish     | Ibagué  | 730003        | Colombia   | Windows     | Windows 10         | Spanish              | Motorola  | Moto G6        | Android 9.0 (Pie)  |
    Then is confirmed the new user created
      | strButtonLastStep |
      | chevron_left     |





