@contactus
Feature: In order to contact to the store owner
As a site visitor
I want to go to  home page and click Contact us link, and enter full name, emailaddress,and write message in Enquiry textbox
and prees continue button.

Scenario Outline: Positive test
Given user visitting the home page
When user click the Contact Us link
And user enter Full Name,E-Mail Address
And user enter message from Enquiry
Then user click continue button


Examples:

|Full Nam|E-Mail Address  ||     Enquiry         |
|Fariha  |Abcweb@gmail.com||please see my message|