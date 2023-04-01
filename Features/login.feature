Feature: login

  @sanity
  Scenario: Successful Login with valid credentials
    Given User Launch Chrome browser
    When User open URL "https://www.saucedemo.com/"
    Then user enters Email as "standard_user" and pass "secret_sauce"
    Then click on login
    Then click on oprtions
    Then click on logout
    Then click on close browser


  @Regression
  Scenario Outline:  Login data driver
    Given User Launch Chrome browser
    When User open URL "https://www.saucedemo.com/"
    Then user enters Email as "<username>" and pass "<password>"
    Then click on login
    Then click on oprtions
    Then click on logout
    Then click on close browser

    Examples:
      |username|password|
      |standard_user|secret_sauce|
      |locked_out_user|secret_sauce|
      |problem_user|secret_sauce|
      |performance_glitch_user|secret_sauce|
