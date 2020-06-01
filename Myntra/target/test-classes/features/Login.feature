Feature: Login on Myntra App

  @Login
  Scenario Outline: Successful login with Valid Credentials
    Given User is on Myntra Home Page
    When User clicks the Login button and enters "<username>" and "<password>"
    Then User Should be able to login
        Examples: 
      | username               |password  |
      | Rashikas331@gmail.com  | Demo@123 |
