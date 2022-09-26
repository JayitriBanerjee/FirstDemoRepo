Feature: Upload file using robot class feature

  @tag1
  Scenario: 
    Given user should be on the same page
    When user scrolls
    And user perform uploadfile action using robot keys
    Then user stays on the page

  @tag2
  Scenario: 
    Given user should be on the home page
    When user scrolls and click Alerts and Frame
    And user scroll again
    And user click Alerts
    And user perform Alert actions
    Then user stays on the same page
    
    
