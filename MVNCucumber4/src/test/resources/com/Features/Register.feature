Feature: Proof of concept that framework works

  # Scenario: Below scenario verifies that Register Page is displayed
  #  Given User is on Home page
  #  When User Request to Register
  #  Then Register Page is displayed
  
  @tagged
  Scenario: Below scenario verifies that an Unregistered user can creat an Account
    Given User is on Register page
    When User submit RP form as unregistered user
    Then an user account is created
    
 # Scenario: Below scenario verifies that a Facebook user can create an Account
  #  Given User is on Register page
  #  When User submit RP form as FaceBook user
  #  Then an user account is created
