Feature: Free CRM Login feature

Scenario: user is able to create a new contact

Given user is already on Login Page
When title of login page is Free CRM
Then user clicks on first login button
Then user enters username and password
| username | password | 
| shivanand.5feb@gmail.com | Shibbu@775 |

#Then user enters "shivanand.5feb@gmail.com" and "Shibbu@775"  
#Then user enters "<username>" and "<password>"  
Then user clicks on login button
Then user is on home page

#Scenario Outline: user is able to create a new contact

#Given user is already on home page
When user clicks on contacts link
#Then user clicks on New Contact link
#Then user enters firstname and lastname
#Then user clicks on save button
#Then verify new contact created  
Then Close the browser

#Examples: 

	#| username | password | 
	#| shivanand.5feb@gmail.com | Shibbu@775 |
	#| shivanand.6feb@gmail.com | Shibbu@776 |
	#| shivanand.7feb@gmail.com | Shibbu@777 |
	
	