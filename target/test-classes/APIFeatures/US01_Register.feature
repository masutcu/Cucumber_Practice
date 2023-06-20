@US01Api @Api
Feature:Aday ogrenciler sisteme kayıt olabilmeli. API

  Scenario Outline: US01_Guest User
    Given tum guest userlar icin get request yap
    Then gelen bodyi dogrula "<name>", "<surname>", "<birthplace>", "<phone>", "<gender>", "<Date Of Birth>", "<ssn>","<username>"
    Examples:
      | username   | name | surname | birthplace | phone        | gender | Date Of Birth | ssn         |
      | alican.987 | Ali  | Can     | Ankara     | 333-555-1255 | MALE   | 2023-06-01    | 333-66-0922 |

  @US01_ApiNegative
  Scenario:US01_GuestUser Negative

    Given tum guest userlar icin get request yap
    Then username "alican.987" ile yapilan filtremenin bos oldugunu dogrula

