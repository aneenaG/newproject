Feature:Login page test
Scenario:Sucessful login of user

Given user in home page
When user navigate to login page
And User enters "aneenageorgek@gmail.com" and "aneena123"
Then user navigate to talent page


Scenario:user should sucessfully logout

When user sucessfully logout
Then Message displayed Logout Successfully