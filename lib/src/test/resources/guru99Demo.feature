Feature: guru99 demo features

  Background: 
    Given user is on login page
    When user enter username and password
    When user clicks on submit
    Then user is on same page

  @tag1
  Scenario Outline: 
    Given user should be logged in
    When click on selenium and select RadioButton
    And user click on RadioButton1
    And user click on RadioButton3
    Then user stays on same page

  @tag2
  Scenario Outline: 
    Given user should be logged in
    When user navigate to drag and drop page
    Then user perform drag and drop

  @tag3
  Scenario Outline: 
    Given user should be logged in
    When user navigate to uploadfile page
    And user perform uploadfile action using sendkeys
    Then user is on the same page

  @tag4
  Scenario Outline: 
    Given user should be logged in
    When user perform Confirmation Alert action
    Then user is on the same page

  @tag5
  Scenario Outline: 
    Given user navigates to Cookie handling page
    When user stores the cookie details in file
    Then user delete all cookies
