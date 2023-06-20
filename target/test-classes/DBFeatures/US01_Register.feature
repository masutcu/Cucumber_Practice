@US01_DBTest
Feature: Aday ogrenciler sisteme kayıt olabilmelidirler

  Scenario Outline: US01_GuestUser
    Given "<username>" ile guest useri cagir
    Then body sunlari icermeli: "<name>", "<surname>", "<birthplace>", "<phone>", "<gender>", "<Date Of Birth>", "<ssn>","<username>","<password>"
    Examples:
      | username | name | surname | birthplace | phone        | gender | Date Of Birth | ssn         | password |
      | john129  | John | Doe     | Ankara     | 333-555-1234 | 0      | 2023-06-01    | 333-66-0987 | John.123 |


      #loop deneme seneryasu
  @LoopDB
  Scenario:
    Given  birthplace "batch129" ile guest useri cagir
    Then kac tane user oldugunu bul


  @databeseNegative
  Scenario: Silinen Guest useri dogrula
    Given silinen "JonhDoe11" ile guest useri cagir
    Then tablenin bos oldugunu dogrula