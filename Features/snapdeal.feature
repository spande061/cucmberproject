Feature: snapdeal

  Scenario: buy shirt on snapdeal successfully
    Given when user enter the url"https://www.snapdeal.com/"
    Then user should navigate to the snapdeal home page
    Then search the shirt in the serch box
    Then select the shirt
    Then click on buy now CTA
