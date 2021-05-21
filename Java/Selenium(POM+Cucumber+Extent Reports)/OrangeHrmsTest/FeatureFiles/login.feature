Feature: Login Page Functionality


Scenario: Check Login Functionlity

 Given When user in on login page
 And enter credentials
 |Username| |Password|
  |admin|    |admin123|
  
  Then user should navigate to home page
  
  
  @ForgotpasswordCheck
   Scenario: Check ForGot Password Functionality
  
    Given When user is on login page
    And user clicks on forgotpassword link
    Then user should navigate to forgot password page
    And user enter "admin" and  clicks on Reset password
    Then User should get the message "Please contact"
    
   
 
 