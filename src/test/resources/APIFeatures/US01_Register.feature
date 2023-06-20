@US01Api @Api
Feature:Aday ogrenciler sisteme kayıt olabilmeli. API
  Scenario Outline: US01_Guest User
    Given tum guest userlar icin get request yap
    Then gelen bodyi dogrula : "<name>", "<surname>", "<birthplace>", "<phone>", "<gender>", "<Date Of Birth>", "<ssn>","<username>"
    Examples:
      | username | name | surname | birthplace | phone        | gender | Date Of Birth | ssn         |  |
      | john129  | John | Doe     | Ankara     | 333-555-1234 | 0      | 2023-06-01    | 333-66-0987 |  |

