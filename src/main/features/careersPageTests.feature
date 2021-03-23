Feature: Careers page tests

  @automated
  Scenario: Check if user can see all of the "Our Values" by clicking on them
    Given user opens careers page
    When user clicks on Modernization through data
    Then user can see Modernization through data value
    When user clicks on Variety and Fairness
    Then user can see Variety and Fairness value
    When user clicks on Transparency builds Trust
    Then user can see Transparency builds Trust value
    When user clicks on Xeneta is one
    Then user can see Xeneta is One value

  Scenario: Check if redirection works when user clicks on Oslo, Norway card image in "A Global Tribe" section
  Scenario: Check if redirection works when user clicks on New York, USA card image in "A Global Tribe" section
  Scenario: Check if redirection works when user clicks on Hamburg, Germany card image in "A Global Tribe" section
  Scenario: Check if redirection works when user clicks on a "Visit" link text under Oslo, Norway in "A Global Tribe" section
  Scenario: Check if redirection works when user clicks on a "Visit" link text under New York, USA in "A Global Tribe" section
  Scenario: Check if redirection works when user clicks on a "Visit" link text under Hamburg, Germany in "A Global Tribe" section
  Scenario: Check if user is able to see open application details and that a link text "Apply here and we'll be in touch!" redirection works correctly