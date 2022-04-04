Feature: Login to leaftaps and create a lead
Scenario: Create a Lead
Given Launch Chrome browser
And Enter username as DemosalesManager
And Enter Password as CRMSFA
And click submit
And click CRMSFA hyperlink
And click on leads
And click on create lead
When add companyName as CTS
And add firstName as FName1
And add lastName as LName1
And click createLead
Then verify whether lead created successfully



