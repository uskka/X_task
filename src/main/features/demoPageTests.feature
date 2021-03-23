Feature: Demo page tests

  @automated
  Scenario: Check if "watch videos" button works and redirects user to the correct website
    Given user goes to demo page
    When user clicks on "watch videos" button
    Then user has been redirected to watchdemos page

  @automated
  Scenario Outline: Check if user can fill in schedule a meeting popup with incorrect email form
    Given user goes to demo page
    When user clicks on schedule now button
    And user fills in first name field with <name>
    And user fills in last name field with <lastName>
    And user fills in Company name field with <companyName>
    And user fills in Business Email field with <businessEmail>
    And user clicks on a check box "Subscribe to Xeneta Industry Blog" <subscribeToXenetaIndustryBlog>
    And user clicks on a check box "I agree to Privacy Policy from Xeneta." <iAgreeToPravacyPolicy>
    And user clicks on "watch videos" button on the popup
    Then error message "Email must be formatted correctly." has appeared and user has not been redirected
    #And website admin makes sure that no form has been sent to the website
    Examples:
      | name | lastName | companyName   | businessEmail | subscribeToXenetaIndustryBlog | iAgreeToPravacyPolicy |
      | Olaf | Smith    | Super Company | 7.,/;{        | yes                           | yes                   |
      | Adam | III      | BoringCompany | /'][]=-@@     | no                            | yes                   |

  @automated
  Scenario: Check if user can close schedule a meeting popup with a button in top right corner
    Given user goes to demo page
    When user clicks on schedule now button
    And user clicks on X button top right corner
    Then popup has been closed

      #I have created test steps so you can see how easily you can use cucumber in creating negative test cases
  Scenario Outline: Check if user can schedule a meeting after clicking on "schedule now" button with any of the required fields not filled in
    Given user goes to https://www.xeneta.com/demo page
    When user clicks on "schedule now" button
    Then schedule a meeting popup has appeared
    And user fills in first name field with <name>
    And user fills in last name field with <lastName>
    And user fills in Company name field with <companyName>
    And user fills in Business Email field with <businessEmail>
    And user clicks on a check box "Subscribe to Xeneta Industry Blog" <subscribeToXenetaIndustryBlog>
    And user clicks on a check box "I agree to Privacy Policy from Xeneta." <iAgreeToPravacyPolicy>
    And user clicks on "watch videos" button
    And if recaptcha appeared user fixes it
    Then error message "Please complete this required field." has appeared and user has not been redirected
    And website admin makes sure that no form has been sent to the website
    Examples:
      | name | lastName | companyName   | businessEmail         | subscribeToXenetaIndustryBlog | iAgreeToPravacyPolicy |
      |      | Smith    | Super Company | a.s@superCompany.com  | yes                           | yes                   |
      | Olaf |          | BoringCompany | oooo@boringCompany.no | no                            | yes                   |
      | Olaf | Smith    |               | oooo@boringCompany.no | no                            | yes                   |
      | Olaf | Smith    | BoringCompany |                       | yes                           | yes                   |
      | Olaf | Smith    | BoringCompany | oooo@boringCompany.no | no                            | yes                   |
      | Olaf | Smith    | BoringCompany | oooo@boringCompany.no | no                            | no                    |

        #not automated because I didnt wanted to spam your email while programming tests
  Scenario: Check if user can schedule a meeting after clicking on "schedule now" button with correct data

  Scenario: Check if in schedule a meeting popup privacy policy link text near Bussines email label is working correctly

  Scenario: Check if in schedule a meeting popup privacy policy link text under "Subscribe to Xeneta Industry Blog" is working correctly

  Scenario: Check if data that has been filled in a book a meeting popup is saved after closing popup with a button and reopening it

  Scenario: Check if user can sign up for a live demo with all of the company types apart from "shipper/BCO" or "Freight forwarder"

  Scenario: Check if user can sign up for a live demo with company type "shipper/BCO"

  Scenario: Check if user can sign up for a live demo with company type "Freight Forwarder"

  Scenario: Check if user can sign up for a live demo with incorrect data or missing data in any of the fields

  Scenario: Check if privacy policy link texts work on sign up for a live demo popup

  Scenario: Check if user can close sign up for a live demo popup with a button in top right corner

  Scenario: Check if data that has been filled in a sign up for a live demo popup is saved after closing popup with a button and reopening it

  Scenario: Check if after user selects a company type of a shipper or freight forwarder additional fields properly appear

  Scenario: Check if after user selects a company type of a shipper or freight forwarder and then changes to "other" additional fields properly disappear