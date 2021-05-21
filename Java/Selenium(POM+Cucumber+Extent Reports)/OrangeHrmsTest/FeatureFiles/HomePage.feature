Feature: Check all the functionality of home Page

 Background: User goes through Successfully Login
 Given When user in present in  login page
 And enter credentials the credentials
 |Username| |Password|
  |admin|    |admin123|
  Then user should be able to  navigate to home page
  
  
  Scenario: Check the Admin Button
  Given when user is on homepage
  Then Click on Admin Button
   
  
  