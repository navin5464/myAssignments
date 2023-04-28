Feature: Login to leaftaps application
Scenario: create a lead in leaftaps application
Given Launch the browser and open the url and maximise
And Enter the username as Democsr
And Enter the password as crmsfa
And click the login button 
When click the crmsfa link
And click on the lead button
And click on create button 
And enter the company name 
And enter the first name 
And enter the last name 
And enter the phname   
When click on submit button 
Then lead created successfully  