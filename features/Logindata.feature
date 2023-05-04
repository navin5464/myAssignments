Feature: Login to LeafTaps and Create a Lead
Scenario Outline:
Given Enter the username as DemoCsr
And Enter the password as crmsfa
Then Click on login button
And Click on the CRM/SFA Link
And Click on the Leads tab button
And Click on Create button
And Enter the CompanyName as <cname>
And Enter the First Name as <fname>
And Enter the Last Name as <lname>
When Click on the final Submit button
Then Verify if the Lead is created successfully <cname>
Examples:
|cname|fname|lname|
|cnx|mohamed|ashiq|
|Infosys|kamali|shree|
|TCS|sharath|kanna|