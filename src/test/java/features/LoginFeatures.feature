Feature: 1st Feature User able to login with valid password
  User should be able to login to the site

  @Positive
  Scenario: User login to the website with valid credentials
    Given User has already navigated to the login page
    And User enters username as "darthvader"
    And  User enters password as "Selenium12#"
    And  User clicks login button
    Then User reaches the home page

  @Negative
  Scenario: User login to the website with invalid credentials
    Given User has already navigated to the login page
    And User enters username as "darthvad"
    And  User enters password as "Selenium12#"
    And  User clicks login button
    Then User reaches the home pa